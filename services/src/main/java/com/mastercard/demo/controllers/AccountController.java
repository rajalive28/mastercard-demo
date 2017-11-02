package com.mastercard.demo.controllers;

import com.mastercard.demo.entities.AccountEntity;
import com.mastercard.demo.model.*;
import com.mastercard.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public AccountEntity getAccountByAccountNo(@PathVariable("accountNo") Long accountNo) {
        return accountService.getAccountInfo(accountNo);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/role/{name}/{password}", method = RequestMethod.POST, produces = {APPLICATION_JSON_VALUE})
    public AccountInfoResponse isAUser(@PathVariable("name") String name, @PathVariable("password") String password) {
        return accountService.authenticateUser(name,password);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/accountInfo/all", method = RequestMethod.GET, produces = {APPLICATION_JSON_VALUE})
    public List<AccountEntity> getAllAccountsInfo() {
        return accountService.getAllAccountsInfo();
    }


    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/createRule", method = RequestMethod.POST, produces = {APPLICATION_JSON_VALUE})
    public CreateRuleResponseVO createRule(@RequestBody CreateRuleRequestVO createRuleRequestVO) {
        CreateRuleResponseVO createRuleResponseVO =  new CreateRuleResponseVO();

        if (!(createRuleRequestVO.getAccountNo().toString().isEmpty() &&
                createRuleRequestVO.getRuleContent().isEmpty())){
            return accountService.createRule(createRuleRequestVO);
        }else {
            createRuleResponseVO.setStatus("failed");
            createRuleResponseVO.setMessage("Incomplete parameters");
        }
    return createRuleResponseVO;

    }


    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/transfer", method = RequestMethod.POST, produces = {APPLICATION_JSON_VALUE})
    public AmountTransferResponseVO transferAmount(@RequestBody AmountTransferRequestVO amountTransferRequestVO) {
            return accountService.amountTransfer(amountTransferRequestVO);
    }




}
