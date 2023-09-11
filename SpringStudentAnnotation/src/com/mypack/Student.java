package com.mypack;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "s")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student 
{
	@Value("12")
	private Integer studRollNo;
	@Value("Shobha")
	private String studName;
	@Value("8007671334")
	private Double studContact;
	@Autowired
	private Address studAddress;
	@Value("56.65")
	private Float studPercentage;

	@Override
	public String toString() 
	{
		System.out.println("------------------------------------------------");
		System.out.println(" ***************Student Details*************** ");
		return "\n studRollNo = " + studRollNo + "\n studName = " + studName + "\n studContact = " + studContact
				+  "\n studAddress = " + studAddress + "\n studPercentage = "
				+ studPercentage ;
	}
}
