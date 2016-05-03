package com.CS501WS;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 120;

	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	/** Push a new integer to the top of the stack */
	public void push(int value) {
		if (isPrime(value)){
			if (size >= elements.length) {
				int[] temp = new int[elements.length * 2];
				System.arraycopy(elements, 0, temp, 0, elements.length);
				elements = temp;
			}
			elements[size++] = value;
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
	
	/** return and remove the top element from the stack */
	public int pop() {
		return elements[--size];
	}

	/** return the top element from the stack */
	public int peek() {
		return elements[size - 1];
	}

	/** test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** return the number of elements in the stack */
	public int getSize() {
		return size;
	}

}
