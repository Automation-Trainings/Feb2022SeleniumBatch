package seleniumConcepts;

public class ExampleExceptionHandling {

	// Compilation error, run time / logical exception error
	// try, catch, finally, throw, throws
	
	int i = 10;
	int z;
	
	void throwException(int x) {
		if(x==0) {
			throw new ArithmeticException("Cannot divide the value by zero");
		}
		else {
		z = i / x;	
		System.out.println(z);
		}
	}

	void exceptionHandling(int y) {
		try {
			int x = 50;
			System.out.println(x / y);
//			Thread.sleep(5000);
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			System.out.println("Cannot divide the value by zero, please enter greater than zero");
		}
	}

	public static void main(String[] args) {

		ExampleExceptionHandling obj = new ExampleExceptionHandling();
		obj.throwException(0);
		

//		try {
//			int[] z = { 10, 20, 0, 40, 50 };
//			for (int i = 0; i < z.length; i++) {
//				obj.exceptionHandling(z[i]);
//			}
//		} finally {
//			System.out.println("Finally block is executed");
//		}

	}

}
