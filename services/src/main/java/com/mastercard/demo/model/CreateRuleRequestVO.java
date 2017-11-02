package com.mastercard.demo.model;

/**
 * @author Abhishek Raj on 01-Nov-17.
 */
public class CreateRuleRequestVO {

    Long accountNo;
    String ruleContent;

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }
}
