package com.nt.comps;

public class Luxury implements ICar {	
	
	public Luxury() {
		System.out.println("MUV:: 0-param constructor");
	}
	@Override
	public void drive() {
		System.out.println("Luxury car BMW");
	}
}
