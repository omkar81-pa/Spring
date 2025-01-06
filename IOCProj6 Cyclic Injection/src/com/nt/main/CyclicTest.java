package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cnfig.AppConfig;
import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CyclicTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		A a = (A)ctx.getBean("a1");
		B b = (B)ctx.getBean("b1");
		
		System.out.println(a);
		System.out.println(b);
	} 
}
