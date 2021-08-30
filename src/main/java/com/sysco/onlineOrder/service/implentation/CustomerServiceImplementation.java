package com.sysco.onlineOrder.service.implentation;

import com.sysco.onlineOrder.entity.Customer;
import com.sysco.onlineOrder.repository.CustomerRepository;
import com.sysco.onlineOrder.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerServiceInterface {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer getIdCustomer(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer deleteCustomer(int id) {
        Customer delCustomerClass = null;
        try{
            delCustomerClass = customerRepository.findById(id).orElse(null);

           if (delCustomerClass == null){
               throw new Exception("Customer not found...!");
           }
           else {
               customerRepository.deleteById(id);
           }
        } catch (Exception e) {
            System.out.println("CustomerServiceImplementation.java");
        }
        return delCustomerClass;
    }
}
