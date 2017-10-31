package com.mastercard.demo.controllers;

import com.mastercard.demo.entities.AccountEntity;
import com.mastercard.demo.entities.PayeeEntity;
import com.mastercard.demo.model.PayeeResponseVO;
import com.mastercard.demo.services.PayeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author Abhishek Raj on 31-Oct-17.
 */
@RestController
@RequestMapping("/api")
public class PayeeController {

    @Autowired
    PayeeService payeeService;

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/payee/{accountNo}", method = RequestMethod.GET, produces = {APPLICATION_JSON_VALUE})
    public List<PayeeResponseVO> allPayees(@PathVariable("accountNo") Long accountNo) {
        return payeeService.getAllPayeesByAccount(accountNo);
    }

}
