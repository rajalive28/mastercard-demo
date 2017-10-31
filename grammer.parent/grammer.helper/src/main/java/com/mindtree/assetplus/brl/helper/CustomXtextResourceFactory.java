package com.mindtree.assetplus.brl.helper;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;

/**
 * Created by M1020513 on 12/30/2016.
 */
public class CustomXtextResourceFactory implements IResourceFactory {

    private Provider<CustomXtextResource> provider;

    @Inject
    public CustomXtextResourceFactory(Provider<CustomXtextResource> resourceProvider) {
        this.provider = resourceProvider;
    }

    @Override
    public Resource createResource(URI uri) {
        CustomXtextResource customXtextResource = provider.get();
        customXtextResource.setURI(uri);
        return customXtextResource;
    }
}
