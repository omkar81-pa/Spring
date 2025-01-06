package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("b1")
public class B {
	@SuppressWarnings("unused")
	private A a;
	
	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "A=";
	}
}
