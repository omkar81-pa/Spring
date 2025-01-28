package com.nt.sbeans;

import java.util.Date;

import javax.xml.crypto.Data;

public class VoterInfo {
	private String name;
	private Integer age;
	private Date date;
	
	public VoterInfo() {
		System.out.println("VoterInfo::O param constructor");
	}
	public void setName(String name) {
		System.out.println("VoterInfo.setName()");
		this.name = name;
	}
	
	public void setAge(Integer age) {
		System.out.println("VoterInfo.setAge()");
		this.age = age;
	}
	
	public void myInit() {
		System.out.println("VoterInfo.myInit()");
		date = new Date();
		
		if(name == null || age == null || age <= 0) {
			throw new IllegalArgumentException("Invalid input given for name or age or for both");
		}
	}
	
	public void myDestroy() {
		System.out.println("VoterInfo.myDestroy()");
		
		name = null;
		age = null;
		date = null;
	}
	
	public String checkVotingEligibility() {
		System.out.println("VoterInfo.checkVotingEligibility()");
		if(age < 18) {
			return "Mr/Miss/Mrs. "+name+" having age"+age+" you are not eligble for voting :: verified on::"+date;
		}else {
			return "Mr/Miss/Mrs. "+name+" having age"+age+" you are eligble for voting :: verified on::"+date;

		}
	}
	
	 
}
