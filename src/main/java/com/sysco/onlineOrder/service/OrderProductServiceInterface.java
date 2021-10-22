package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.OrderProduct;

import java.util.List;

public interface OrderProductServiceInterface {
    List<OrderProduct> getAllOrderProduct();

    List<OrderProduct> getById(int orderProductId);

    OrderProduct add(OrderProduct orderProduct);

}
