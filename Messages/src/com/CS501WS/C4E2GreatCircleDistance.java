package com.CS501WS;
/* Assignment exercise 4.2
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 */
import java.util.Scanner;
import java.math.*;

public class C4E2GreatCircleDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int repeatInt = 1;     
		
		    double x1=0;
		    double y1=0;
		    double x2=0;
		    double y2=0;     
		    
		    System.out.println("Enter point 1 (latitude and logitude) in degrees, separating with a space: ");   
		    while(repeatInt == 1) {
		    // beginning of code lines responding to the exercise     
		    	  
		    	if (input.hasNextDouble()){
		    		 x1 = input.nextFloat();
		    		 y1 = input.nextFloat();
		    	}
		    	else
		    	{
		    		ErrorState();
		    	}
		    	
		    	System.out.println("Enter point 2 (latitude and logitude) in degrees, separating with a space: ");
		    	if (input.hasNextDouble()){
		    		 x2 = input.nextFloat();
		    		 y2 = input.nextFloat();
		    	}
		    	else
		    	{
		    		ErrorState();
		    	}
		    	double radius = 6371.01;
		    	double d = radius 
		    			* Math.acos(Math.sin(Math.toRadians(x1))
		    			* Math.sin(Math.toRadians(x2))
		    			+ Math.cos(Math.toRadians(x1))
		    			* Math.cos(Math.toRadians(x2))
		    			* Math.cos(Math.toRadians(y1)
		    			- Math.toRadians(y2)));
		    	
		    	System.out.println(d + "km");
		    	
		    // end of code lines responding to the exercise
		    System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
		    repeatInt = input.nextInt(); 
		    } // end while(repeat loop)
	}
	private static void ErrorState(){
		System.out.println("Only numbers are allowed. Exiting program. Please re-reun");
	       System.exit(0);
	}

}

