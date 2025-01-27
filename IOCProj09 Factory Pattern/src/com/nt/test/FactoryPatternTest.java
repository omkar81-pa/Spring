package com.nt.test;

import com.nt.comps.ICar;
import com.nt.fectory.CarFectory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		ICar car1 = CarFectory.orderCar("muv");
		car1.drive();
		System.out.println("======================");
		
		ICar car2 = CarFectory.orderCar("luxury");
		car2.drive();
		System.out.println("======================");
		
		ICar car3 = CarFectory.orderCar("ofroador");
		car3.drive();
		ICar car4 = CarFectory.orderCar("ofroador");
		car4.drive();
		System.out.println("=====================");
	
	}
}
