package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
