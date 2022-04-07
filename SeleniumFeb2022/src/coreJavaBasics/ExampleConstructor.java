package coreJavaBasics;

public class ExampleConstructor {

	// default
	// parametarized

	int x;

	public ExampleConstructor() {

		// default constructor

	}

	public ExampleConstructor(int a, String b) {

		// default constructor

	}

	public void method() {
		int x;
//		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleConstructor obj = new ExampleConstructor();
		System.out.println(obj.x);
	}

}
