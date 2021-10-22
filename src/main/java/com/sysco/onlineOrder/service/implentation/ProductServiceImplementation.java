package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.repository.ProductRepository;
import com.sysco.onlineOrder.service.ProductServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImplementation implements ProductServiceInterface {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImplementation.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getIdProduct(int productId) {
        return productRepository.findById(productId);
    }


    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }


    @Override
    public List<Product> findByCategories(String categories) {

        List<Product> categoriesList = new ArrayList<>();

        for (Product product : getAllProduct()) {
            if (product.getCategories().equalsIgnoreCase(categories)) {
                categoriesList.add(product);
            }

        }
        return categoriesList;
    }


}
