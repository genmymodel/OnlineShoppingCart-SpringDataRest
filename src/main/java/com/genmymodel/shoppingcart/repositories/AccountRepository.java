package com.genmymodel.shoppingcart.repositories;

import org.springframework.data.repository.CrudRepository;
import com.genmymodel.shoppingcart.domain.Account;



public interface AccountRepository  extends CrudRepository<Account,java.lang.Long>
{


}
