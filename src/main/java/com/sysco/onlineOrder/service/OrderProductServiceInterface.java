package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.OrderProduct;

import java.util.List;

public interface OrderProductServiceInterface {
    List<OrderProduct> getAllOrderProduct();

    OrderProduct add(OrderProduct orderProduct);

//    OrderProduct deleteOrderProduct(int id);

}
