package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.entity.OrderProduct;
import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.service.OrderProductInterface;
import com.sysco.onlineOrder.service.OrderInterface;
import com.sysco.onlineOrder.service.ProductInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping({"/v1/online-order"})
public class OrderProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private OrderProductInterface orderProductInterface;

    @Autowired
    private OrderInterface orderInterface;

    @Autowired
    private ProductInterface productInterface;


    /**
     * add order product
     *
     * @param productId productId
     * @param productQuantity productQuantity
     * @param orderId orderId
     * @return {@link ResponseEntity}
     * @see ResponseEntity
     * @see OrderProduct
     */
    @PostMapping("/order-product")
    @ResponseBody
    public ResponseEntity<OrderProduct> addTheOrderProduct(@RequestParam(required = false) int productId, Integer productQuantity, int orderId) {

        OrderProduct setOrderPEntity = new OrderProduct();
        OrderProduct orderedProduct = new OrderProduct();

        Product product1 =  productInterface.getProductById(productId);
        Order order = orderInterface.getOrderId(orderId);

        setOrderPEntity.setProductQuantity(productQuantity);
        setOrderPEntity.setProduct(product1);
        setOrderPEntity.setOrderDetail(order);

        try {
            orderedProduct = orderProductInterface.addTheOrderProduct(setOrderPEntity);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<OrderProduct>(orderedProduct, HttpStatus.OK);
    }

}
