package com.nt.codedriven;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime date;

	public WishMessageGenerator() {
		super();
		System.out.println("WishMeesgaeGenerator 0:: param constructor");
	}
	
	public String message(String user) {
		int hours = date.getHour();
		
	      if(hours<12)
	    	  return "Good morning " + user;
	      
	      else if (hours<16)
	    	  return "Good afternoon " + user ;
	      
	      else if(hours<20)
	    	  return "Good evening " + user;
	      
	      else
	    	  return "Good night " + user;
		
	}
	
	

}
