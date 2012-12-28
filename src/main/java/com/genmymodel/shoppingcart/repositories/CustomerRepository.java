package com.genmymodel.shoppingcart.repositories;

import org.springframework.data.repository.CrudRepository;
import com.genmymodel.shoppingcart.domain.Customer;



public interface CustomerRepository  extends CrudRepository<Customer,java.lang.Long>
{


}
