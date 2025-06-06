package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext ("bean.xml");
		System.out.println("-----------Student---------");
		Student std = ap.getBean("stu",Student.class);
		System.out.println(std);
		
		System.out.println("\n---------Batch----------");
		Batch b = ap.getBean("batch", Batch.class);
		System.out.println(b);
		
		
		System.out.println("\n---------------Faculty-------------");
		Faculty f = ap.getBean("fac",Faculty.class);
		System.out.println(f);
		
		System.out.println("\n------------course--------------");
		Course c = ap.getBean("cou",Course.class);
		System.out.println(c);
		
		
		
	}
	
	
	
}
