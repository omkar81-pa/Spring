package com.nt.comps;

public class Deliver implements ICourier {
	
	

	public Deliver() {
		System.out.println("Deliver::0-param constructor)");
	}

	@Override
	public String deliver(int oId) {
		return "Deliver courier is ready to deliver "+oId+" order number product";
	}

}
