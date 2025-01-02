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
		System.out.println("AppConfig::0-parem constructor");
	}
	
	@Bean(name = "ltime")
	public LocalTime createTime() {
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();
	}
	
	@Bean(name = "ldate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}
}
