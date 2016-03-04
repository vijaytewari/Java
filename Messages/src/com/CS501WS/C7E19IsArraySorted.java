package com.CS501WS;
/* Assignment exercise: Chapter 7 excercise 7.19.
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 */
import java.util.Scanner;

public class C7E19IsArraySorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeatInt = 1;     
		while (repeatInt ==1){ 
			System.out.println("Program lets the user enter a list of numbers, which is stored in an Array "
					+ "and it then detemines if the array is sorted.");
			
			System.out.println("First number is the length of the array. "
					+ "The numbers thereafter will be stored in the array\n");
			System.out.println("Enter the length of the Array and numbers for the Array:\n");
			int max = sc.nextInt();
			double[] alist = new double[max];
			for (int i=0; i<max; i++){
				alist[i]= sc.nextDouble();
				//System.out.println(alist[i]);
			}
			boolean sorted = IslistSorted(alist);
			 if(!(sorted == false)){
				 System.out.println("The list is already sorted.");
			 }
			 else
				 System.out.println("Th list is not sorted.");
			//End of main program
			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
		    repeatInt = sc.nextInt(); 
		    } // end while(repeat loop)
		 sc.close(); 
	}

	private static boolean IslistSorted(double[] alist) {
		for (int i = 0; i < alist.length - 1; i++) {
	        if (alist[i] > alist[i + 1]) {
	            return false; //  not sorted.
	        }
	    }

	    return true; // sorted.
	}
	

}
