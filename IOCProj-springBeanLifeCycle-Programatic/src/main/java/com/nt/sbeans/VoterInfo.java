package com.nt.sbeans;

import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterInfo implements InitializingBean, DisposableBean{
	private String name;
	private Integer age;
	private Date date;
	
	//O-param constructor 
	public VoterInfo() {
		System.out.println("VoterInfo::O param constructor");
	}
	
	//setter method
	public void setName(String name) {
		System.out.println("VoterInfo.setName()");
		this.name = name;
	}
	
	//Setter method
	public void setAge(Integer age) {
		System.out.println("VoterInfo.setAge()");
		this.age = age;
	}
	
	//b.method
	public String checkVotingEligibility() {
		System.out.println("VoterInfo.checkVotingEligibility()");
		if(age < 18) {
			return "Mr/Miss/Mrs. "+name+" having age"+age+" you are not eligble for voting :: verified on::"+date;
		}else {
			return "Mr/Miss/Mrs. "+name+" having age"+age+" you are eligble for voting :: verified on::"+date;

		}
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterInfo.afterPropertiesSet()");
		date = new Date();
		
		if(name == null || age == null || age <= 0) {
			throw new IllegalArgumentException("Invalid input given for name or age or for both");
		}
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("VoterInfo.destroy()");
		name = null;
		age = null;
		date = null;
	}
	 
}
