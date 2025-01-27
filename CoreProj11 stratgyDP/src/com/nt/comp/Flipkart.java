package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private ICourier courier;
	
	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	public String shopping(String items[], double prices[]) {
		double billAmount = 0.0;
		
		for(double p: prices) {
			billAmount += p; 
		}
		
		int oid = new Random().nextInt(1000);
		
		String msg = courier.deliver(oid);
		return Arrays.toString(items)+" items with billAmount::"+billAmount+"------------ "+msg;
	}
}
