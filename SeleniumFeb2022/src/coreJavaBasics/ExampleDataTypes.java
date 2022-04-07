package coreJavaBasics;

public class ExampleDataTypes {
	
	//Single line comment
	
	
	/*Primitive and Non-primitive data types
	 * Multi-line comment: Primitive data types
	 * 1. boolean	- 1 byte - 8 bits
	 * 2. char		- 2 bytes - 16 bits	
	 * 3. byte		- 1 byte - 8 bits
	 * 4. short		- 2 byte - 16 bits
	 * 5. int		- 4 byte - 32 bits
	 * 6. long		- 8 bytes - 64 bits
	 * 7. float		- 4 byte - 32 bits
	 * 8. double 	- 8 byte - 64 bits
	 */
	
	//byte --> data type
	//s --> variable name
	//= --> assign a value
	//10 --> initialization
	
	//If we are not initializing the value, will that give any default value
	
	byte s1; // variable declaration
	byte s = 10; // Its range is -128 to 127
	short sh = 20; //Its range is -32768 to 32767
	int i = 100;
	long l = 200;
	float f = 123.123f;
	double d = 123.123456;
	char c = 'S'; //You have to use single quotes
	char c1 = 'a'; //ASCII values Capital A - 65 to 90, a = 97 z = 122
	boolean bTag = false;
	
	//This is main method which helps to execute the developed methods
	public static void main(String[] args) {
		ExampleDataTypes obj = new ExampleDataTypes();
//		System.out.println(obj.s);
//		System.out.println(obj.sh);
//		System.out.println(obj.i);
//		System.out.println(obj.l + obj.i);
//		System.out.println(obj.f);
//		System.out.println(obj.d);
//		System.out.println(obj.c);
		System.out.println(obj.c +obj.c1+ "");
	}
	
	

}
