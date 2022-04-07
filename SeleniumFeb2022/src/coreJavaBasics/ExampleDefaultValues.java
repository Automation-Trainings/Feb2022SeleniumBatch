package coreJavaBasics;

public class ExampleDefaultValues {

	// Instance variables
	boolean Boolean;
	char Char;
	byte Byte;
	short Short;
	int Int;
	long Long;
	float Float;
	double Double;
	String string;

	public void defaultExample() {
		// Local variables
		boolean Boolean;
		char Char;
		byte Byte;
		short Short;
		int Int;
		long Long;
		float Float;
		double Double;
		String string;
//		System.out.println(Boolean); //You can not call the variable without initialization
	}

	public static void main(String[] args) {
		ExampleDefaultValues obj = new ExampleDefaultValues();
//		System.out.println(obj.Boolean); //false
//		System.out.println(obj.Char); //empty space
//		System.out.println(obj.Byte); //0
//		System.out.println(obj.Short); //0
//		System.out.println(obj.Int); //0
//		System.out.println(obj.Long); //0
//		System.out.println(obj.Float); //0.0
//		System.out.println(obj.Double); //0.0
//		System.out.println(obj.string); //null
		obj.defaultExample();
	}

}
