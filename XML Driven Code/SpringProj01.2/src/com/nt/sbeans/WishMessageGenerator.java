package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime lt;
	private LocalDate ld;
	
	/*public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
		this.lt = lt;
	}
	*/
	public void setLt(LocalTime lt) {
		this.lt = lt;
		System.out.println(lt);

	}
	
	public void setLd(LocalDate ld) {
		this.ld = ld;
		System.out.println(ld);
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		int hour = lt.getHour();
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
