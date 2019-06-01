package com.itheima.test;

import java.util.List;

import org.junit.Test;

import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;
import com.itheima.service.impl.CustomerServiceImpl;

public class test {
	
	//public ICustomerService cs = new CustomerServiceImpl();
	
	//增
	@Test
	public void saveCustomer() {
		ICustomerService cs = new CustomerServiceImpl();
		Customer c = new Customer();
		c.setCust_id((long)123);
		c.setCust_name("save123");
		cs.saveCustomer(c);
		System.out.println("save finished");
	}
	
	//删
	@Test
	public void deleteCustomer() {
		ICustomerService cs = new CustomerServiceImpl();
		cs.deleteCustomer((long)98);
		System.out.println("delete finished");
	}
	
	//改
	@Test
	public void updateCustomer() {
		ICustomerService cs = new CustomerServiceImpl();
		Customer c = new Customer();
		c.setCust_id((long)94);
		c.setCust_name("updated");
		cs.updateCustomer(c);
		System.out.println("update finished");
	}

	//查全部
	@Test
	public void findAllCustomer() {
		ICustomerService cs = new CustomerServiceImpl();
		List<Customer> list = cs.findAllCustomer();
		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println("findAll finished");
	}
	
	
	//ID查
	@Test
	public void findCustomer() {
		ICustomerService cs = new CustomerServiceImpl();
		Customer c = cs.findCustomer((long)94);
		System.out.println(c);
		System.out.println("find finished");
	}
}
