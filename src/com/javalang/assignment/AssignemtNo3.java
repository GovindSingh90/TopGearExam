package com.javalang.assignment;

enum Day 
{ 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 
} 
public class AssignemtNo3 {
	Day day;
	public AssignemtNo3(Day day) 
    { 
        this.day = day; 
    } 
	public void printDay() 
    { 
        switch (day) 
        { 
        case MONDAY: 
            System.out.println("Selected day is Mondays ."); 
            break; 
        case TUESDAY: 
            System.out.println("Selected day is TUESDAY ."); 
            break;
        case WEDNESDAY: 
            System.out.println("Selected day is WEDNESDAY ."); 
            break;
        case THURSDAY: 
            System.out.println("Selected day is THURSDAY ."); 
            break;
        case FRIDAY: 
            System.out.println("Selected day is Friday"); 
            break; 
        case SATURDAY: 
        	System.out.println("Selected day is SATURDAY"); 
            break; 
        case SUNDAY: 
            System.out.println("Selected day is SUNDAY"); 
            break; 
        default: 
            System.out.println("Midweek days are so-so."); 
            break; 
        } 
    } 
	
	public static void main(String[] args) {
		String str = "MONDAY"; 
        AssignemtNo3 t1 = new AssignemtNo3(Day.valueOf(str)); 
        t1.printDay();
	}

}
