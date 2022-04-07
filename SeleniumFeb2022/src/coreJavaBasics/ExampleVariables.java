package coreJavaBasics;

public class ExampleVariables {

	/*
	 * Types of variables 1. local variable 2. instance variable 3. static variable
	 */

	// Instance/Non-Static variable - A variable declared inside a class and outside
	// the method
	
	//public --> available any where in the project
	//private --> its scope will remain with in the same class
	//protected --> Its scope remains with in the same package but then only through a child class you can call outside of the package
	//default --> If you don't give any access modifier it will be default, it scope remains within the same package
	int c = 1000; 
	
	
	int i = 1000;
	// Static variable
	static int x = 100;
	short s = 10;
	byte b = 10;
	int y;
	long s2; // yes
	int a = 20; // Instance

	public void divExample() {
		y = i / x;
		System.out.println(y);
	}

	public void modExample() {
		int a = 20; // LOcal variable
		s2 = s % b;
		System.out.println(y);
	}

	// How do we create a method
	public void localVariableExample() {
		System.out.println(i);
		int i = 200; // Local variable - A variable declared inside a method
		System.out.println(i);
	}

	public void localVariableExample1() {
		System.out.println(i);
		y = s + b;
		System.out.println(y);
	}

	public void addExample(String s) {
		System.out.println(i + x);
	}
	
	public int returnExample() {
		int c = i + x;
		return c;
	}
	
	public void acBalance() {
		returnExample();
		System.out.println("Balance is updated");
	}
	
	public void miniStatementBalance() {
		returnExample();
		System.out.println("Statement is updated");
	}

	public void mulExample() {
		y = i * x;
		System.out.println(y);
	}

	public static void main(String[] args) {

		ExampleVariables obj = new ExampleVariables();
		// Only through object we will be able to call instance/non-static variables
//		obj.addExample();
		obj.acBalance();
		obj.miniStatementBalance();
//		obj.addExample(10, 140);
//		obj.addExample(10, 150);
//		obj.modExample();
//		System.out.println(obj.i);
//		System.out.println(x);
//		System.out.println(obj.a);

	}

}
