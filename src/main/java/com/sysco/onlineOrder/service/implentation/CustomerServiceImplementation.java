package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.repository.CustomerRepository;
import com.sysco.onlineOrder.service.CustomerServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerServiceInterface {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImplementation.class);


    @Autowired
    private CustomerRepository customerRepository;


    /**
     * take all customers
     *
     * @return
     */
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    /**
     * take customer by using cusId
     *
     * @param id
     * @return
     */

    @Override
    public List<Customer> getIdCustomer(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer add(Customer customers) {
        return customerRepository.save(customers);
    }

    /**
     * delete the customer by using cusId
     *
     * @param id
     * @return
     */

    @Override
    public List<Customer> deleteCustomer(int id) {
        List<Customer> delCustomerClass = null;
        try {
            delCustomerClass = customerRepository.findById(id);

            if (delCustomerClass == null) {
                throw new Exception("Customer not found...!");
            } else {
                customerRepository.deleteById(id);
            }
        } catch (Exception e) {
            LOGGER.error("CustomerServiceImplementation.java");
        }
        return delCustomerClass;
    }
}
