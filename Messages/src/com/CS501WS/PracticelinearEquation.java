package com.CS501WS;

/* Assignment exercise 1.1
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 */

import java.util.Scanner;

public class PracticelinearEquation {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a, b, c, d, e, f:");
		solveEquations();
		}
		

private static void solveEquations()
{
	   /* float a = (float) 3.4;
	    float b = (float) 50.2;
	    float c = (float) 2.1;
	    float d = (float) .55;
	    float e = (float) 44.5;
	    float f = (float) 5.9;	*/
		
		 double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();	
		
		if ((a*d)-(b*c) != 0)
		{
			System.out.println(a);
			double x=((e*d)-b*f)/((a*d)-(b*c));
			double y=((a*f)-c*e)/((a*d)-(b*c));
			//float x=((e*d)-b*f)/((a*d)-(b*c));
			//float y=((a*f)-c*e)/((a*d)-(b*c));
			System.out.println("X = " + x);
			System.out.println("y = " + y);
		}
		else
			System.out.print("The equation has no solution");
		
	}
	
}
