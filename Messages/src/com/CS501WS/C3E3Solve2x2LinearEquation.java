package com.CS501WS;

/* Assignment exercise 3.3
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 */

import java.util.Scanner;
public class C3E3Solve2x2LinearEquation {

	public static void main(String[] args) {
	double a =0;
	double b =0;
	double c =0;
	double d =0;
	double e =0;
	double f =0;
	
    System.out.println("This Program will solve a 2x2 liner equations.The equation will be solved using Cramer's rule to find the value of x and y.");
    System.out.println("The following equation will be executed by the program to find the value of x and y: " + "\n"
    		+ "ax + by = e" + "\n"
    		+ "cx + dy = f");
    System.out.println("x = ed - cf / ad - bc"   + "\n" + "y = af - ec / ad - bc");
    System.out.println("6 numeric values for a,b,c,d,e,f needs to be entered by the user. The numbers can be entered in one "
    		+ "line leaving one space, " + "\n" + "or enter a number and hit return key(Repeat this 6 times till all values for "
    		+ "a,b,c,d,e,f are entered. The result will be values of x and y)" +"\n");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numeric values for a,b,c,d,e,f : ");
    if (sc.hasNextDouble()){
	    a = sc.nextDouble();
	    b= sc.nextDouble();
	    c = sc.nextDouble();
	    d = sc.nextDouble();
	    e= sc.nextDouble();
	    f = sc.nextDouble();
    }
    else 
    {
    	RaiseError();
    }
    
    SolveLinerEquation(a,b,c,d,e,f);
    sc.close();
	}
	
	private static void SolveLinerEquation(double a, double b, double c, 
										   double d, double e, double f){
		if ((a*d)-(b*c) != 0)
		{
			double x=((e*d)-b*f)/((a*d)-(b*c));
			double y=((a*f)-c*e)/((a*d)-(b*c));
			System.out.println("The value of x is " + x + " and the value of y = " + y );
		}
		else
			System.out.print("The equation has no solution");
		
	}
	
	private static void RaiseError()
	{
		System.out.println("Only numbers are allowed. Exiting program. Please re-reun with numerical values");
	       System.exit(0);
	}
		
}


