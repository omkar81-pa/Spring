package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cnfig.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjection {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator generator = (WishMessageGenerator)ctx.getBean("wmg");
		
		String msg = generator.generateWishMessage("Omkar");
		System.out.println(msg);
		
		ctx.close();
	}
}
