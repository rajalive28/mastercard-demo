package com.mastercard.demo.services.impl;

import com.mastercard.demo.entities.AccountEntity;
import com.mastercard.demo.entities.PayeeEntity;
import com.mastercard.demo.model.PayeeResponseVO;
import com.mastercard.demo.respository.AccountRepository;
import com.mastercard.demo.services.PayeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */
@Component
public class PayeeServiceImpl implements PayeeService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<PayeeResponseVO> getAllPayeesByAccount(Long accountNo) {
        AccountEntity oneByAccountNo = accountRepository.findOneByAccountNo(accountNo);
        List<PayeeEntity> payeeEntity = oneByAccountNo.getPayeeEntity();
        List<PayeeResponseVO> payeeResponseVOS;
            payeeResponseVOS=payeeEntity.stream().map(payee->{
                PayeeResponseVO payeeResponseVO = new PayeeResponseVO();
                payeeResponseVO.setContactDetails(payee.getContactDetails());
                payeeResponseVO.setAccountNo(payee.getAccountNo());
                payeeResponseVO.setName(payee.getName());
                return  payeeResponseVO;
            }).collect(Collectors.toList());

        return payeeResponseVOS;
    }
}
