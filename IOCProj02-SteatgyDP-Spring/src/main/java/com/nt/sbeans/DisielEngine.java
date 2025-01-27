package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Lazy(true)
public final class DisielEngine implements IEngine {

	
	public DisielEngine() {
		System.out.println("DisielEngine::0-param constructor");
	}

    @Override
    public String start() {
        return "DisielEngine engine started.";
    }

    @Override
    public String stop() {
        return "DisielEngine engine stopped.";
    
    }
}
