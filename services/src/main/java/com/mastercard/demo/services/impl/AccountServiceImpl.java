package com.mastercard.demo.services.impl;

import com.mastercard.demo.entities.AccountEntity;
import com.mastercard.demo.entities.RuleEntity;
import com.mastercard.demo.model.*;
import com.mastercard.demo.respository.AccountRepository;
import com.mastercard.demo.services.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */
@Component
public class AccountServiceImpl implements AccountService  {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    AccountRepository accountRepository;

    public AccountEntity getAccountInfo(Long accountNo) {
        AccountEntity oneByAccountNo = accountRepository.findOneByAccountNo(accountNo);
        return oneByAccountNo;
    }

    @Override
    public List<AccountEntity> getAllAccountsInfo() {
        List<AccountEntity> allAccounts = accountRepository.findAll();
        return allAccounts;
    }

    @Override
    public CreateRuleResponseVO createRule(CreateRuleRequestVO createRuleRequestVO) {

        AccountEntity oneByAccountNo = accountRepository.findOneByAccountNo(createRuleRequestVO.getAccountNo());


        RuleEntity ruleEntity  = new RuleEntity();
        ruleEntity.setRuleId(UUID.randomUUID().toString());
        String ruleName=createRuleRequestVO.getRuleContent().split("\\{")[0].split("^rule")[1].trim();
        ruleEntity.setRuleName(ruleName);
        ruleEntity.setRuleContent(createRuleRequestVO.getRuleContent());

        if(oneByAccountNo.getRuleEntity().isEmpty()){
            List<RuleEntity> ruleEntities = new ArrayList<>();
            ruleEntities.add(ruleEntity);
            oneByAccountNo.setRuleEntity(ruleEntities);
        }else {
            oneByAccountNo.getRuleEntity().add(ruleEntity);
        }
        CreateRuleResponseVO createRuleResponseVO = new CreateRuleResponseVO();
        try {
            accountRepository.save(oneByAccountNo);
            createRuleResponseVO.setMessage("Rule added to the account");
            createRuleResponseVO.setStatus("success");
            return createRuleResponseVO;
        }catch (Exception e){
            e.printStackTrace();
        }
        createRuleResponseVO.setStatus("failed");
        createRuleResponseVO.setMessage("Unable to create rule");
        return  createRuleResponseVO;
    }

    @Override
    public AmountTransferResponseVO amountTransfer(AmountTransferRequestVO amountTransferRequestVO) {
        AmountTransferRequestVO amountTransferRequestVO1 = new AmountTransferRequestVO();
        String payer =amountTransferRequestVO.getPayer();
        String payee = amountTransferRequestVO.getPayee();
        Double amountToTransfer= amountTransferRequestVO.getAmount();

        return null;
    }


    @Override
    public AccountInfoResponse authenticateUser(String name, String password) {

        AccountEntity oneByNameAndPassword = accountRepository.findOneByNameAndPassword(name, password);
        AccountInfoResponse accountInfoResponse = new AccountInfoResponse();
        if(null!=oneByNameAndPassword && !oneByNameAndPassword.getName().isEmpty()){
            accountInfoResponse.setAccountNo(oneByNameAndPassword.getAccountNo());
            accountInfoResponse.setExists("true");
        }
        else{
            accountInfoResponse.setExists("false");
            accountInfoResponse.setAccountNo(0L);
        }

        return accountInfoResponse;
    }


}
