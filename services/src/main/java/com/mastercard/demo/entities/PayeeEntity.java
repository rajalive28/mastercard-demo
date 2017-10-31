package com.mastercard.demo.entities;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Abhishek Raj on 31-Oct-17.
 */
@Entity
@Table(name = "payees")
public class PayeeEntity extends AbstractPersistable<Long> {

    @NotNull
    @NotBlank
    private  Long accountNo;

    @NotNull
    @NotBlank
    private  String contactDetails;

    @NotNull
    @NotBlank
    private String name;

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
