package com.mastercard.demo.entities;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */
@Entity
@Table(name = "accounts")
public class AccountEntity extends AbstractPersistable<Long> {
    @NotNull
    @NotBlank
    @Column
    private String name;
    @NotNull
    @NotBlank
    @Column
    private Long accountNo;
    @NotNull
    @NotBlank
    @Column
    private Double balance;
    @Column
    private String contactDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }


}
