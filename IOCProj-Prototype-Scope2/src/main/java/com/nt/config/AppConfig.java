package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.sbeans.Printer;

@Configuration
@ComponentScan(basePackages = "com.nt") // Automatically scans for beans in this package
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig::0-param constructor");
    }

    // Bean definition for Printer with prototype scope
    @Bean("prn1")
    @Scope("prototype") // Ensures a new instance is created each time
    public Printer createPrinter() {
        System.out.println("AppConfig.createPrinter()");
        return Printer.getInstance(); // This can be omitted as we use Spring to manage the instances
    }
}
