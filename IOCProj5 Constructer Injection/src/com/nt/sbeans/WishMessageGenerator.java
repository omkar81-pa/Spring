package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	private LocalTime lt;
	private LocalDate ld;
	
	@Autowired
	public WishMessageGenerator(LocalTime lt, LocalDate ld) {
		System.out.println("WishMessageGenerator:: 2-param constuctor");
		this.lt = lt;
		this.ld = ld;
	}
	
	public String generateWishMessage(String user){
		int hour = lt.getHour();
		
		if(hour < 12) {
			return "Good Morning: "+user;
		}else if(hour < 16) {
			return "Good AfterNoon: "+user;
		}else if(hour < 20) {
			return "Good Evning: "+user;
		}else {
			return "Good Night: "+user;
		}
		
	}
}
