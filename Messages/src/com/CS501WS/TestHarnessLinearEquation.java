package com.CS501WS;

import java.util.Scanner;

public class TestHarnessLinearEquation {

	public static void main(String[] args) {
		System.out.println("The program finds out the intersecting point of two lines");
		System.out.println("It uses Cramers Liner Equation to fin the intersecting point.");
		
		Scanner input = new Scanner(System.in);
		int repeatInt = 1;
		while (repeatInt == 1) {
			System.out.println("Enter the x,y coordinate of the first line (x1, y1), (x2, y2) :");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			
			System.out.println("Enter the x,y coordinate of the second line (x3, y3), (x4,y4): ");
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();

			double a = y1 - y2;
			double b = -(x1 - x2);
			double c = (y3 - y4);
			double d = -(x3 - x4);
			double e = (y1 - y2) * x1 - (x1 - x2) * y1;
			double f = (y3 - y4) * x3 - (x3 - x4) * y3;

			/*LinearEquation le = new LinearEquation();
			a = le.seta(a);
			b = le.setb(b);
			c = le.setc(c);
			d = le.setd(d);
			e = le.sete(e);
			f = le.setf(f);

			if (le.isSolvable()) {
				System.out.println("The two lines intersect at x coordinate : "
						+ le.getx() + " and y coordinate " + le.gety());
			} else
				System.out
						.println("The Equation has no solution, the lines are parrallel");
		System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");*/
		repeatInt = input.nextInt();
		} // end while(repeat loop)
		input.close();
	}
}
