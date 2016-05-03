package com.CS501WS;

public class C10E6TestStackOfIntegers {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		System.out.println("The program prints all prime numbers less then 120 in reverse order.");
		for (int i=0;i<120;i++)
			stack.push(i);
		while(!stack.empty())
			System.out.println(stack.pop() +  " ");
	}
}
