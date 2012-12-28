package com.genmymodel.shoppingcart.repositories;

import org.springframework.data.repository.CrudRepository;
import com.genmymodel.shoppingcart.domain.Product;



public interface ProductRepository  extends CrudRepository<Product,java.lang.Long>
{


}
