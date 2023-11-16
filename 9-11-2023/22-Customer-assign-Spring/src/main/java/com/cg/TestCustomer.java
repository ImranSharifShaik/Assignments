package com.cg;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Customer c = (Customer) context.getBean("cust");
		System.out.println(c);
		Account acc=(Account) context.getBean("accbean");
		Scanner s=new Scanner(System.in);
		System.out.println("enter id to update:");
		int result=s.nextInt();
		c.setId(result);
		acc.setCust(c);
		System.out.println(acc);
		
		
		
	}

}
