package coreJavaBasics;

public class ExampleBreakContinue {

	static void exampleBreak(int x) {
		for (int i = 0; i <= 10; i++) {
			if (i == x) {
				break;
			}
			System.out.println(i);
		}
	}
	
	static void exampleContinue(int x) {
		for (int i = 0; i <= 10; ++i) {
			if (i == x) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		exampleContinue(5);

	}

}
