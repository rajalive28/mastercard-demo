package com.mastercard.demo.entities;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Abhishek Raj on 28-Oct-17.
 * For the purpose of simplicity person and account entitites have been merged !!
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

    @NotNull
    @NotBlank
    @Column
    private String password;
    @Column
    private String contactDetails;


    @OneToMany(targetEntity = PayeeEntity.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "account_payee_join_table",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "payees_id"))
    private List<PayeeEntity> payeeEntity;

    public List<PayeeEntity> getPayeeEntity() {
        return payeeEntity;
    }

    public void setPayeeEntity(List<PayeeEntity> payeeEntity) {
        this.payeeEntity = payeeEntity;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
