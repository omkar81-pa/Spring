package com.nt.comps;

public class DTDC implements ICourier {
	
	

	public DTDC() {
		System.out.println("DTDC::0-param constructor)");
	}

	@Override
	public String deliver(int oId) {
		return "DTDC courier is ready to deliver "+oId+" order number product";
	}

}
