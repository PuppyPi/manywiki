package net.manywiki;

import static rebound.util.collections.BasicCollectionUtilities.*;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.manywiki.jee.TemporaryManyWikiRoot;
import net.manywiki.jee.actions.ManyWikiActionBean;
import net.manywiki.jee.actions.ManyWikiActionBeans;
import org.apache.wiki.WikiEngine;
import org.apache.wiki.ajax.WikiAjaxletDispatcher;
import rebound.annotations.semantic.temporal.concurrencyprimitives.threadspecification.AnyThreads;
import rebound.simplejee.AbstractHttpServlet;
import rebound.spots.SpotsDispatcher;
import rebound.util.collections.PairOrdered;
import rebound.util.functional.FunctionInterfaces.UnaryProcedure;

////////// THIS IS THE SOLE TOPLEVEL CLASS FOR MANYWIKI //////////

public class ToplevelForManyWiki
extends AbstractHttpServlet
{
	protected WikiEngine wikiEngine;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		////////// THIS IS THE SOLE TOPLEVEL INITIALIZATION PROCEDURE FOR MANYWIKI //////////
		
		super.init(config);
		
		this.wikiEngine = WikiEngine.getInstance(config);
	}
	
	
	
	@AnyThreads
	@Override
	public void serviceHttp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		////////// THIS IS THE SOLE TOPLEVEL ENTRYPOINT FOR ALL HTTP REQUESTS FOR MANYWIKI //////////
		
		String uri = request.getRequestURI();
		
		final String ajaxPrefix = "/ajax/";
		
		if (uri.startsWith(ajaxPrefix))
		{
			//All AJAX interactions!
			WikiAjaxletDispatcher.dispatch(wikiEngine, ajaxPrefix, request, response);
		}
		else
		{
			//All other interactions!
			// (delegates to a Spots ActionBean :3 )
			
			PairOrdered<Class<? extends ManyWikiActionBean>, String> p = getActionBeanClassAndViewResourcePathname(request.getRequestURI());  //getRequestURI() should really be getRequestURIPath() because it doesn't include the query string (which is the only thing it could include other than the path in HTTP!)
			
			Class<? extends ManyWikiActionBean> actionBeanClass = p.getA();
			String viewResourcePath = p.getB();
			
			UnaryProcedure<ManyWikiActionBean> initializeActionBean = bean ->
			{
				bean.setViewResourcePath(viewResourcePath);
				bean.setWikiEngine(wikiEngine);
			};
			
			SpotsDispatcher.dispatch(getServletConfig().getServletContext(), request, response, actionBeanClass, initializeActionBean, TemporaryManyWikiRoot.isLoggingAllHitsToServletLogs());
		}
	}
	
	
	
	public static PairOrdered<Class<? extends ManyWikiActionBean>, String> getActionBeanClassAndViewResourcePathname(String requestURIPath)
	{
		String actionBeanClassName = SpotsDispatcher.getActionBeanClassName(requestURIPath, ManyWikiActionBeans.ActionBeansPrefix, ManyWikiActionBeans.ActionBeansSuffix);
		String viewResourcePath = requestURIPath;  //Todo someday make it be "/wiki/(page)" not "/Wiki.jsp?page=(page)"  X'D
		
		return pair(SpotsDispatcher.getActionBeanClass(actionBeanClassName, ManyWikiActionBeans.DefaultActionBeanClass), viewResourcePath);
	}
}
