package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.repository.ProductRepository;
import com.sysco.onlineOrder.service.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplementation implements ProductInterface {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product>  getProductById(int productId) {
        return productRepository.findByProductId(productId);
    }


    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }


    @Override
    public List<Product> findByCategories(String categories) {
        return productRepository.findByCategories(categories);
    }


}
