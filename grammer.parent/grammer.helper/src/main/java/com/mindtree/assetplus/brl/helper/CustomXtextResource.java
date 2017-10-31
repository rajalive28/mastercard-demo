package com.mindtree.assetplus.brl.helper;

import com.mindtree.assetplus.brl.helper.entity.XtextResourceEntity;
import com.mindtree.assetplus.brl.helper.repository.DatabaseBackedXtextResourceRepository;
import com.mindtree.assetplus.brl.helper.util.ApplicationContextUtil;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.resource.XtextResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by M1020513 on 12/30/2016.
 */
public class CustomXtextResource extends XtextResource implements Resource {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomXtextResource.class);

    public void load(Map<?, ?> options) throws IOException {
        ApplicationContext context = ApplicationContextUtil.getApplicationContext();
        assert (null != ApplicationContextUtil.getApplicationContext());

        if (!isLoaded) {
            Map<?, ?> response = options == null ? null : (Map<?, ?>) options.get(URIConverter.OPTION_RESPONSE);
            if (response == null) {
                response = new HashMap<Object, Object>();
            }
            InputStream inputStream = null;
            try {
                DatabaseBackedXtextResourceRepository repository = context.getBean(DatabaseBackedXtextResourceRepository.class);
                XtextResourceEntity entity = repository.findOneByResourceId(getURI().toString());
                inputStream = new ByteArrayInputStream(entity.getContent().getBytes());
            } catch (Exception exception) {
                Notification notification = setLoaded(true);
                isLoading = true;
                if (errors != null) {
                    errors.clear();
                }
                if (warnings != null) {
                    warnings.clear();
                }
                isLoading = false;
                if (notification != null) {
                    eNotify(notification);
                }
                setModified(false);
                throw exception;
            }
            try {
                load(inputStream, options);
            } finally {
                inputStream.close();
                handleLoadResponse(response, options);
            }
        }
    }
}
