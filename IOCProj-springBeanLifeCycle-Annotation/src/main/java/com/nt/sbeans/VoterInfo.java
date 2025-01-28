package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("com/nt/commons/info.properties")
public class VoterInfo {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	private Date date;
	
	//O-param constructor 
	public VoterInfo() {
		System.out.println("VoterInfo::O param constructor");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("VoterInfo.myInit()");
		date = new Date();
		
		if(name == null || age == null || age <= 0) {
			throw new IllegalArgumentException("Invalid input given for name or age or for both");
		}
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("VoterInfo.myDestroy()");
		
		name = null;
		age = null;
		date = null;
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
}
