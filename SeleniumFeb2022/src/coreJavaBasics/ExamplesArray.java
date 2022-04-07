package coreJavaBasics;

public class ExamplesArray {

	/*
	 * 1. Single dimensional 2. Multi-Dimensional data type - Object - It is
	 * superset of all the data types What all can store in an array?
	 */
	
	int x = 10;
	int y = x;

	void singleDimensionalArray() {
		// First way to declare
		int[] i = { 10, 20, 30, 40, 50 };
		// Second way of declaration
		String s[] = new String[10];
		s[0] = "A";
		s[2] = "B";

		for(int x=0; x<s.length; x++) {
			System.out.println(s[x]);
		}

		//Advance for loop
		for (int x : i) {
			System.out.println(x);
		}
		
		
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s[2]);

	}

	void MultiDimensionalArray() {
		// 1 2 3
		// 4 5 6
		// 7 8 9

		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		System.out.println("Length of multi dimensional array is : " + x.length);

		for (int i = 0; i <= x.length - 1; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		ExamplesArray obj = new ExamplesArray();
		obj.singleDimensionalArray();
	}

}
