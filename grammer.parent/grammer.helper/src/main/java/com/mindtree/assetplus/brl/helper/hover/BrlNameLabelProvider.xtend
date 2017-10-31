package com.mindtree.assetplus.brl.helper.hover

import org.eclipse.xtext.ide.labels.INameLabelProvider;
import com.google.inject.Inject
/**
 * Created by M1020513 on 12/26/2016.
 */
class BrlNameLabelProvider implements INameLabelProvider {

    @Inject
    DocumentationProvider provider;

    override String getNameLabel(Object element) {
        return provider.getNameLabel(element);
    }
}