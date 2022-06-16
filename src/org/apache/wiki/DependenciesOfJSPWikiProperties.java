package org.apache.wiki;

import org.apache.wiki.providers.FileSystemProvider;
import org.apache.wiki.providers.VersioningFileProvider;
import rebound.annotations.semantic.meta.dependencies.DependencyClass;

//@DependencyClass(org.apache.lucene.analysis.standard.ClassicAnalyzer.class)  //Is this bitrotted??
@DependencyClass(org.apache.wiki.auth.acl.DefaultAclManager.class)
@DependencyClass(org.apache.wiki.auth.authorize.WebContainerAuthorizer.class)
@DependencyClass(org.apache.wiki.auth.authorize.XMLGroupDatabase.class)
@DependencyClass(org.apache.wiki.auth.login.UserDatabaseLoginModule.class)
@DependencyClass(org.apache.wiki.auth.user.JDBCUserDatabase.class)
@DependencyClass(org.apache.wiki.auth.user.XMLUserDatabase.class)
@DependencyClass(org.apache.wiki.htmltowiki.syntax.jspwiki.JSPWikiSyntaxDecorator.class)
@DependencyClass(org.apache.wiki.parser.JSPWikiMarkupParser.class)
@DependencyClass(org.apache.wiki.render.WysiwygEditingRenderer.class)
@DependencyClass(org.apache.wiki.render.XHTMLRenderer.class)
@DependencyClass(org.hsqldb.jdbc.JDBCDriver.class)

//jspwiki-custom.properties!
@DependencyClass(FileSystemProvider.class)
@DependencyClass(VersioningFileProvider.class)

public class DependenciesOfJSPWikiProperties
{
}
