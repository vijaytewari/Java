package com.CS501WS;
/* Assignment exercise 2.19
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 * find the Area of a Triangle
 */
import java.util.Scanner;

public class C2E19AreaofaTriangle {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double x1=0;
		double y1=0;
		double x2=0;
		double y2=0;
		double x3=0;
		double y3=0;
		double side1 = 0;
		double side2 = 0;
		double side3 = 0;

		System.out.println("Enter three points for a triangle ");
		if (sc.hasNextDouble()){
			 x1 = sc.nextFloat();
			 y1 = sc.nextFloat();
			 x2 = sc.nextFloat();
			 y2 = sc.nextFloat();
			 x3 = sc.nextFloat();
			 y3 = sc.nextFloat();
			
		}
		else
		{
			ErrorState();
		}
		
	 	//Calculate all sides
		side1 =  Math.pow(Math.pow(x2-x1,2) + 
						Math.pow(y2-y1,2),.5);
    	System.out.println("The distance of side1: " + side1);
    	
    	side2 =  Math.pow(Math.pow(x1-x3,2) + 
				Math.pow(y1-y3,2),.5);
		System.out.println("The distance of side2: " + side1);
		
		side3 =  Math.pow(Math.pow(x3-x2,2) + 
				Math.pow(y3-y2,2),.5);
		System.out.println("The distance of side3: " + side1);
	    
		findArea(side1,side2,side3);
		
	}
	
	
    public static double findArea(double side1, double side2, double side3)
    { 
    	double area; double s;
        s = .5 * (side1 + side2 + side3);
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The area of the triangle is " + area);
        return area;
    }
	


	private static void ErrorState(){
		System.out.println("Only numbers are allowed. Exiting program. Please re-reun");
	       System.exit(0);
	}
}