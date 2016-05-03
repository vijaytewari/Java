package com.CS501WS;

import java.util.Scanner;

public class C10E13MyRectangle2DTestHarness {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeatInt = 1;
		while (repeatInt == 1) {
			System.out
					.println("Enter the center point(x,y) of the rentangle:");
			double x = input.nextDouble();
			double y = input.nextDouble();
			System.out
			.println("Enter the width and height of the rectangle:");
			double w = input.nextDouble();
			double h = input.nextDouble();
			
			MyRectangle2D baseR = new MyRectangle2D(x,y,w,h);
			baseR.setX(x);
			baseR.setY(y);
			baseR.setWidth(w);
			baseR.setHeight(h);
					
			System.out.println("Area of the base rectangle is: " + baseR.getArea());
			System.out.println("Perimeter of the base rectangle is: " + baseR.getPerimeter());
			
			
			ContainsCheck(baseR);
			
			
			System.out.print("Repeat program outer rentangle loop(enter 1 for yes or 0 for n)?: ");
			repeatInt = input.nextInt();

		}
		input.close();
	}
	
	public static void ContainsCheck(MyRectangle2D baseR) {
		Scanner sc = new Scanner(System.in);
		int repeatSecondInt = 1;
		while (repeatSecondInt == 1) {
			System.out.println("System to check of the point is inside the rectangle");
			System.out.println(" Enter points(x1, y1) to check if the point is within the base rectangle or outside.");
			double x1 = sc.nextDouble();
			double y2 = sc.nextDouble();
			if (baseR.contains(x1, y2)==false){
				System.out.println("Point (" + x1 + " & " + y2 +") is outside the rectangle");
			}
			else{
				System.out.println("The point is inside the rectangle.");}
			
			System.out.println("Enter points(x, y) and width and height of the second rectangle.");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double w = sc.nextDouble();
			double h = sc.nextDouble();
			//MyRectangle2D newR = new MyRectangle2D(x,y,w,h);
			
			if(baseR.contains(new MyRectangle2D(x,y,w,h))==true){
				System.out.println("recantangle in inside");
			}
			if(baseR.overlaps(new MyRectangle2D(x,y,w,h))==true){
				System.out.println("recantangle overlaps");
			}
			
					
			
			System.out.print("Repeat innner rectangle loop (enter 1 for yes or 0 for n)?: ");
			repeatSecondInt = sc.nextInt();
		}
	}

}
