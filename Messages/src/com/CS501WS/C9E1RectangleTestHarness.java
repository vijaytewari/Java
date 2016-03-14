package com.CS501WS;

import java.util.Scanner;

public class C9E1RectangleTestHarness {

	public static void main(String[] args) {

		System.out
				.println("Program allows the user to enter the width and length of a rectangle"
						+ ". The program then instantiate a rectangle class and calculates the area and perimeter of the rectangle. ");

		int intRepeat = 1;
		Scanner input = new Scanner(System.in);
		while (intRepeat == 1) {
			System.out.println("\nEnter the width of the rectangle: ");
			double width = input.nextDouble();

			System.out.println("Enter the length of the rectangle: ");
			double length = input.nextDouble();

			Rectangle rt = new Rectangle(width, length);
			System.out.println(rt.getAreaOfRectangle());
			System.out.println(rt.getPerimeterOfRectangle());
			//end of program
			System.out.println("Repeat program (enter 1 for yes or 0 for n)?:");
			intRepeat = input.nextInt();
			
		}//End while
		input.close();
	}

}
