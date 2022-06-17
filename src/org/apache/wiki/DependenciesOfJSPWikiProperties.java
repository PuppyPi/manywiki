package org.apache.wiki;

import org.apache.wiki.diff.ContextualDiffProvider;
import org.apache.wiki.diff.ExternalDiffProvider;
import org.apache.wiki.diff.TraditionalDiffProvider;
import org.apache.wiki.providers.BasicAttachmentProvider;
import org.apache.wiki.providers.CachingAttachmentProvider;
import org.apache.wiki.providers.FileSystemProvider;
import org.apache.wiki.providers.VersioningFileProvider;
import org.apache.wiki.search.BasicSearchProvider;
import org.apache.wiki.search.LuceneSearchProvider;
import rebound.annotations.semantic.meta.dependencies.DependencyClass;
import rebound.annotations.semantic.meta.dependencies.DependencyFile;

@DependencyFile("org/apache/wiki/util/jspwiki.properties")

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

@DependencyClass(FileSystemProvider.class)
@DependencyClass(VersioningFileProvider.class)

@DependencyClass(BasicAttachmentProvider.class)
@DependencyClass(CachingAttachmentProvider.class)

@DependencyClass(TraditionalDiffProvider.class)
@DependencyClass(ContextualDiffProvider.class)
@DependencyClass(ExternalDiffProvider.class)

@DependencyClass(BasicSearchProvider.class)
@DependencyClass(LuceneSearchProvider.class)
//@DependencyClass(TikaSearchProvider.class)
//@DependencyClass(KendraSearchProvider.class)

public class DependenciesOfJSPWikiProperties
{
}
