package com.itheima.test;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;
import com.itheima.service.impl.CustomerServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:bean.xml"})
public class test {
	
	@Resource(name="customerService")
	private ICustomerService cs;
	
	//增
	@Test
	public void saveCustomer() {
		Customer c = new Customer();
		c.setCust_id(321L);
		c.setCust_name("save123456789");
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
