package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjuctionTest {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get spring been class obj ref
		WishMessageGenerator generator = (WishMessageGenerator)ctx.getBean("wmg");
		
		//Invoked the b.method
		String msg = generator.generateWishMessage("Omkar");
		System.out.println(msg);
		
		//close IOC Container
		ctx.close();
	}
}
