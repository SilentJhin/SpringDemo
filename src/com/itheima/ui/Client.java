package com.itheima.ui;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;
import com.itheima.service.impl.CustomerServiceImpl;

public class Client {
	
	//public ICustomerService cs = new CustomerServiceImpl();
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	ICustomerService cs = (ICustomerService) ac.getBean("customerService");
	
	//增
	@Test
	public void saveCustomer() {
		System.out.println("save finished");
	}
	
	//删
	@Test
	public void deleteCustomer() {
		System.out.println("delete finished");
	}
	
	//改
	@Test
	public void updateCustomer() {
		System.out.println("update finished");
	}

	//查全部
	@Test
	public void findAllCustomer() {
		System.out.println("findAll finished");
	}
	
	
	//ID查
	@Test
	public void findCustomer() {
		System.out.println("find finished");
	}
}
