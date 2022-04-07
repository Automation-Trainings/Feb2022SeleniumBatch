package coreJavaBasics;

public class ExampleStaticNonStatic {
	
	static String orgName = "ABC";
	String empName ;
	static String loc = "Hyderabad";
	int empID ;
	
	void emp1() {
		System.out.println(orgName);
		System.out.println(empName = "Akhil");
		System.out.println(loc);
		System.out.println(empID = 123);
	}
	
	void emp2() {
		System.out.println(orgName);
		System.out.println(empName = "Arjun");
		System.out.println(loc);
		System.out.println(empID = 124);
	}
	
//	static int incrementNum = 1;
//	
//	public int ExampleStatic(){
//		return incrementNum++;
//	}
//
	public static void main(String[] args) {
		ExampleStaticNonStatic obj = new ExampleStaticNonStatic();		
		obj.emp1();
		System.out.println();
		obj.emp2();
		
//		ExampleStaticNonStatic obj1 = new ExampleStaticNonStatic();		
//		System.out.println(obj1.ExampleStatic());
//		
//		ExampleStaticNonStatic obj2 = new ExampleStaticNonStatic();		
//		System.out.println(obj2.ExampleStatic());
	}

}
