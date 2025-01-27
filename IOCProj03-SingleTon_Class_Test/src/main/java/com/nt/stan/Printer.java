package com.nt.stan;

public class Printer {
	private static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer::0param constuctor");
	}
	
	public static Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
