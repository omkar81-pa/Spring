package com.nt.test;

import com.nt.company.IBike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		IBike bike1 = BikeFactory.orderBike("standerd");
		bike1.drive();
		System.out.println("============================");
		
		IBike bike2 = BikeFactory.orderBike("sports");
		bike2.drive();
		System.out.println("=============================");
		
		IBike bike3 = BikeFactory.orderBike("electric");
		bike3.drive();
		System.out.println("==============================");
		
		IBike bike4 = BikeFactory.orderBike("bullet");
		bike4.drive();
		System.out.println("==========================");
		IBike bike5 = BikeFactory.orderBike("turrer");
		bike5.drive();	
	}
}
