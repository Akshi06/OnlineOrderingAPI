package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.CustomerAddress;
import com.sysco.onlineOrder.repository.CustomerAddressRepository;
import com.sysco.onlineOrder.service.CustomerAddressInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerAddressImplementation implements CustomerAddressInterface {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerAddressImplementation.class);

    @Autowired
    private CustomerAddressRepository customerAddressRepository;


    @Override
    public List<CustomerAddress> getAllAddress() {
        return customerAddressRepository.findAllAddress();
    }

    @Override
    public List<CustomerAddress> getAddressById(int id) {
        return customerAddressRepository.findByAddress(id);
    }

    @Override
    public CustomerAddress addAddress(CustomerAddress customerAddress) {
        return customerAddressRepository.save(customerAddress);
    }
}
