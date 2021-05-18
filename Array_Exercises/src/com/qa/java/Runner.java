package com.qa.java;

public class Runner {
	public static void main(String[] args) {

		// array declaration
		int[] myArr;

		myArr = new int[10];

		// adding values to array
		myArr[0] = 15;
		myArr[1] = 20;
		myArr[2] = 21;
		myArr[3] = 35;
		myArr[4] = 26;
		myArr[5] = 21;
		myArr[6] = 7;
		myArr[7] = 13;
		myArr[8] = 2;
		myArr[9] = 6;
		// myArr[10] = 35;

		for (int i = 0; i < myArr.length; i++) {
			if (i >= 0) {
				System.out.println(myArr[i]);
			}
		}

		int[] otherArr = { 1, 8, 10, 16, 18 };

		for (int num : otherArr) {
			System.out.print("\nValue: " + num);

		}

	}

}
