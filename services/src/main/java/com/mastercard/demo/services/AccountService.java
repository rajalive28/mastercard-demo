package com.mastercard.demo.services;

import com.mastercard.demo.entities.AccountEntity;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */
public interface AccountService {
    AccountEntity getAccountInfo(Long accountNo);
}
