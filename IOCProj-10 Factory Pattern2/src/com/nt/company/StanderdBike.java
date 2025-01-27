package com.nt.company;

public class StanderdBike implements IBike{
	public StanderdBike() {
		System.out.println("StanderdBike.StanderdBike()");
	}
	
	@Override
	public void drive() {
		System.out.println("SportsBike:: driving Sports Bike");
	}
}
 