package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalTime lt;
	@Autowired
	private LocalDate ld;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-parem constructor");
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()::"+lt+"..."+ld);
		int hour  = lt.getHour();
		
		if(hour < 12) {
			return "Good Morning: "+user;
		}else if(hour < 16) {
			return "Good AfterNoon: "+user;
		}else if(hour < 20) {
			return "Goog Evening: "+user;
		}else {
			return "Good Night: "+user;
		}
	}
}
