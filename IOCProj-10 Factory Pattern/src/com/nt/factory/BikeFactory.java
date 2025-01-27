package com.nt.factory;

import com.nt.company.BulletBike;
import com.nt.company.ElectricBike;
import com.nt.company.IBike;
import com.nt.company.SportsBike;
import com.nt.company.StanderdBike;
import com.nt.company.TurarBike;

public class BikeFactory {
	public static IBike orderBike(String type) {
		IBike bike = null;
		
		if(type.equalsIgnoreCase("standerd")) {
			bike = new StanderdBike();
		}else if (type.equalsIgnoreCase("sports")) {
			bike = new SportsBike();
		}else if (type.equalsIgnoreCase("electric")) {
			bike = new ElectricBike();
		}else if (type.equalsIgnoreCase("bullet")) {
			bike = new BulletBike();
		}else if (type.equalsIgnoreCase("turrar")) {
			bike = new TurarBike();
		}else {
			throw new IllegalArgumentException("Invalid Bike Type");
		}
		
		return bike;
	}
}
