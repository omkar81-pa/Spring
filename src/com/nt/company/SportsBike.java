package com.nt.company;

public class SportsBike implements IBike{
	public SportsBike() {
		System.out.println("SportsBike.SportsBike()");
	}
	
	@Override
	public void drive() {
		System.out.println("SportsBike:: driving Sports Bike");
	}
}
