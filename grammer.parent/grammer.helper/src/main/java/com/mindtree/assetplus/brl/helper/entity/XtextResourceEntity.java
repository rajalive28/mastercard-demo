package com.mindtree.assetplus.brl.helper.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by M1020513 on 1/1/2017.
 */
@Entity
@Table(name = "xtext_resource")
public class XtextResourceEntity extends AbstractPersistable<Long> {

    @NotNull
    @NotBlank
    @Column(name = "resource_id")
    private String resourceId;

    @NotNull
    @Column(name = "content")
    private String content;

    @Column(name = "creation_time")
    private Date creationTime;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}
