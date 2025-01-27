package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prn1") // Component scan will pick this up
@Scope("prototype") // Prototype scope to create a new instance each time
public class Printer {
    
    // Private static instance to ensure only one instance can be created using getInstance
    private static Printer INSTANCE;
    
    // Private constructor to prevent direct instantiation
    private Printer() {
        System.out.println("Printer::0-param constructor");
    }
    
    // Static method to return the instance (this is not needed in this case due to prototype scope)
    public static Printer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Printer();
        }
        return INSTANCE;
    }
    
    // Method to print messages
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
