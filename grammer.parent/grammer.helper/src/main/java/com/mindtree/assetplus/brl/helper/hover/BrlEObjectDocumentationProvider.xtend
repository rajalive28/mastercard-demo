package com.mindtree.assetplus.brl.helper.hover

import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.emf.ecore.EObject;
import com.google.inject.Inject
/**
 * Created by M1020513 on 12/26/2016.
 */
class BrlEObjectDocumentationProvider implements IEObjectDocumentationProvider {

    @Inject
    DocumentationProvider provider;

    override String getDocumentation(EObject o) {
        return provider.getDocumentation(o);
    }
}