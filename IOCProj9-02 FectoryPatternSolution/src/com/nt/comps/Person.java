package com.nt.comps;

public abstract class Person {
	private String name;
	private String addrs;
	private AdharDetails adher;
	
	public Person(String name, String addrs, AdharDetails adher) {
		System.out.println("Person::3-param constructor");
		this.name = name;
		this.addrs = addrs;
		this.adher = adher;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addrs=" + addrs + ", adher=" + adher + "]";
	}
}
