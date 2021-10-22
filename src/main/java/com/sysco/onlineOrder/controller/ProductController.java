package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.service.ProductServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({"/v1/online-order"})
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductServiceInterface productServiceInterface;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = null;

        try {
            products = productServiceInterface.getAllProduct();
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }


    @GetMapping("/products/category")
    @ResponseBody
    public ResponseEntity<List<Product>> findByCategories(@RequestParam(required = true) String categories) {
        List<Product> requestList = null;

        try {
            requestList = productServiceInterface.findByCategories(categories);
        } catch (Exception e) {
            LOGGER.error(Arrays.toString(e.getStackTrace()));
        }
        return new ResponseEntity<List<Product>>(requestList, HttpStatus.OK);

    }


    @GetMapping("/products/{productId}")
    @ResponseBody
    public ResponseEntity<List<Product>> getIdProduct(@PathVariable("productId") int productId) {
        List<Product> products = null;

        try {
            products = productServiceInterface.getIdProduct(productId);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

}
