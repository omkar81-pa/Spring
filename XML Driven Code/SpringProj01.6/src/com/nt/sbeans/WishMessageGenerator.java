package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
    private LocalTime lt;
    private LocalDate ld;

    // Default constructor
    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator:: 0-param constructor");
    }

    // Constructor with LocalTime and LocalDate
    public WishMessageGenerator(LocalTime lt, LocalDate ld) {
        System.out.println("WishMessageGenerator:: Constructor with LocalTime and LocalDate");
        this.lt = lt;
        this.ld = ld;
        System.out.println("Initialized with LocalTime: " + lt + ", LocalDate: " + ld);
    }

    // Constructor with specific year, month, and day
    public WishMessageGenerator(int year, int month, int date) {
        System.out.println("WishMessageGenerator:: Constructor with year, month, and date");
        this.ld = LocalDate.of(year, month, date);
        this.lt = LocalTime.now();
    }

    // Setter for LocalTime
    public void setLt(LocalTime lt) {
        this.lt = lt;
        System.out.println("LocalTime set to: " + lt);
    }

    // Setter for LocalDate
    public void setLd(LocalDate ld) {
        this.ld = ld;
        System.out.println("LocalDate set to: " + ld);
    }

    // Method to generate a wish message
    public String generateWishMessage(String user) {
        System.out.println("WishMessageGenerator.generateWishMessage()");

        int hour = lt.getHour();
        if (hour < 12) {
            return "Good Morning: " + user;
        } else if (hour < 16) {
            return "Good Afternoon: " + user;
        } else if (hour < 20) {
            return "Good Evening: " + user;
        } else {
            return "Good Night: " + user;
        }
    }
}
