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
		System.out.println("WishMessageGenerator::o paran constructor)");
	}
	
	@Autowired
	public void assign(LocalTime lt) {
		System.out.println("WishMessageGenerator.assign()");
		this.lt = lt;
	}
	
	@Autowired
	public void push(LocalDate ld) {
		System.out.println("WishMessageGenerator.push()");
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
