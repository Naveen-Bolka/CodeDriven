package com.nt.codedriven;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration()
@ComponentScan
public class JavaConfig {
	
	
	public JavaConfig() {
		super();
		System.out.println("JavaConfig 0 :: param constructor");
	}

	@Bean
	@Scope()
	public LocalDateTime localDateTime() {
		System.out.println("LocalDateTime 0 :: param constructor @Bean method");
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		return ldt;
	}

}
