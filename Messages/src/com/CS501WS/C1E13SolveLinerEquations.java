package com.CS501WS;

/* Assignment exercise 1.13
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 * solve 2x2 system of linear equation
 */

public class C1E13SolveLinerEquations {
	public static void main(String[] args) {
		System.out.println("When a=3.4, b=50.2, c=2.1, d=.55, e=44.5, f=5.9");
		solveEquations();
	
	}

private static void solveEquations()
{
    float a = (float) 3.4;
    float b = (float) 50.2;
    float c = (float) 2.1;
    float d = (float) .55;
    float e = (float) 44.5;
    float f = (float) 5.9;	
	
	if ((a*d)-(b*c) != 0)
	{
		float x=((e*d)-b*f)/((a*d)-(b*c));
		float y=((a*f)-c*e)/((a*d)-(b*c));
		System.out.println("X = " + x);
		System.out.println("y = " + y);
	}
}
}

