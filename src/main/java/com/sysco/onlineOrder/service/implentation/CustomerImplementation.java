package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.repository.CustomerRepository;
import com.sysco.onlineOrder.service.CustomerInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImplementation implements CustomerInterface {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductImplementation.class);


    @Autowired
    private CustomerRepository customerRepository;



    /**
     * get all customer
     *
     * @return {@link List}
     * @see List
     * @see Customer
     */
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }


    /**
     * get customer by id
     *
     * @param id id
     * @return {@link List}
     * @see List
     * @see Customer
     */
    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findByCustomerId(id);
    }

    @Override
    public Customer addTheCustomer(Customer customers) {
        return customerRepository.save(customers);
    }


}
