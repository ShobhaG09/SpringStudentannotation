package com.mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient 
{
	public static void main(String a[])
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("TestCfg.xml");
		Student student = applicationContext.getBean("s",Student.class);
		System.out.println(student);
		
	}

}
