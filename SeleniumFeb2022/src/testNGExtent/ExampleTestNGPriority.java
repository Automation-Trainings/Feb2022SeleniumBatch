package testNGExtent;

import org.testng.annotations.Test;

public class ExampleTestNGPriority {
	
	//ASCII a=97 A=65 C=67

	@Test (priority=-1)
	void aaa() {
		System.out.println("a method is executed");
	}

	@Test(priority=-10)
	void aZa() {
		System.out.println("Z method is executed");
	}

	@Test(priority=1)
	void aea() {
		System.out.println("e method is executed");
	}

	@Test(priority=4)
	void aBa() {
		System.out.println("B method is executed");
	}

}
