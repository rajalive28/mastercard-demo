package com.mastercard.demo.services.impl;

import com.mastercard.demo.entities.AccountEntity;
import com.mastercard.demo.respository.AccountRepository;
import com.mastercard.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */
@Component
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    public AccountEntity getAccountInfo(Long accountNo) {
        AccountEntity oneByAccountNo = accountRepository.findOneByAccountNo(accountNo);
        return oneByAccountNo;
    }
}
