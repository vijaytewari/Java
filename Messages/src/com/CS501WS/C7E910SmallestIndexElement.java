package com.CS501WS;

/* Assignment exercise: Chapter 7 excercise 7.9 and 7.10 merged.
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 */
import java.util.Scanner;

public class C7E910SmallestIndexElement {

	public static void main(String[] args) {
		double[] alist = new double[10];
		Scanner sc = new Scanner(System.in);
		int repeatInt = 1; 
		while(repeatInt == 1) {
			System.out.println("The program let user enter 10 numbers and then it determines the smallest number"
					+ "and the smallest index.");
			System.out.println("Enter "+ alist.length + " numbers separated with a space:");
			for (int i=0;i<alist.length;i++){
				alist[i] = sc.nextDouble();
			}
			System.out.println("Smallest element in the array is "+ smallestElement(alist));
			System.out.println("Snmallest index of the smallest element is "+ indexOfSmallestElement(alist));
			 // end of code lines responding to the exercise
		    System.out.print("\nRepeat program (enter 1 for yes or 0 for n)?: ");
		    repeatInt = sc.nextInt(); 
		 } // end while(repeat loop)
		sc.close();
		}
	
	public static double smallestElement(double[] alist){
		double min = alist[0];
		for (int x=0; x < alist.length; x++){
			if (alist[x] < min) min= alist[x];
		}
		return min;
	}
	
	public static int indexOfSmallestElement(double[] alist){
		double min = alist[0];
		int indexOf = 0;
		for (int x=0; x < alist.length; x++){
			if (alist[x] < min) {
				min = alist[x];
				indexOf=x;
			}
		}
		return indexOf;
	}
	
}
