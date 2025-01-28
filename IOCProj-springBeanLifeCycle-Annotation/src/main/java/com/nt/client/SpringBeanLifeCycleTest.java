package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoterInfo;

public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml")){
			VoterInfo info = ctx.getBean("voter",VoterInfo.class);
			
			String resultMsg = info.checkVotingEligibility();
			System.out.println(resultMsg);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
