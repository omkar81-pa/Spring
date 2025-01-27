package com.nt.comps;

public class BlueDart implements ICourier {
	
	

	public BlueDart() {
		System.out.println("BlueDart::0-param constructor)");
	}

	@Override
	public String deliver(int oId) {
		return "BlueDart courier is ready to deliver "+oId+" order number product";
	}

}
