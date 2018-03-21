package com.crm.customer.dao;

import java.util.List;

import com.crm.common.beans.Customer;

public interface ICustomerDao {

	List<Customer> selectCustomerList(Customer customer);

	Integer setCustomerListCount(Customer customer);

	int insertCustomer(Customer customer);

	Customer selectCustomerById(Integer id);

	int updateCustomer(Customer customer);

	int deleteCustomerById(Integer id);


}
