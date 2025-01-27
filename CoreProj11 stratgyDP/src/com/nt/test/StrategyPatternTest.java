package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {
	public static void main(String[] args) {
		
		Flipkart fpkt = FlipkartFactory.getlnstance("blueDart");
	
		String resultMsg = fpkt.shopping(new String[] {"shirt", "trouser", "jekit", "shose"}, new double[] {2000.0, 4000.0, 6000.0,10000.0});
		
		System.out.println(resultMsg);
	}
}
