package com.mastercard.demo.respository;

import com.mastercard.demo.entities.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abhishek Raj on 28-Oct-17.
 */

public interface AccountRepository extends CrudRepository<AccountEntity,Long> {

    AccountEntity findOneByAccountNo(Long accountNo);
    AccountEntity findOneByNameAndPassword(String name,String password);

}
