package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.nt.stan.Printer;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	
	@Bean("pr1")
	@Lazy(true)
	public Printer createPrinter1() {
		return Printer.getInstance();
	}
	
	@Bean("pr2")
	@Lazy(true)
	public Printer createPrinter2() {
		return Printer.getInstance();
	}
}
