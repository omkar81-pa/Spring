package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
		
		String resultMag = vehicle.operateVehicle("Hyd", "Goa");
		
		System.out.println(resultMag);
		
		ctx.close();
	}
}
