package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Product;

import java.util.List;


public interface ProductServiceInterface {
    List<Product> getAllProduct();

    List<Product> getIdProduct(int productId);

    Product add(Product product);

    List<Product> findByCategories(String categories);


}
