package com.mypack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Address 
{
	@Value("101")
	private Integer  houseNo;
	@Value("Shobha villa")
	private String houseName;
	@Value("413001")
	private  String pinCode;
	
	
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", houseName=" + houseName + ", pinCode=" + pinCode + "]";
	}
	
	

	
}
