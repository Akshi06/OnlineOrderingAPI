package com.sysco.onlineOrder.service;


import com.sysco.onlineOrder.entity.CustomerAddress;

import java.util.List;

public interface CustomerAddressInterface {

    List<CustomerAddress> getAddressById (int id);

    CustomerAddress addAddress (CustomerAddress customerAddress);

}
