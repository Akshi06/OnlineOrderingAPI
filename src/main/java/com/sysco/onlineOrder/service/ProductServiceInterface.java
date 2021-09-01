package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Product;

import java.util.List;

public interface ProductServiceInterface {
    List<Product> getAllProduct();

    Product getIdProduct(int ProductId);

    Product update(Product product);

    Product deleteProduct(int id);
}
