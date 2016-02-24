package com.CS501WS;

/**  * Program to demonstrate some good human-computer dialog and  * repeated testing/running the program to allow various user input  *  * @author MPJ  * @date 9/9/2015  */
import java.util.Scanner;
public class DialogRepeatLoopDemo {
public static void main(String[] args) {     
	Scanner input = new Scanner(System.in);
	
int repeatInt = 1;     
String intro =     "This program allows you to enter two numbers and " +    
				   "will calculate their sum";
    String askNums = "Enter two numbers separated by at least one space:";     
    double num1 = 0;     
    double num2 = 0;     
    double sum = 0;
    System.out.println(intro);     
    while(repeatInt == 1) {
    // beginning of code lines responding to the exercise     
    	System.out.println(askNums);     
    	num1 = input.nextDouble();     
    	num2 = input.nextDouble();     
    	sum = num1 + num2;     
    	System.out.println ( "The sum of " + num1 + " and " + num2 + " = "+ sum);
    // end of code lines responding to the exercise
    System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
    repeatInt = input.nextInt(); 
    } // end while(repeat loop)
} // end main()
} // end class