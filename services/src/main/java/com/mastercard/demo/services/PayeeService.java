package com.mastercard.demo.services;

import com.mastercard.demo.model.PayeeResponseVO;

import java.util.List;

/**
 * @author Abhishek Raj on 31-Oct-17.
 */
public interface PayeeService {
    List<PayeeResponseVO> getAllPayeesByAccount(Long accountNo);
}
