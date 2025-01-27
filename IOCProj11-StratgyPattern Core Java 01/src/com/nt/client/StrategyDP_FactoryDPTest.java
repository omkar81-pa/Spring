package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
		
		String resultMsg = fpkt.shopping(new String[] {"Kurta", "Pathani", "servani"}, new double[] {232.23, 4534.4, 5343.4});
		System.out.println(resultMsg);
	}

}
