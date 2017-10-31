package com.mastercard.demo.model;

/**
 * @author Abhishek Raj on 31-Oct-17.
 */
public class PayeeResponseVO {

    String name;
    Long accountNo;
    String contactDetails;

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

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
