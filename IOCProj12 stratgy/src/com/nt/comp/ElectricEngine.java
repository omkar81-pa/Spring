package com.nt.comp;

public final class ElectricEngine implements IEngine {
	public ElectricEngine() {
		System.out.println("ElectricEngine.ElectricEngine()");
	}
	
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine...");
    }
}
