package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.entity.OrderProduct;
import com.sysco.onlineOrder.repository.CustomerRepository;
import com.sysco.onlineOrder.repository.OrderProductRepository;
import com.sysco.onlineOrder.service.OrderProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderProductServiceImplementation implements OrderProductServiceInterface {

    @Autowired
    private OrderProductRepository orderProductRepository;

    @Override
    public List<OrderProduct> getAllOrderProduct() {
        return (List<OrderProduct> ) orderProductRepository.findAll();
    }

    @Override
    public OrderProduct add(OrderProduct orderProduct) {
        return orderProductRepository.save(orderProduct);
    }

//    @Override
//    public OrderProduct deleteOrderProduct(int id) {
//        OrderProduct delOrderProduct = null;
//        try {
//            delOrderProduct = orderProductRepository.findById(id).orElse(null);
//
//            if (delOrderProduct == null) {
//                throw new Exception("Customer not found...!");
//            } else {
//                orderProductRepository.deleteById(id);
//            }
//        } catch (Exception e) {
//            System.out.println("CustomerServiceImplementation.java");
//        }
//        return delOrderProduct;
//    }
}
