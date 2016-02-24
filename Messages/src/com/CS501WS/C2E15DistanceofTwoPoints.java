package com.CS501WS;
/* Assignment exercise 2.15
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 * find distance between two points
 */

import java.util.Scanner;
public class C2E15DistanceofTwoPoints {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double x1=0;
		double y1=0;
		double x2=0;
		double y2=0;
		double d = 0;
		//Point One
		System.out.println("Enter x1 and y1: ");
		if (sc.hasNextDouble()){
			 x1 = sc.nextFloat();
			 y1 = sc.nextFloat();
		}
		else
		{
			ErrorState();
		}
		
		//Point Two
		System.out.println("Enter x2 and y2: ");
		if (sc.hasNextDouble()){
			 x2 = sc.nextFloat();
			 y2 = sc.nextFloat();
		}
		else
		{
			ErrorState();
		}
		
	 	//Calculate distance
		//d = Math.pow(Math.pow(x2-x1,2) + 
		//				Math.pow(y2-y1,2),.5);
		d = Math.pow(
					Math.pow(y2-y1,2),.5);
    	System.out.println("The distance of two points are: " + d);
	}

	private static void ErrorState(){
		System.out.println("Only numbers are allowed. Exiting program. Please re-reun");
	       System.exit(0);
	}
}