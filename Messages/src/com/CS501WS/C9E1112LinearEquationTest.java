/* Assignment exercise 9.11 and 9.12 ( one program ) 
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 * solve 2x2 system of linear equation and find the x and y coordinate of the intersecting line. 
 */

package com.CS501WS;

import java.util.Scanner;

public class C9E1112LinearEquationTest {

	public static void main(String[] args) throws Exception {
		System.out
				.println("The program finds out the intersecting point of two lines using Cramer's"
						+ " linear equation formula");
		Scanner input = new Scanner(System.in);
		int repeatInt = 1;
		while (repeatInt == 1) {
			System.out
					.println("Enter the x,y coordinate of the first line (x1, y1), (x2, y2) :");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();

			System.out
					.println("Enter the x,y coordinate of the second line (x3, y3), (x4,y4): ");
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();

			LinearEquation le = new LinearEquation(x1, y1, x2, y2, x3, y3, x4,
					y4);

			if (le.isSolvable()) {
				System.out.println("The two lines intersect at x coordinate : "
						+ le.getx() + " and y coordinate " + le.gety());
			} else
				System.out.println(le.getErrorMessage());
			// End of main program.
			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
			repeatInt = input.nextInt();
		} // end while(repeat loop)
		input.close();
	}
	boolean numberOrNot(String input)
	{
	    try
	    {
	        Integer.parseInt(input);
	    }
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	    return true;
	}
}
