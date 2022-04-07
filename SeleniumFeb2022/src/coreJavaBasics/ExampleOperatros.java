package coreJavaBasics;

public class ExampleOperatros {
	/*
	 * pre-increment
	 * post-increment
	 * pre-decrement
	 * post-decrement
	 */	 
	
	static int i = 10; //
	int i1 = 10;
	
	public static void preincrementOperator() {		
		System.out.println(i); //1
		System.out.println(++i); //2 i = i + 1
		System.out.println(i); //2
		System.out.println(++i); //3
	}
	
	public void postincrementOperator() {		
		System.out.println(i); //1 
		System.out.println(i++); //1 2 i = i + 1
		System.out.println(i); //2
		System.out.println(i++); //2
		System.out.println(i); //3
	}
	
	public void predecrementOperator() {		
		System.out.println(i); //10
		System.out.println(--i); //9
		System.out.println(i); //9
		System.out.println(--i); //8
	}
	
	public void postdecrementOperator() {		
		System.out.println(i); //10
		System.out.println(i--); //10
		System.out.println(i); //9
		System.out.println(i--); //9
		System.out.println(i); //8
	}
	
	void prePostIncrement() {
		System.out.println(i); //10
		System.out.println(--i); //9
		System.out.println(i++); //9
		System.out.println(i); //10
		System.out.println(i--); //10
		System.out.println(i); //9
		System.out.println(i++); //9
		System.out.println(--i); //9
		System.out.println(i--); //9
		System.out.println(i); //8
	}

	
	
	public static void main(String[] args) {
		ExampleOperatros obj = new ExampleOperatros();
		obj.postincrementOperator();
		preincrementOperator();
	}

}
