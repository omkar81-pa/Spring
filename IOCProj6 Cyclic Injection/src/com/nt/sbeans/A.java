package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a1")
public class A {
	@SuppressWarnings("unused")
	private B b;
	
	@Autowired
	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "B=";
	}
}
