package com.nt.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig::0-parem constructor");
	}
	
	@Bean("ld")
	@Scope("prototype")
	public LocalDateTime createLDT() {
		System.out.println("AppConfig.createLDT()");
		return LocalDateTime.now();
	}
	
	@Bean("ld1")
	@Scope("prototype")
	public LocalDateTime createLDT1() {
		System.out.println("AppConfig.createLDT1()");
		return LocalDateTime.now();
	}
}
