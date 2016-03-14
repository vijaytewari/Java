/* Assignment exercise 9.5 
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 * solve 2x2 system of linear equation and find the x and y coordinate of the intersecting line. 
 */
package com.CS501WS;

import java.util.*;
public class C9E5CalendarDateTime {

	public static void main(String[] args) {
		System.out.println("System shows the current year, month and day_of_month");
		
		Calendar cl = Calendar.getInstance();
		System.out.println("Current year is : " + cl.get(Calendar.YEAR)); 
		System.out.println("Current month is : " + theMonth(cl.get(Calendar.MONTH)));
		System.out.println("Current day is : " + cl.get(Calendar.DAY_OF_MONTH));
	
		System.out.println("\nSystem sets the time in millis to 1234567898765L and then displays the Year, Month and Day of the Month");
		cl.setTimeInMillis(1234567898765L);
		System.out.println("Current year is : " + cl.get(Calendar.YEAR)); 
		System.out.println("Current month is : " + theMonth(cl.get(Calendar.MONTH)));
		System.out.println("Current day is : " + cl.get(Calendar.DAY_OF_MONTH));
		
	}
	public static String theMonth(int month){
	    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	    return monthNames[month];
	}
}
