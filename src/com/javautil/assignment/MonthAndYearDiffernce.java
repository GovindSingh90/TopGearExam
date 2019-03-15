package com.javautil.assignment;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MonthAndYearDiffernce {

	public static void main(String[] args) {
        LocalDate bday = LocalDate.of(1955, Month.MAY, 19);
       // LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2015, Month.JULY, 20);
        Period age = Period.between(bday, today);
        int years = age.getYears();
        int months = age.getMonths();
        
        System.out.println("number of years: " + years);
        System.out.println("number of months: " + months);
    }

}


