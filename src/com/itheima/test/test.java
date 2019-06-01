package com.itheima.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;
import com.itheima.service.impl.CustomerServiceImpl;

public class test {
	
	//public ICustomerService cs = new CustomerServiceImpl();
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	ICustomerService cs = (ICustomerService) ac.getBean("customerService");
	
	//增
	@Test
	public void saveCustomer() {
		Customer c = new Customer();
		c.setCust_id((long)1234);
		c.setCust_name("save1234");
		cs.saveCustomer(c);
		System.out.println("save finished");
	}
	
	//删
	@Test
	public void deleteCustomer() {
		cs.deleteCustomer((long)98);
		System.out.println("delete finished");
	}
	
	//改
	@Test
	public void updateCustomer() {
		Customer c = new Customer();
		c.setCust_id((long)94);
		c.setCust_name("updated");
		cs.updateCustomer(c);
		System.out.println("update finished");
	}

	//查全部
	@Test
	public void findAllCustomer() {
		List<Customer> list = cs.findAllCustomer();
		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println("findAll finished");
	}
	
	
	//ID查
	@Test
	public void findCustomer() {
		Customer c = cs.findCustomer((long)94);
		System.out.println(c);
		System.out.println("find finished");
	}
}
