package com.sblc.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public class Voter {
	
	
	@Value("${voter.age}")
	private int age;
	
	@Value("${voter.name}")
	private String name;
	private Date verificationDate;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Voter() {
		super();
		System.out.println("Voter 0::param constructor");
	}
	
	public void init() throws Exception {
		

		
		if (age<=0 && name==null) 
			throw new IllegalArgumentException("The voter may entered wrong values for the age or name "+ age);
		
	}
	
	public void chceckElligibility() {
		
		this.verificationDate = new Date(); 
		
		if(age<18) {
			System.out.println("The voter " + name + " is not elligible to vote wait " 
		+ (18 - age) + " years to cast your vote -->" + verificationDate);
		
		}
		else {
			System.out.println("Hello voter : " + name + " your are elligible to vote");
		}
			
		
	}
	
	public void destroy() {
		
		System.out.println("destroy lif-cycle method of srping bean");
		age=0;
		name=null;
		
	}

}
