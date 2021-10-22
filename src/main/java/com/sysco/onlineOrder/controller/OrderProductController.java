package com.sysco.onlineOrder.controller;

import com.sysco.onlineOrder.entity.Order;
import com.sysco.onlineOrder.entity.OrderProduct;
import com.sysco.onlineOrder.entity.Product;
import com.sysco.onlineOrder.service.OrderProductServiceInterface;
import com.sysco.onlineOrder.service.OrderServiceInterface;
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
public class OrderProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private OrderProductServiceInterface orderProductServiceInterface;
    @Autowired
    private OrderServiceInterface orderServiceInterface;
    @Autowired
    private ProductServiceInterface productServiceInterface;

    @GetMapping("/order-products")
    public ResponseEntity<List<OrderProduct>> getAllOrderProduct() {
        List<OrderProduct> orderProduct = null;
        try {
            orderProduct = orderProductServiceInterface.getAllOrderProduct();
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }

        return new ResponseEntity<List<OrderProduct>>(orderProduct, HttpStatus.OK);
    }

    /**
     * get data by using id
     *
     * @param orderProductId
     * @return
     */

    @GetMapping("OrderProducts/{id}")
    public ResponseEntity<List<OrderProduct>> getById(@PathVariable("id") int orderProductId) {
        List<OrderProduct> orderProduct = null;
        try {
            orderProduct = orderProductServiceInterface.getById(orderProductId);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<List<OrderProduct>>(orderProduct, HttpStatus.OK);
    }

    /**
     * take data in to database
     *
     * @param productId
     * @param productQuantity
     * @param orderId
     * @return
     */

    @PostMapping("/orderProduct")
    @ResponseBody
    public ResponseEntity<OrderProduct> add(@RequestParam(required = false) int productId, Integer productQuantity, int orderId) {


        OrderProduct setOrderPEntity = new OrderProduct();
        OrderProduct orderedProduct = new OrderProduct();
//        take productId
        Product product1 = (Product) productServiceInterface.getIdProduct(productId);
        //        take orderId
        Order order = (Order) orderServiceInterface.getOrderId(orderId);

        setOrderPEntity.setProductQuantity(productQuantity);
        setOrderPEntity.setProduct(product1);
        setOrderPEntity.setOrderDetail(order);

        try {
            orderedProduct = orderProductServiceInterface.add(setOrderPEntity);
        } catch (Exception ex) {
            LOGGER.error(Arrays.toString(ex.getStackTrace()));
        }
        return new ResponseEntity<OrderProduct>(orderedProduct, HttpStatus.OK);
    }

}
