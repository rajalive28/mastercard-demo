package com.mastercard.demo.controllers;

import com.mastercard.demo.entities.AccountEntity;
import com.mastercard.demo.model.AccountInfoResponse;
import com.mastercard.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


/**
 * @author Abhishek Raj on 28-Oct-17.
 */
@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/accountInfo/{accountNo}", method = RequestMethod.GET, produces = {APPLICATION_JSON_VALUE})
    public AccountEntity getAllAccountInfo(@PathVariable("accountNo") Long accountNo) {
        return accountService.getAccountInfo(accountNo);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/role/{name}/{password}", method = RequestMethod.POST, produces = {APPLICATION_JSON_VALUE})
    public AccountInfoResponse isAUser(@PathVariable("name") String name, @PathVariable("password") String password) {
        return accountService.authenticateUser(name,password);
    }


}
