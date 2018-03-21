package com.crm.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.crm.common.beans.Customer;
import com.crm.common.utils.Page;
import com.crm.customer.dao.ICustomerDao;
import com.crm.customer.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public Page<Customer> findCustomerList(Integer page, Integer rows, 
			String custName, String custSource,
			String custIndustry, String custLevel) {
		Customer customer = new Customer();
		if(!StringUtils.isEmpty(custName)){
			customer.setCust_name(custName);
		}
		if(!StringUtils.isEmpty(custSource)){
			customer.setCust_source(custSource);
		}
		if(!StringUtils.isEmpty(custIndustry)){
			customer.setCust_industry(custIndustry);
		}
		if(!StringUtils.isEmpty(custLevel)){
			customer.setCust_level(custLevel);
		}
		customer.setStart((page-1)*rows);
		customer.setRows(rows);
		List<Customer> customers = customerDao.selectCustomerList(customer);
		Integer total = customerDao.setCustomerListCount(customer);
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setSize(rows);
		result.setRows(customers);
		result.setTotal(total);
		return result;
	}

	@Override
	public int createCustomer(Customer customer) {
		return customerDao.insertCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Integer id) {
		return customerDao.selectCustomerById(id);
	}

	@Override
	public int updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	@Override
	public int deleteCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerById(id);
	}

}
