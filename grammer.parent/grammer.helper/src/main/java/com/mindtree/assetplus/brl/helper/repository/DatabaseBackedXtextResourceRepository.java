package com.mindtree.assetplus.brl.helper.repository;

import com.mindtree.assetplus.brl.helper.entity.XtextResourceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by M1020513 on 12/30/2016.
 */
public interface DatabaseBackedXtextResourceRepository extends CrudRepository<XtextResourceEntity, Long> {

    @Transactional(readOnly = true)
    XtextResourceEntity findOneByResourceId(String resourceId);

}
