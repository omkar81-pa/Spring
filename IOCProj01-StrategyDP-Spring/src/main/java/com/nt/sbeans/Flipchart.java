package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipchart {
	
	@Autowired
	@Qualifier("bDart")
	private ICourier courier;
	
	public String shoping(String items[], double price[]) {
		System.out.println("Flipchart.shoping()");
		double billAmount = 0.0;
		
		for(double p : price) {
			billAmount = billAmount + p;
		}
		
		int oid = new Random().nextInt(10000);
		
		String msg = courier.deliver(oid);
		return Arrays.toString(items)+" are shopped having bill amount::"+billAmount+"--->"+msg;
	}
	
}
