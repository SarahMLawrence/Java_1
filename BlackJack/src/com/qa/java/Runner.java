package com.qa.java;

public class Runner {
	public static void main(String[] args) {
		double num1 = 10;
		double num2 = 21;

		if (num1 > 21 && num2 > 21) {
			System.out.println(0);
		} else if (num1 <= 21 && num1 > num2 || num2 > 21) {
			System.out.println(num2);
		}

	}
}
