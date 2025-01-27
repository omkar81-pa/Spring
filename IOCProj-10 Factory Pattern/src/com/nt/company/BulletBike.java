package com.nt.company;

public class BulletBike implements IBike{
	
	public BulletBike() {
		System.out.println("BulletBike)-param constructor");
	}
	@Override
	public void drive() {
		System.out.println("BulletBike:: driving BulletBike");
	}
}
