package com.nt.company;

public class ElectricBike implements IBike{
	public ElectricBike() {
		System.out.println("ElectricBike.ElectricBike()");
	}
	@Override
	public void drive() {
		System.out.println("ElectricBike:: driving Electric Bike");
	}
}
