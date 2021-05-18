package com.qa.java;

public class Runner {

	public static double passMark = 70;

	public static void main(String[] args) {
		double percent = 70;
		boolean flag = true;

		System.out.println(percent + "%");

		// == equals compare
		// > greater than
		// < less than
		// >= greater than or equal to
		// <= less than or equal to

		// logical operators
		// bitwise
		// AND - & (condition1 & condition2)
		// true true - true
		// false true - false
		// true false - false
		// false false - false
		// OR - | (condtion1 | condition2)
		// true true - true
		// true false - true
		// false true - true
		// false false - false

		// logical
		// AND - && (condition1 && condtion2) as soon as one false - ignores both and
		// evaluates "false"
		// OR - || (condition1 || condition2) as soon as one true - ignore both and
		// evaluates "true"

		if (percent >= passMark) {
			System.out.println("You have passed");
		} else if (percent == passMark) {
			System.out.println("You have just passed");
		} else {
			System.out.println("You have failed");
		}

	}
}
