package com.crm.customer.service;

import com.crm.common.beans.Customer;
import com.crm.common.utils.Page;

public interface ICustomerService {

	Page<Customer> findCustomerList(Integer page, Integer rows, 
			String custName, String custSource, String custIndustry,
			String custLevel);

	int createCustomer(Customer customer);

	Customer getCustomerById(Integer id);

	int updateCustomer(Customer customer);

	int deleteCustomerById(Integer id);

}
