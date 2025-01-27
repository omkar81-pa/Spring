package com.nt.main;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbean.WishMessageGenerater;

public class SinglrTonScopeTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerater generater = ctx.getBean("wmg", WishMessageGenerater.class);
		WishMessageGenerater generater1 = ctx.getBean("wmg", WishMessageGenerater.class);
		WishMessageGenerater generater2 = ctx.getBean("wmg", WishMessageGenerater.class);
		
		System.out.println(generater.hashCode()+" "+generater1.hashCode()+" "+generater2.hashCode());
		System.out.println("generater == generater1 ?"+(generater == generater1));
		System.out.println("generater1 == generater2 ?"+(generater1 == generater2));
		
		System.out.println("-----------------------------------------");
		
		LocalDateTime ldt1 = ctx.getBean("ld", LocalDateTime.class); 
		LocalDateTime ldt2 = ctx.getBean("ld", LocalDateTime.class); 
		System.out.println(ldt1.hashCode()+" "+ldt2.hashCode());
		
		System.out.println("-----------------------------------------");

		LocalDateTime ldt3 = ctx.getBean("ld1", LocalDateTime.class); 
		LocalDateTime ldt4 = ctx.getBean("ld1", LocalDateTime.class); 
		System.out.println(ldt1.hashCode()+" "+ldt2.hashCode());
	}
}
