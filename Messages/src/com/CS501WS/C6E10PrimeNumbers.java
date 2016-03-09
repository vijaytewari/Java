package com.CS501WS;

/* Assignment exercise: Chapter 5 and 6  excercise 5.16 and 6.10 merged.
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 */ 

import java.util.Scanner;
public class C6E10PrimeNumbers {
	public static int[] intArray = new int[1000];
	public static void main(String[] args) {
		System.out.println("This is a merged program from excercise 5.16 and 6.10");
		System.out.println("The program stores the first 1000 prime numbers in an array, "
				+ "however it will only print the first 50 prime numbers.\n"
				+ "Thereafter it will promt the user to enter a number less than 1000, and validate against the stored prime numbers.  \n"
				+ "If it finds the number, it will give a message that the number is prime, else it will calculate its lowest prime numbers and print them.\n");
				
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(1000);
		  
		Scanner sc = new Scanner(System.in);
		int repeatInt = 1;
		while(repeatInt == 1) {
			System.out.println("\n\nEnter a number less then 1000 :");
			int x = 0;
			if(x<=1000){
				 x = sc.nextInt();
				 if(findPrime(x)==false){
					 findPrimeFactors(x);
				 }
			}
			// end of code lines responding to the exercise
			System.out.print("\n\nRepeat program (enter 1 for yes or 0 for n)?: ");
		    repeatInt = sc.nextInt(); 
		}
		System.out.println("Exited Program.");
	    intArray=null;
	}

	private static boolean  findPrime(int x) {
		for (int i=0;i<intArray.length; i++){
			//System.out.println(intArray[i]);
			if (intArray[i] == x){
				System.out.println("The number " + x + " is a prime number");
				return true;
			}
		}
		return false;
	}

	private static void findPrimeFactors(int C) {
		 {   
			    int x = C;
			    int a = 0;
			    System.out.println("The factors of the number " + C + " are:");
				for (int i = 2; i<= C; ++i) 
			    {   
			        while (x % i == 0) 
			        {
				      x = x / i;
				      System.out.print(i + " "); 
			        }
			    }
		  }
		
	}

	private  static void printPrimeNumbers(int numberOfPrimes) {
	
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
			while (count < numberOfPrimes) {
				if (isPrime(number)){
					intArray[count]=number;
					count++;
					if (count < 51) {
						if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
							System.out.printf("%-5s\n", number);
						}
						else
							System.out.printf("%-5s",number);
						
				    }
					
					
				}
				number++;
				
				
			}
	}

	private static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++){
			if(number % divisor==0){
				return false;
			}
		}
		return true;
	}

}
