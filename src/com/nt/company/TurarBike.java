package com.nt.company;

public class TurarBike implements IBike{
	public TurarBike() {
		System.out.println("TurarBike.TurarBike()");
	}
	
	@Override
	public void drive() {
		System.out.println("TurarBike:: driving Turrar Bike");
	}
}
