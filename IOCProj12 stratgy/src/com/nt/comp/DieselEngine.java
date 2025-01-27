package com.nt.comp;

public final class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}
    @Override
    public void startEngine() {
        System.out.println("Starting diesel engine...");
    }
}
