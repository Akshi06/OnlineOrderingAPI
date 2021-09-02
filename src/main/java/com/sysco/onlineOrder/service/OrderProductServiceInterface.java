package com.sysco.onlineOrder.service;

import com.sysco.onlineOrder.entity.OrderProduct;

import java.util.List;

public interface OrderProductServiceInterface {
 public List<OrderProduct> getAllOrderProduct();

 public OrderProduct add(OrderProduct orderProduct);

//    OrderProduct deleteOrderProduct(int id);

}
