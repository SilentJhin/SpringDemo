package com.itheima.dao.impl;

import java.util.List;

import com.itheima.domain.Customer;

/*
 * Dao层 操作数据库 
 */

public interface ICustomerDao {
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
