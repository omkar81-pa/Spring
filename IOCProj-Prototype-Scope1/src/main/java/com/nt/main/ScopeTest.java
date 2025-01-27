package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMeassageGenerater;

public class ScopeTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMeassageGenerater generater = ctx.getBean("wmg", WishMeassageGenerater.class);
		WishMeassageGenerater generater1 = ctx.getBean("wmg", WishMeassageGenerater.class);
		WishMeassageGenerater generater2 = ctx.getBean("wmg", WishMeassageGenerater.class);
		
		System.out.println(generater.hashCode()+" "+generater1.hashCode());
		System.out.println(generater1.hashCode()+" "+generater2.hashCode());
	}
}
