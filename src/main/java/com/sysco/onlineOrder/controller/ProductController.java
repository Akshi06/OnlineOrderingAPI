package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/online-order"})
public class ProductController {

    @Autowired
    private ProductServiceInterface productServiceInterface;

    @GetMapping("/product/all")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = null;

        try {
            products = productServiceInterface.getAllProduct();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getIdProduct(@PathVariable("ProductId") int ProductId) {
        Product products = null;

        try {
            products = productServiceInterface.getIdProduct(ProductId);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Product>(products, HttpStatus.OK);
    }
}
