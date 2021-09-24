package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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


//    ----------- RequestParam

    @GetMapping("/product/param")
    public List<Product> getCategories (@RequestParam (required = false) String categories) {
        if(categories == null){
            return  productServiceInterface.getAllProduct();
        }

        List<Product> productCategories = new ArrayList<>();

        Product product = productServiceInterface.getProductByCategories(categories);
        productCategories.add(product);
        return productCategories;

//        List<Product> products = null;
//
//        try {
//            products = productServiceInterface.getAllProduct(categories);
//        } catch (Exception ex) {
//            ex.getMessage();
//        }
//        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);

    }

    @GetMapping("/product/id/{id}")
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
