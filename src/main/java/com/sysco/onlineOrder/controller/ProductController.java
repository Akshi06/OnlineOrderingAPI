package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({"/v1/online-order"})
public class ProductController {

    @Autowired
    private ProductServiceInterface productServiceInterface;


    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = null;

        try {
            products = productServiceInterface.getAllProduct();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }


    @GetMapping("/product/get")
    @ResponseBody
    public ResponseEntity<List<Product>> findByCategories(@RequestParam(required = false) String categories) {
        List<Product> requestList = null;

        try {
            requestList = productServiceInterface.findByCategories(categories);
        } catch (Exception e) {
            e.getMessage();
        }
        return new ResponseEntity<List<Product>>(requestList, HttpStatus.OK);

    }


    @GetMapping("/product/{ProductId}")
    @ResponseBody
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
