package com.sysco.onlineOrder.service;


import com.sysco.onlineOrder.entity.CustomerAddress;

public interface CustomerAddressInterface {
    CustomerAddress getCustomerAddressById (int cusAddressId);

    CustomerAddress addTheCustomerAddress (CustomerAddress customerAddress);
}
