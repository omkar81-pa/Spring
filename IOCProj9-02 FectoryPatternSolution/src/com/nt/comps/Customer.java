package com.nt.comps;

public class Customer extends Person {
	private int txId;
	private double billAm;
	
	public Customer(String name, String addrs, AdharDetails adher, int billid, double bill) {
		super(name, addrs, adher);
		System.out.println("Customer::%-param constructor");
		this.txId = billid;
		this.billAm = bill;
	}

	@Override
	public String toString() {
		return "Employee [billId=" + txId + ", billAm=" + billAm + "," + super.toString() + "]";
	}
}
