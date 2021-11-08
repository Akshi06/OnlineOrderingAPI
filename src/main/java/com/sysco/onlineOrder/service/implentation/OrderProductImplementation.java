package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.OrderProduct;
import com.sysco.onlineOrder.repository.OrderProductRepository;
import com.sysco.onlineOrder.service.OrderProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderProductImplementation implements OrderProductInterface {

    @Autowired
    private OrderProductRepository orderProductRepository;


    /**
     * add the order product
     *
     * @param orderProduct orderProduct
     * @return {@link OrderProduct}
     * @see OrderProduct
     */
    @Override
    public OrderProduct addTheOrderProduct(OrderProduct orderProduct) {
        return orderProductRepository.save(orderProduct);
    }


}