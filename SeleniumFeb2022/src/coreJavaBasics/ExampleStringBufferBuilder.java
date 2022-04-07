package coreJavaBasics;

public class ExampleStringBufferBuilder {

	static String s = "Testing Maseter"; // String are immutables

	static void exampleStringBuffer() { // StringBuffer is mutable - thread safe

		StringBuffer sb = new StringBuffer("Testing Maseter");
		System.out.println(sb);
		sb.append('s');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

	static void exampleStringBuilder() { // StringBuilder is mutable - Not thread safe

		StringBuilder sb = new StringBuilder("Testing Maseter");
		System.out.println(sb);
		sb.append('s');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

	public static void main(String[] args) {

		exampleStringBuilder();

	}

}
