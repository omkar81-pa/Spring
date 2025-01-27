package com.nt.comps;

public class Employee extends Person {
	private int empID;
	private String desg;
	
	

	public Employee(String name, String addrs, AdharDetails adher, int empID, String desg) {
		super(name, addrs, adher);
		System.out.println("Employee::5-[aram constructor");
		this.empID = empID;
		this.desg = desg;
	}



	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", desg=" + desg + "," + super.toString()+ "]";
	}


}
