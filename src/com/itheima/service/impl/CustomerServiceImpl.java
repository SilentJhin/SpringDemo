package com.itheima.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.ICustomerDao;
import com.itheima.dao.impl.CustomerDaoImpl;
import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

	@Resource(name="customerDao")
	private ICustomerDao customerDao;
	
	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	public void deleteCustomer(Long custId) {
		customerDao.deleteCustomer(custId);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}

	@Override
	public Customer findCustomer(Long custId) {
		return customerDao.findCustomer(custId);
	}

}
