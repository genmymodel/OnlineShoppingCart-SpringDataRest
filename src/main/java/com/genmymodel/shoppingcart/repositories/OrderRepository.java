package com.genmymodel.shoppingcart.repositories;

import org.springframework.data.repository.CrudRepository;
import com.genmymodel.shoppingcart.domain.Order;



public interface OrderRepository  extends CrudRepository<Order,java.lang.Long>
{


}
