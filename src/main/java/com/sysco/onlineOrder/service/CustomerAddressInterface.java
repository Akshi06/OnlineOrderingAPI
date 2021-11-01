package com.sysco.onlineOrder.service;


import com.sysco.onlineOrder.entity.CustomerAddress;

public interface CustomerAddressInterface {

    CustomerAddress getAddressById (int id);

    CustomerAddress addAddress (CustomerAddress customerAddress);

}
