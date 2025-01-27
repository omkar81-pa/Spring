package com.nt.sbean;



import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerater {  
	
	@Autowired
	@Qualifier("ld")
	private LocalDateTime ldt;

	public WishMessageGenerater() {
		System.out.println("WishMessageGenerater::0-param constructor");
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		int hour = ldt.getHour();
		if(hour < 12) {
			return "Good Morning: " + user;
		}else if(hour < 16 ) {
			return "Good AfterNoon: "+user;
		}else if(hour < 200) {
			return "Good Evening: "+user;
		}else {
			return "Good Night: "+user;
		}
	}
}
