package oopsFeatures;

public abstract class ExampleAbstraction {
	
	//We cannot create instance for an abstract class
	//To declare a abstract class, abstract key word should be used before class
	//Abstract class can have abstract methods and non-abstract method
	
	void homeLoan() { //Non-abstract method
		//method body
	}
	
	abstract void cashWithdraw(); //abstract method - without implementation 
	abstract void cashDeposit();
	abstract void personalLoans(); 

}
