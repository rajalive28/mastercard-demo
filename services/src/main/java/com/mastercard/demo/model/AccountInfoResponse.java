package com.mastercard.demo.model;

/**
 * @author Abhishek Raj on 29-Oct-17.
 */
public class AccountInfoResponse {
    private  Long accountNo;
    private  String exists;

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getExists() {
        return exists;
    }

    public void setExists(String exists) {
        this.exists = exists;
    }
}
