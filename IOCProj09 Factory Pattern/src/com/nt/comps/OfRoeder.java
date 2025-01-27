package com.nt.comps;

public class OfRoeder implements ICar {	
	
	public OfRoeder() {
		System.out.println("MUV:: 0-param constructor");
	}
	@Override
	public void drive() {
		System.out.println("Of Rodeor car Thar");
	}
}
