package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class SeasonFinder {
    public static void main(String[] args) {
        // Get the current date
        LocalDate lt = LocalDate.now();

        // Get the current month
        Month month = lt.getMonth();
        int year = lt.getYear();
        int date = lt.getDayOfMonth();
        DayOfWeek day = lt.getDayOfWeek();

        // Determine the season
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
        System.out.println(day);
        System.out.println(lt);
        String season;
        if (month.getValue() >= 3 && month.getValue() <= 6) { // March to June
            season = "Summer Season";
        } else if (month.getValue() >= 7 && month.getValue() <= 10) { // July to October
            season = "Rainy Season";
        } else { // November to February
            season = "Winter Season";
        }

        // Print the result
        System.out.println("The current season is: " + season);
    }
}
