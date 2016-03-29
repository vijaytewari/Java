package com.CS501WS;

import java.util.Scanner;

public class C6E18CheckPassword {

    static String enteredPassword;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        enteredPassword = input.nextLine();
        Checker tc = new Checker(enteredPassword);
        tc.checkSecurity();

    }

}