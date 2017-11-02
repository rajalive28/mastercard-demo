package com.mastercard.demo.model;

/**
 * @author Abhishek Raj on 02-Nov-17.
 */
public class AmountTransferRequestVO {

    private String payer;
    private String payee;
    private Double amount;

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
