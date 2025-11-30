package com.nt.codedriven;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaAppConfig {

	public static void main(String[] args){
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class)) {
			
			WishMessageGenerator wmg=context.getBean("wmg",WishMessageGenerator.class);
		
			String mes=wmg.message("Naveen");
			
		     System.out.println(mes);		
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
