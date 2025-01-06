package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	@Bean(name = "ltime")
	public LocalTime crreateLocalTime(){
		System.out.println("AppConfig.crreateLocalTime()");
		return LocalTime.now();
	}
	
	@Bean(name = "ldate")
	public LocalDate crreateLocalDate() {
		System.out.println("AppConfig.crreateLocalDate()");
		return LocalDate.now();
	}
	
}
