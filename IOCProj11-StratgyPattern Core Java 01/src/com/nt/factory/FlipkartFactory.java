package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.DTDC;
import com.nt.comps.Deliver;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierType) {
		ICourier courier = null;
		
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}else if(courierType.equalsIgnoreCase("bDart")) {
			courier = new BlueDart();
		}else if(courierType.equalsIgnoreCase("deli")) {
			courier = new Deliver();
		}else {
			throw new IllegalArgumentException("Invalid Coriear");
		}
		Flipkart fpkt = new Flipkart();
		
		fpkt.setCourier(courier);
		
		return fpkt;
 	}
}
