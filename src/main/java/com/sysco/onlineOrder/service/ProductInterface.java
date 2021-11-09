package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Product;

import java.util.List;


public interface ProductInterface {
    List<Product> getAllProduct();

    List<Product> getProductById(Integer productId);

    List<Product> findByCategories(String categories);


}
