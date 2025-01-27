package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Printer;

public class PrototypeScopeTest {

    public static void main(String[] args) {
        // Create application context using AppConfig
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Printer bean with the correct name (matching bean name 'prn1' from AppConfig)
        Printer p1 = ctx.getBean("prn1", Printer.class);
        Printer p2 = ctx.getBean("prn1", Printer.class);

        // Print the hashcodes of both Printer instances to confirm that they're different (prototype scope)
        System.out.println("HashCode of p1: " + p1.hashCode());
        System.out.println("HashCode of p2: " + p2.hashCode());

        // Closing the context to release resources
        ctx.close();
    }
}
