package com.CS501WS;

import java.util.Scanner;

public class C11E1TestTriangleObject {
	static String color = "";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeatInt = 1;
		while (repeatInt == 1) {
			System.out
					.println("Enter the sides of the triangle, its color and if the triangle is filled :");
			double s1 = input.nextDouble();
			double s2 = input.nextDouble();
			double s3 = input.nextDouble();
			String color = input.next();
			boolean filled = input.nextBoolean();

			TriangleGeometricObject obj;
			try {
				obj = new TriangleGeometricObject(s1, s2, s3, color, filled);
				obj.setSide1(s1);
				obj.setSide2(s2);
				obj.setSide3(s3);
				obj.setColor(color);
				obj.setFilled(filled);
				obj.printTriangle();

			} catch (InvalidSideException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
			repeatInt = input.nextInt();

		}
		input.close();
	}

}
