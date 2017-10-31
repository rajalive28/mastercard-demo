package com.mindtree.assetplus.brl.helper

/**
 * Created by M1020513 on 1/1/2017.
 */
import com.google.inject.Inject
import java.io.IOException
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.web.server.IServiceContext
import org.eclipse.xtext.web.server.model.IWebDocumentProvider
import org.eclipse.xtext.web.server.model.IWebResourceSetProvider
import org.eclipse.xtext.web.server.model.IXtextWebDocument
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler
import org.eclipse.emf.common.util.WrappedException
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mindtree.assetplus.brl.helper.util.ApplicationContextUtil;
import com.mindtree.assetplus.brl.helper.repository.DatabaseBackedXtextResourceRepository;
import com.mindtree.assetplus.brl.helper.entity.XtextResourceEntity;
import org.eclipse.xtext.web.servlet.HttpSessionWrapper
import javax.servlet.http.HttpSession
class DatabaseResourceHandler implements IServerResourceHandler {

    private static val Logger LOGGER = LoggerFactory.getLogger(DatabaseResourceHandler);

    @Inject
    IWebResourceSetProvider resourceSetProvider;

    @Inject
    IWebDocumentProvider documentProvider;

    override get(String resourceId, IServiceContext serviceContext) throws IOException {
        var HttpSession httpSession;
        if (serviceContext.getSession instanceof HttpSessionWrapper) {
            httpSession =  (serviceContext.getSession as HttpSessionWrapper).getSession;
        }
        LOGGER.info(">>> Trying to get resource from session for resourceId: {}", resourceId);
        if (null != httpSession) {
            LOGGER.info(">>> Session ID was: {}", httpSession.getId);
        }
        try {
            val resourceSet = resourceSetProvider.get(resourceId, serviceContext);
            val uri = URI.createURI(resourceId);
            val resource = resourceSet.getResource(uri, true) as XtextResource
            return documentProvider.get(resourceId, serviceContext) => [
                setInput(resource)
            ]
        }catch(WrappedException exception) {
            throw exception.cause
        }
    }

    override put(IXtextWebDocument document, IServiceContext serviceContext) throws IOException {
        try {
            var HttpSession httpSession;
            if (serviceContext.getSession instanceof HttpSessionWrapper) {
                httpSession =  (serviceContext.getSession as HttpSessionWrapper).getSession;
            }
            val resourceId = document.getResourceId();
            LOGGER.info(">>> Trying to save resource to DB for resourceId: {}", resourceId);
            if (null != httpSession) {
                LOGGER.info(">>> Session ID was: {}", httpSession.getId);
            }
            val text = document.getText();
            val context = ApplicationContextUtil.getApplicationContext();
            val repository = context.getBean(DatabaseBackedXtextResourceRepository);
            val entity = repository.findOneByResourceId(resourceId);
            if(null != entity) {
                entity.setContent(text);
                repository.save(entity);
                LOGGER.info(">>> Updated existing resource with resourceId: {}. The text was: {}", resourceId, "\n" + text);
            } else {
                val entity1 = new XtextResourceEntity();
                entity1.setContent(text);
                entity1.setResourceId(resourceId);
                repository.save(entity1);
                LOGGER.info(">>> Created new resource with resourceId: {}. The text was: {}", resourceId, "\n" + text);

            }
        }catch(WrappedException exception) {
            throw exception.cause
        }
    }
}