package oopsFeatures;

public class ExampleTestCase1 extends ExampleEncapsulation{
	String actAtmPin = "1234";
	void verifyAtmPin() {
		if(getAtmPin().equals(actAtmPin)) {
			System.out.println("ATM pin is correct and ready to withdraw cash");
		}
		else {
			System.out.println("Please enter correct pin");
		}
	}

	public static void main(String[] args) {

		ExampleTestCase1 obj = new ExampleTestCase1();
		obj.setAtmPin("12345");
		obj.verifyAtmPin();
		
		
	}

}
