package com.sblc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sblc.beans.Voter;

public class SpringBeanLifeCycleTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/sblc/cfgs/applicationContext.xml");
		
		
		Voter voter=ctx.getBean("voter",Voter.class);
		
		voter.chceckElligibility();
		
        ctx.close();		
	}

}
