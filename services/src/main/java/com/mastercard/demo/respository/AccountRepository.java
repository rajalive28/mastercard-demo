package com.mastercard.demo.respository;

import com.mastercard.demo.entities.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */

public interface AccountRepository extends CrudRepository<AccountEntity,Long> {

    AccountEntity findOneByAccountNo(Long accountNo);
    AccountEntity findOneByName(String name);
    AccountEntity findOneByNameAndPassword(String name,String password);
    List<AccountEntity> findAll();
}
