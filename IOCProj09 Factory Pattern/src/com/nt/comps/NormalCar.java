package com.nt.comps;

public class NormalCar implements ICar {	
	
	public NormalCar() {
		System.out.println("MUV:: 0-param constructor");
	}
	@Override
	public void drive() {
		System.out.println("Normal car Nexon");
	}
}
