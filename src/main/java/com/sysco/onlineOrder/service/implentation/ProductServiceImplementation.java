package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.repository.ProductRepository;
import com.sysco.onlineOrder.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductServiceInterface {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product getIdProduct(int ProductId) {
        return productRepository.findById(ProductId).orElse(null);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(int id) {
        Product deleteProduct = null;
        try {
            deleteProduct = productRepository.findById(id).orElse(null);

            if (deleteProduct == null) {
                throw new Exception("Product not found...!");
            } else {
                productRepository.deleteById(id);
            }
        } catch (Exception e) {
            System.out.println("ProductServiceImplementation.java");
        }
        return deleteProduct;
    }
}
