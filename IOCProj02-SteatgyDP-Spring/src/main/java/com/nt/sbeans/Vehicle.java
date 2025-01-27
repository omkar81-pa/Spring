package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	
	@Autowired
	@Qualifier("pEngine")
	private IEngine engine;
	
	public String operateVehicle(String startLocation, String stopLocation) {
        StringBuilder result = new StringBuilder();

        if (startLocation != null && !startLocation.isEmpty()) {
            result.append("Starting vehicle at location: ").append(startLocation).append("\n").append(engine.start()).append("\n");
        } else {
            result.append("No start location provided.\n");
        }

        if (stopLocation != null && !stopLocation.isEmpty()) {
            result.append("Stopping vehicle at location: ").append(stopLocation).append("\n").append(engine.stop()).append("\n");
        } else {
            result.append("No stop location provided.\n");
        }

        return result.toString();
    }
}
