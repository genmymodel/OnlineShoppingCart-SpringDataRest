package com.genmymodel.shoppingcart.repositories;

import org.springframework.data.repository.CrudRepository;
import com.genmymodel.shoppingcart.domain.Payment;



public interface PaymentRepository  extends CrudRepository<Payment,java.lang.Long>
{


}
