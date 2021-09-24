package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.Product;

import java.util.List;

public interface ProductServiceInterface {
    List<Product> getAllProduct();
    Product getProductByCategories (String categories);
    Product getIdProduct(int ProductId);

    Product add(Product product);

    Product deleteProduct(int id);

}
