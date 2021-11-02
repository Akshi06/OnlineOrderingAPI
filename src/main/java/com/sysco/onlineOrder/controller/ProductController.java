package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.service.ProductInterface;
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
    private ProductInterface productInterface;

    /**
     * get all product
     *
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see List
     */
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = null;

        try {
            products = productInterface.getAllProduct();
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }



    /**
     * find by categories
     *
     * @param categories categories
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see List
     */
    @GetMapping("/products/category")
    @ResponseBody
    public ResponseEntity<List<Product>> findByCategories(@RequestParam(required = true) String categories) {
        List<Product> requestList = null;

        try {
            requestList = productInterface.findByCategories(categories);
        } catch (Exception e) {
            LOGGER.error(Arrays.toString(e.getStackTrace()));
        }
        return new ResponseEntity<List<Product>>(requestList, HttpStatus.OK);

    }


    /**
     * get id product
     *
     * @param productId productId
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see Product
     */
    @GetMapping("/products/{productId}")
    @ResponseBody
    public ResponseEntity< List<Product> >getProductById (@PathVariable("productId") int productId) {
     List <Product> products = null;

        try {
            products = productInterface.getProductById(productId);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity< List<Product> > (products, HttpStatus.OK);
    }

}
