package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;
import com.nt.comp.ICourier;

public class FlipkartFactory {
	public static Flipkart getlnstance(String courierTypr) {
		ICourier courier = null;
		
		if(courierTypr.equalsIgnoreCase("blueDart")) {
			courier = new BlueDart();
		}else if (courierTypr.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}else {
			throw new IllegalArgumentException("Invalid courier type");
		}
		
		Flipkart fpkt = new Flipkart();
		
		fpkt.setCourier(courier);
		
		return fpkt;
	}
}
