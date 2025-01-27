package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private ICourier courier;

	public Flipkart() {
		System.out.println("Flipkart::0param constructor");
	}

	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	public String shopping(String items[], double price[]) {
		double total = 0.0;
		
		for(double p : price) {
			total = total + p;
		}
		
		int oId = new Random().nextInt(1000);
		
		String msg = courier.deliver(oId);
		
		return Arrays.toString(items)+"are purchased having price"+Arrays.toString(price)+"bill amt: "+total+"  "+msg;
	}
}
