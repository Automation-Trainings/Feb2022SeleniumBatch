package coreJavaBasics;

public class StaticNonStatic {

	byte b = 127;
	short s1 = b; 
	int x = 32790;
	long l = 1234567l;
	short s = (short)x; //-32768 to 32767
	static int y = 20;

	void exampleMethod() { // Non-static method
		System.out.println(x);
		System.out.println(y);
	}

	static void exampleMethod1() { // Static method
		StaticNonStatic obj = new StaticNonStatic();
		System.out.println(obj.s); //without an object, we will not be able to call instance variable to static method
//		System.out.println(y);
		System.out.println(obj.s1=130);
	}

	public static void main(String[] args) {
		StaticNonStatic obj = new StaticNonStatic();
//		obj.exampleMethod();
		exampleMethod1();
	}

}
