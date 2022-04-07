package coreJavaBasics;

import java.util.Scanner;

public class ConditionalStatements {

	/*
	 * 1. Scanner class is used to read a value from the user
	 */

	// if, else, elseif

	int x = 2;
	int y = 12;
	int z = 11;

	String expMonth = "Feb";
//	String expActual = "Mar";

	public static void main(String[] args) {
		ConditionalStatements obj = new ConditionalStatements();
		obj.switchExample();
	}

	void test() {

		if (expMonth == "Jan") {
			System.out.println("This is Jan month");
		} else if (expMonth == "Feb") {
			System.out.println("This is Feb month");
		} else if (expMonth == "Mar") {
			System.out.println("This is Mar month");
		} else if (expMonth == "Apr") {
			System.out.println("This is Apr month");
		} else {
			System.out.println("Please enter between Jan to Apr");
		}

	}

	void switchExample() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the month : ");
		// this is to read a string from the user
		String actMonth = sc.next().toUpperCase();
		
		switch (actMonth) {
		case "JAN":
			System.out.println("This is Jan month");
			break;
		case "FEB":
			System.out.println("This is Feb month");
			break;
		case "MAR":
			System.out.println("This is Mar month");
			break;
		case "APR":
			System.out.println("This is Apr month");
			break;
		default:
			System.out.println("Please enter the months between Jan to Apr ");

		}

		// this is to read a integer from the user
//		int i = sc.nextInt();
//
//		switch (i) {
//		case 1:
//			System.out.println("This is Jan month");
//			break;
//		case 2:
//			System.out.println("This is Feb month");
//			break;
//		case 3:
//			System.out.println("This is Mar month");
//			break;
//		case 4:
//			System.out.println("This is Apr month");
//			break;
//		default:
//			System.out.println("Please enter the values between 1 to 4: ");
//
//		}

	}

	void example() {
		if (x == y) // false
		{
			System.out.println("X is equal to Y");
			if (y == z) {
				System.out.println("Y is equal to Z");
				if (z == x) {
					System.out.println("Z is equal to X");
				} else {
					System.out.println("Z is not equal to X");
				}
			} else {
				System.out.println("Y is not equal to Z");
			}
		} else {
			System.out.println("X is not equal to Y");
		}
	}

	void elseifExample() {
		String month = "Feb";
		if (x == y) {
			System.out.println("X is equal to Y");
		} else if (y == z) {
			System.out.println("Y is equal to Z");
		} else {
			System.out.println("All the values are not equal");
		}

	}

	void example1() {
		if ((x == y || y == z) || x == z) {
//			System.out.println("X is not equal to Y");
			System.out.println("X is greater than or equal to Y");
		} else
			System.out.println("X is not greater than Y");
	}

}
