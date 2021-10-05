package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Product;

import java.util.List;
import java.util.Set;


public interface ProductServiceInterface {
    List<Product> getAllProduct();
    Product getIdProduct(int ProductId);

    Product add(Product product);

    Product deleteProduct(int id);

   public List<Product> findByCategories( String categories);



}
