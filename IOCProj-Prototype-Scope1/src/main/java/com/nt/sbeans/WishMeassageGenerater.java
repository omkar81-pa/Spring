package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("prototype")
public class WishMeassageGenerater {

	@Autowired
	@Qualifier("dt")
	private LocalDateTime ldt;

	public WishMeassageGenerater() {
		System.out.println("WishMeassageGenerater::0-param constructor");
	}

	public String generateWishMessage(String user) {
		System.out.println("WishMeassageGenerater.generateWishMessage()");
		int hour = ldt.getHour();
		
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
