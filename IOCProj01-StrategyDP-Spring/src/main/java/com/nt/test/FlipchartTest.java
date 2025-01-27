package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cnfig.ApplicationConfig;
import com.nt.sbeans.Flipchart;

public class FlipchartTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Flipchart fpkt = ctx.getBean("fpkt",Flipchart.class);
		
		String resultMsg = fpkt.shoping(new String[] {"mobile", "Laptop", "charger", "TV"}, new double[] {50000.0, 70000.0, 3000.0, 10000.0});
		
		System.out.println(resultMsg);
		
		ctx.close();
	}
}
