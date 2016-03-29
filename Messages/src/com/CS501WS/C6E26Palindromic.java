package com.CS501WS;

import java.util.Scanner;

public class C6E26Palindromic {

	public static int[] intArray = new int[1000];
	public static void main(String[] args) {
		System.out.println("The program accepts a number and checks to see if it is a Palindromic Prime number");
					  
		Scanner sc = new Scanner(System.in);
		int repeatInt = 1;
		while(repeatInt == 1) {
			System.out.println("\n\nEnter a number  :");
			int x = 0;
			if(x<=1000){
				 x = sc.nextInt();
				 if(isPrime(x)==false){
					System.out.println("Not a Prime Number");
				 }
				 else{
					 if(IsPalin(x)==false){
						 System.out.println("Not a Palindromic Prime number"); 
					 }
					 else{System.out.println("The number is Palindromic Prime");}
				 }
			}
			// end of code lines responding to the exercise
			System.out.print("\n\nRepeat program (enter 1 for yes or 0 for n)?: ");
		    repeatInt = sc.nextInt(); 
		    
		}
		System.out.println("Exited Program.");
		sc.close();
	  	}

	private static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++){
			if(number % divisor==0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean IsPalin(int sPrime) {
	    int sPrimeBackup = sPrime;
	    int reverse = 0;

	    while (sPrime > 0) {
	        reverse = reverse * 10 + sPrime % 10;
	        sPrime = sPrime / 10;
	    }
	    return (sPrimeBackup == reverse);
	}
}

