package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEngine")
@Lazy(true)
public final class PetrolEngine implements IEngine {

	
	public PetrolEngine() {
		System.out.println("PetrolEngine::0-param constructor");
	}

	@Override
    public String start() {
        return "PetrolEngine engine started.";
    }

    @Override
    public String stop() {
        return "PetrolEngine engine stopped.";
    
    }
}
