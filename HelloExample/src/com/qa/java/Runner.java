package com.qa.java;

public class Runner {

	// Member attributes
	public static int id;
	public static String ms = "Hello World";

	// Member - Method has a scope
	public static void main(String[] args) {
		// int result;
		// result = add();

		// System.out.println(result);
		printThese(1, 2);
	}

	public static void printThese(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);

	}

	public static int add() {
		return 5 + 6;
	}
}
