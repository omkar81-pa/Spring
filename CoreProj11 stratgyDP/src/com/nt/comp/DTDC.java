package com.nt.comp;

public final class DTDC implements ICourier{
	public DTDC() {
		System.out.println("BlueDart::0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid+" order items are kept for delivery by DTDC";
	}
}
