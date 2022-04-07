package coreJavaBasics;

import java.util.Scanner;

public class RunningExamples {

	/*
	 * 1. I want to reassign the value with using third variable 2. I want to
	 * reassign the value without using third variable
	 */

	int x;
	int y;
	int z;

	void usingThirdVariable(int x, int y) {

		this.x = x; // 20
		this.y = y; // 10

		System.out.println("Before swapping the value of X is : " + this.x);
		System.out.println("Before swapping the value of Y is : " + this.y);
		z = x; // 10
		this.x = y;
		this.y = z;
		System.out.println("After swapping the value of X is : " + this.x);
		System.out.println("After swapping the value of Y is : " + this.y);

	}

	void withoutUsingThirdVariable(int a, int b) {

		int x = a; // 20
		int y = b; // 10
		System.out.println("Before swapping the value of X is : " + x);
		System.out.println("Before swapping the value of Y is : " + y);
		x = x + y; // 30
		y = x - y; // 10
		x = x - y; // 20
		System.out.println("After swapping the value of X is : " + x);
		System.out.println("After swapping the value of Y is : " + y);

	}

	void printMulTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a numeric value : ");
		int i = sc.nextInt();
		int x;
		for (x = 0; x <= 10; x++) {
			// 2 * 1 = 2, 2 * 2 = 4
			System.out.println(i + " * " + x + " = " + (i * x));
		}
	}

	// How to find duplicate values/chars in a string
	// Testing Masters

	void duplicateValues() {
		String s = "Testing Masters";
		// Changing the string to a character
		char[] c = s.toCharArray();
		int count;
		// we have to get the first char
		for (int i = 0; i < c.length; i++) { // c[0] = T
			count = 1;
			// we are trying to compare the other chars in a same string
			for (int j = i+1; j < c.length; j++) { // c[1] = e
				// if we have duplicate char we have to increase the count n number of times
				if (c[i] == c[j] && c[j] != ' ') {
					//Increment the count of value
					count++;
					//reinitialize the value to any other value
					c[j] = 0;
				}
			}
			if (count > 1 && c[i] != 0) {
				//print the duplicate chars in a string with value
				System.out.println("Count of characters " + c[i] + " is " + count);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningExamples obj = new RunningExamples();
		obj.duplicateValues();

	}

}
