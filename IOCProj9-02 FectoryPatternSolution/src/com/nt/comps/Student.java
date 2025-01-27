package com.nt.comps;

public class Student extends Person {
	private int rolNum;
	private String course;
	
	public Student(String name, String addrs, AdharDetails adher, int rolNum, String course) {
		super(name, addrs, adher);
		System.out.println("Student::5-param constructor");
		this.rolNum = rolNum;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rolNum=" + rolNum + ", course=" + course + ", " + super.toString() +"]";
	}
	
	
	
	
	
}
