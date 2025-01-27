package com.nt.fectory;

import com.nt.comps.ICar;
import com.nt.comps.Luxury;
import com.nt.comps.MUV;
import com.nt.comps.NormalCar;
import com.nt.comps.OfRoeder;

public class CarFectory {
	public static ICar orderCar(String type) {
		ICar car = null;
		
		if(type.equalsIgnoreCase("NormalCar")) {
			car = new NormalCar();
		}else if(type.equalsIgnoreCase("muv")) {
			car = new MUV();
		}else if (type.equalsIgnoreCase("ofroador")) {
			car = new OfRoeder();
		}else if(type.equalsIgnoreCase("luxury")){
			car = new Luxury();
		}else {
			throw new IllegalArgumentException("Invalid Car type");
		}
		
		return car;
	}
}
