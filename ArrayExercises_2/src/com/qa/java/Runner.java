package com.qa.java;

public class Runner {
	public static void main(String[] args) {
		// the max index in an array is the size - 1

		// array declaration
		int[] myIntArr;

		// if we initialize on a separate line, we cannot initailze
		// it with values
		myIntArr = new int[3];

		// adding values to an array
		myIntArr[0] = 34;
		myIntArr[1] = 56;
		myIntArr[2] = 34;
		// myIntArr[3] = 45; // cannot do as we can only store 3 elements

		// declare and initizlising with values
		int[] myOtherIntArr = { 100, 25, 32, 46, 53 };

		// Get some values from the array
		int someNum = myOtherIntArr[2];
		// System.out.println(someNum);

		// for loop
		for (int i = 0; i < myOtherIntArr.length; i++) {
			int iTimesTwo = myOtherIntArr[i] * 2;
			// System.out.println(iTimesTwo);

		}

		for (int i = myOtherIntArr.length - 1; i >= 0; i--) {
			System.out.println(myOtherIntArr[i]);
		}

		// for each loop
		for (int num : myOtherIntArr) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

		// 1 dimensional array
		// declare and initializing with values
		int[] IntArr = { 100, 25, 32, 46, 53 };

		// multi-dimensional
		// - arrays inside arrays
		// 2d array
		String[][] nameArrays = { { "Bob", "Fred" }, { "Sarah", "Sally" } };
		String fred = nameArrays[0][1];
		System.out.println(fred);

		// iterating through an multi-dimensional array
		// -nested for loops
		for (int i = 0; i < nameArrays.length; i++) {
			for (int j = 0; j < nameArrays[i].length; j++) {
				System.out.println(nameArrays[i][j]);
			}
		}

	}
}
