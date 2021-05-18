package com.qa.java;

public class Runner {

	// Global variable

	public static void main(String[] args) {

		// int result;
		// result = addition();
		// System.out.println(result);
		addition(97, 98);
		multiplcation(76, 78);
		subtraction(99, 78);
		division(99, 100);

	}

	// Addition method that will result the sum of the two numbers
	public static void addition(int num1, int num2) {
		System.out.println(num1 + num2);

	}

	public static void multiplcation(int num1, int num2) {
		System.out.println(num1 * num2);

	}

	public static void subtraction(int num1, int num2) {
		System.out.println(num1 - num2);

	}

	public static void division(int num1, int num2) {
		System.out.println(num1 / num2);

	}

}
