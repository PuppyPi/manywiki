package org.apache.wiki;

import rebound.annotations.semantic.meta.dependencies.DependencyClass;

@DependencyClass(org.apache.wiki.WikiServlet.class)
@DependencyClass(org.apache.wiki.ajax.WikiAjaxletDispatcher.class)
@DependencyClass(org.apache.wiki.attachment.AttachmentServlet.class)
@DependencyClass(org.apache.wiki.auth.SessionMonitor.class)
@DependencyClass(org.apache.wiki.ui.WikiJSPFilter.class)
@DependencyClass(org.apache.wiki.ui.WikiServletFilter.class)

//@DependencyClass(org.apache.wiki.bootstrap.WikiBootstrapServletContextListener.class)

//@DependencyClass(org.apache.wiki.rpc.atom.AtomAPIServlet.class)
//@DependencyClass(org.apache.wiki.xmlrpc.RPCHandler.class)
//@DependencyClass(org.apache.wiki.xmlrpc.RPCHandlerUTF8.class)
//@DependencyClass(org.apache.wiki.xmlrpc.RPCServlet.class)

public class DependenciesOfWebXml
{
}
