package com.mastercard.demo.services.impl;

import com.mastercard.demo.entities.AccountEntity;
import com.mastercard.demo.entities.RuleEntity;
import com.mastercard.demo.model.*;
import com.mastercard.demo.respository.AccountRepository;
import com.mastercard.demo.services.AccountService;
import dsl.BankingScenarioAST;
import dsl.BankingScenarioRuleParser;
import org.apache.commons.jexl3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scala.collection.JavaConverters;
import scala.util.parsing.combinator.Parsers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */
@Component
public class AccountServiceImpl implements AccountService  {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    private static final JexlEngine jexl = new JexlBuilder().cacheThreshold(1024).cache(512).create();

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
        Parsers.ParseResult result = BankingScenarioRuleParser
                .parseSubstring(BankingScenarioRuleParser.rule(), createRuleRequestVO.getRuleContent());
        if (!result.successful()) {
            String msg = "The parser failed to parse the document. Incorrect syntax.";
            LOGGER.error(msg);
            LOGGER.error("Rule document content is: \n" + createRuleRequestVO.getRuleContent());
        }else {
            LOGGER.info("Rule Parsed Successfully Details are ");
            LOGGER.info("================================");
            BankingScenarioAST.Rule  rule = (BankingScenarioAST.Rule) result.get();
            LOGGER.info("RuleName: {}", rule.ruleName() );
        }
        if (!(result.get() instanceof BankingScenarioAST.Rule)) {
            LOGGER.error("Syntax error. Rule Document is not parseable.");
        }
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
        AmountTransferResponseVO amountTransferResponseVO = new AmountTransferResponseVO();
        String payer =amountTransferRequestVO.getPayer();
        String payee = amountTransferRequestVO.getPayee();
        Double amountToTransfer= amountTransferRequestVO.getAmount();
        AccountEntity accountEntityPayer = accountRepository.findOneByName(payer);
        AccountEntity accountEntityPayee = accountRepository.findOneByName(payee);
        if (accountEntityPayee == null || accountEntityPayer == null){
            LOGGER.info("Payer or Payee doesn't exists");
        }else {

            performTransaction(accountEntityPayee, accountEntityPayer, amountToTransfer);
        }
        executeRules(accountEntityPayee, amountToTransfer);
        amountTransferResponseVO.setStatus("success");
        amountTransferResponseVO.setMessage("successfully transfered");
        return amountTransferResponseVO;
    }

    private void executeRules(AccountEntity accountEntityPayee, Double amountToTransfer) {
        accountEntityPayee.getRuleEntity().forEach(ruleEntity -> {
            Parsers.ParseResult result = BankingScenarioRuleParser
                    .parseSubstring(BankingScenarioRuleParser.rule(), ruleEntity.getRuleContent());
            boolean ruleFired = evaluateRule((BankingScenarioAST.Rule) result.get(), accountEntityPayee, amountToTransfer);
            if (ruleFired){
                LOGGER.info("Rule Fired.");
                performAction((BankingScenarioAST.Rule) result.get(), accountEntityPayee);
            }
        });
    }

    private void performAction(BankingScenarioAST.Rule rule, AccountEntity accountEntityPayer) {
       List<BankingScenarioAST.Action> actionList= JavaConverters.seqAsJavaListConverter(rule.ruleBody().actions()).asJava();
       actionList.forEach(action -> {
           LOGGER.info("Found Payee in Rule Action");
           AccountEntity payee = accountRepository.findOneByName(action.payee().name().trim());
           if (action.actionVerb().trim().equalsIgnoreCase("transfer")){
               performTransaction(payee, accountEntityPayer,action.amount());
           }
       });
    }

    private void performTransaction(AccountEntity payee, AccountEntity accountEntityPayer, Double amountToTransfer) {
        accountEntityPayer.setBalance(accountEntityPayer.getBalance() - amountToTransfer);
        payee.setBalance(payee.getBalance() + amountToTransfer);
        accountRepository.save(accountEntityPayer);
        accountRepository.save(payee);
    }

    private boolean evaluateRule(BankingScenarioAST.Rule rule, AccountEntity accountEntityPayee, Double amountToTransfer) {
        String evalString = rule.ruleBody().condition().conditionalExpressionString();
        LOGGER.info("ConditionString is : {}", evalString);
        JexlExpression e = jexl.createExpression(evalString);
        JexlContext jc = new MapContext();
        jc.set("credits", amountToTransfer);
        return (boolean) e.evaluate(jc);
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
