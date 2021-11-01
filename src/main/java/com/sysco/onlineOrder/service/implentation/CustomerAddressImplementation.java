package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.controller.CustomerController;
import com.sysco.onlineOrder.entity.CustomerAddress;
import com.sysco.onlineOrder.repository.CustomerAddressRepository;
import com.sysco.onlineOrder.service.CustomerAddressInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerAddressImplementation implements CustomerAddressInterface {
    @Autowired
    private CustomerAddressRepository customerAddressRepository;


    /**
     * get customer address by id
     *
     * @param cusAddressId cusAddressId
     * @return {@link CustomerAddress}
     * @see CustomerAddress
     */
    @Override
    public CustomerAddress getCustomerAddressById(int cusAddressId) {
        return customerAddressRepository.findByCustomerAddressId(cusAddressId);
    }

    @Override
    public CustomerAddress addTheCustomerAddress(CustomerAddress customerAddress) {
        return customerAddressRepository.save(customerAddress);
    }
}
