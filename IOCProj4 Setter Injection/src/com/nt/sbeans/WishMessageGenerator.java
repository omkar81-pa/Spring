package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	private LocalTime lt;
	private LocalDate ld;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: O-param constructer");
	}
	
	@Autowired
	public void setLt(LocalTime lt) {
		System.out.println("WishMessageGenerator.setLt()");
		this.lt = lt;
	}
	
	@Autowired
	public void setLd(LocalDate ld) {
		System.out.println("WishMessageGenerator.setLd()");
		this.ld = ld;
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerater.generateWishMessage()");
		int hour = lt.getHour();
		if(hour < 12) {
			return "Good Moring: "+ user;
		}else if(hour < 16) {
			return "Good AfterNoon: "+user;
		}else if(hour < 20) {
			return "Good Evning: "+user;
		}else {
			return "Good Night: "+user;
		}
	}
}
