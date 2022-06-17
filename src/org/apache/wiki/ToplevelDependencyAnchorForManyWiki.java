package org.apache.wiki;

import rebound.annotations.semantic.meta.dependencies.DependencyClass;
import rebound.annotations.semantic.meta.dependencies.DependencyFile;

@DependencyClass(DependenciesOfWebXml.class)
@DependencyClass(DependenciesOfJSPTagLibrary.class)
@DependencyClass(DependenciesOfJSPWikiProperties.class)
@DependencyClass(org.apache.wiki.render.DefaultRenderingManager.class)  //TODO put this in the "proper" configuration system when that's done!
@DependencyFile("jspwiki.properties")
public class ToplevelDependencyAnchorForManyWiki
{
}
