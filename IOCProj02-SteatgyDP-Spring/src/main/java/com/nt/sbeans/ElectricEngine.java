package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("eEngine")
@Lazy(true)
public final class ElectricEngine implements IEngine {

	
	public ElectricEngine() {
		System.out.println("ElectricEngine::0-param constructor");
	}

    @Override
    public String start() {
        return "ElectricEngine engine started.";
    }

    @Override
    public String stop() {
        return "ElectricEngine engine stopped.";
    }
}
