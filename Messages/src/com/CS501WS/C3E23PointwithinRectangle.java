package com.CS501WS;
/* Assignment exercise 2.23
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 * find if the points are in rectangle.
 */

import java.util.Scanner;
public class C3E23PointwithinRectangle {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		float x1=0;
		float y1=0;
		float x2=0;
		float y2=0;
		float n=0;
		float p=0;
		int iCheck= 0;
		
		//Point 
		System.out.println("System will calculate if the point is within the rectangle. The user will be prompted to enter :" + "\n"
				+ "a. the center point of the rectangle." + "\n"
				+ "b. the point to be checked if it is within or outside the rectangle."+ "\n"
				+ "c. the length and width of the rectangle.");
		
		System.out.println("Enter center of the rectangle (x1 y1). The values of x1 and y1 needs to be separated with space");
		if (sc.hasNextFloat()){
			 x1 = sc.nextFloat();
			 y1 = sc.nextFloat();
			//The center of the rectangle is at (0,0)
			// x1 = 0; 
			// y1 = 0;
		}
		else
		{
			ErrorState();
		}
		
		System.out.println("Enter a point (x2 y2). The values of x2 and y2 needs to be separated with space");
		if (sc.hasNextFloat()){
			 x2 = sc.nextFloat();
			 y2 = sc.nextFloat();
		}
		else
		{
			ErrorState();
		}
		
		System.out.println("Enter length and width of the rectangle (n p). The values of n and p needs to be separated with space");
		if (sc.hasNextFloat()){
			 n = sc.nextFloat();
			 p = sc.nextFloat();
		
		}
		else
		{
			ErrorState();
		}
		
	 	//Calculate horizontal distance
		//double hd =  Math.pow(Math.pow(x2-x1,2) +  Math.pow(y2-y1,2),.5);
		double hd =  Math.pow(Math.pow(x2-x1,2),.5);
		
		//Calculate vertical distance
		//double vd =   Math.pow(Math.pow(x2-x1,2) + 	Math.pow(y2-y1,2),.5);
		double vd = Math.pow(Math.pow(y2-y1,2),.5);
		
		if(hd>(n/2)){
			
			System.out.println("Point (" + x2 + "," + y2 + ") is outside the rectangle");
		    System.exit(0);
		}
		else	{
			System.out.println("The distance of the horizontal point from center of rectangle(" + x1 + "," + y1 + ") is: " + hd);
			iCheck = 1;
		}
		
		if(vd>(p/2)){
			System.out.println(("Point (" + x2 + "," + y2 + ") is outside the rectangle"));
			System.exit(0);
			}
		else	{
			System.out.println("The distance of the vertical point from center of rectangle (" + x1 + "," + y1 + ") is: " + vd);
			iCheck = 1;
		}
		
		if (iCheck==1) {
			System.out.println("The point in inside the rectangle.");
		}
	}
	

	private static void ErrorState(){
		System.out.println("Only numbers are allowed. Exiting program. Please re-reun");
	       System.exit(0);
	}
}