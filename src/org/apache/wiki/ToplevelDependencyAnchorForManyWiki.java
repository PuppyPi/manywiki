package org.apache.wiki;

import rebound.annotations.semantic.meta.dependencies.DependencyClass;

@DependencyClass(DependenciesOfWebXml.class)
@DependencyClass(DependenciesOfJSPTagLibrary.class)
@DependencyClass(DependenciesOfJSPWikiProperties.class)
@DependencyClass(org.apache.wiki.render.DefaultRenderingManager.class)  //TODO put this in the "proper" configuration system when that's done!
public class ToplevelDependencyAnchorForManyWiki
{
}
