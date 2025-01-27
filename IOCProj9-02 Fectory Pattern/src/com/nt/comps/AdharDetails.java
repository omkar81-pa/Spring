package com.nt.comps;

public class AdharDetails {
	private long adherNumber;
	private int age;
	private long mobileNo;
	
	public AdharDetails(long adherNumber, int age, long mobileNo) {
		System.out.println("AdharDetails::3-param counstroctor");
		this.adherNumber = adherNumber;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "AdharDetails [adherNumber=" + adherNumber + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
}
