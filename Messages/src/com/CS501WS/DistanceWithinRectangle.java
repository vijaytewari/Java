package com.CS501WS;
/* Assignment exercise 3.23
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 * find if point is in rectangle.
 */

import java.util.Scanner;
public class DistanceWithinRectangle {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double x1=0;
		double y1=0;
		double x2=0;
		double y2=0;
		int iCheck= 0;
		
		//The center of the rectangle is at (0,0)
		 x1 = 0; 
		 y1 = 0;
	
		
		//Point 
		System.out.println("System will calculate if the point is within the rectangle with its center at (0,0) "
				+ "and spanning horizontally 10 points and vertically 5 points");
		System.out.println("Enter a point (x y). The values of x and y needs to be separated with space");
		if (sc.hasNextDouble()){
			 x2 = sc.nextDouble();
			 y2 = sc.nextDouble();
		}
		else
		{
			ErrorState();
		}
		
	 	//Calculate horizontal distance
		double hd =  Math.pow(Math.pow(x2-x1,2) + 
						Math.pow(0-y1,2),.5);
		
		if(hd>(10/2)){
			
			System.out.println("Horizontal distance is out of the rectangle");
			iCheck=0;
		}
		else	{
    	System.out.println("The distance of horizontal point from (0,0) is: " + hd);
    	iCheck = 1;
		}
		
		//Calculate horizontal distance
		double vd =   Math.pow(Math.pow(0-x1,2) + 
						Math.pow(y2-y1,2),.5);
		
		if(vd>(5/2)){
			
			System.out.println("Vertical distance is out of the rectangle" +vd+ 5/2);
			iCheck = 0;
		}
		else	{
    	System.out.println("The distance of vertical point from (0,0) is: " + vd);
    	iCheck = 1;
		}
		
	switch(iCheck){
	case 1: System.out.println("Points(" + x2 + " , " + y2 + ")are inside the rectangle");
			break;
	case 0: System.out.println("Points(" + x2 + " , " + y2 + ")are outside the rectangle");
		     break;
	}
		
	}

	private static void ErrorState(){
		System.out.println("Only numbers are allowed. Exiting program. Please re-reun");
	       System.exit(0);
	}
}