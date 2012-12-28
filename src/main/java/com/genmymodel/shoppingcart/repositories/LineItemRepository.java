package com.genmymodel.shoppingcart.repositories;

import org.springframework.data.repository.CrudRepository;
import com.genmymodel.shoppingcart.domain.LineItem;



public interface LineItemRepository  extends CrudRepository<LineItem,java.lang.Long>
{


}
