package org.apache.wiki;

import org.apache.taglibs.standard.ToplevelDependenciesAnchorForJSTLImplementation;
import org.apache.wiki.render.DefaultRenderingManager;
import rebound.annotations.semantic.meta.dependencies.DependencyClass;

@DependencyClass(ToplevelDependenciesAnchorForJSTLImplementation.class)
@DependencyClass(DependenciesOfWebXml.class)
@DependencyClass(DependenciesOfJSPTagLibrary.class)
@DependencyClass(DependenciesOfJSPWikiProperties.class)
@DependencyClass(DefaultRenderingManager.class)  //TODO put this in the "proper" configuration system when that's done!

public class ToplevelDependencyAnchorForManyWiki
{
}
