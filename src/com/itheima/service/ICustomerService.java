package com.itheima.service;

import java.util.List;

import com.itheima.domain.Customer;

/*
 * 业务层 此层调用持久层
 */

public interface ICustomerService {
	/*
	 * 增
	 */
	void saveCustomer(Customer customer);
	
	/*
	 * 删
	 */
	void deleteCustomer(Long custId);
	
	/*
	 * 改
	 */
	void updateCustomer(Customer customer);
	
	/*
	 * 查询所有
	 */
	List<Customer> findAllCustomer();
	
	/*
	 * 根据ID查
	 */
	Customer findCustomer(Long custId);
}
