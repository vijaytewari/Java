package com.CS501WS;

import java.util.Scanner;

public class C6E18CheckPasswordMainProgram {

  static String sPassword;
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("The Password must have atleast eight characters");
        System.out.println("The Password consists of letters and digits");
        System.out.println("The Password must contain atleast two digits");
         
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    int repeatInt = 1;
		while(repeatInt == 1) {
			 System.out.println("Please enter the password: ");
	        sPassword = input.nextLine();
	        C6E18PasswordValidator pv = new C6E18PasswordValidator(sPassword);
	        if(pv.checkPasswordSecurity()==true){
	        	System.out.println("This is a valid Password");
	       	}
	        else
	        	{System.out.println("This is an invalid (Password");
	        }
	        
	        // end of code lines responding to the exercise
 			System.out.print("\n\nRepeat program (enter 1 for yes or 0 for n)?: ");
 		    repeatInt = sc.nextInt(); 
	    }
		input.close();
    }
   
}