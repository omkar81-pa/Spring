package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.stan.Printer;

public class SingleTonClassTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Printer prn1 = ctx.getBean("pr1", Printer.class);
		Printer prn2 = ctx.getBean("pr1", Printer.class);
		System.out.println(prn1.hashCode()+" "+prn2.hashCode());
		
		System.out.println("---------------------------------------");
		
		Printer prn3 = ctx.getBean("pr2", Printer.class);
		Printer prn4 = ctx.getBean("pr2", Printer.class);
		System.out.println(prn1.hashCode()+" "+prn2.hashCode());
		prn1.printMessage("Hello Omkar");
		prn1.printMessage("Hai Subham");
	}

}
