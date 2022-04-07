package coreJavaBasics;

public class ExampleLoops {

	// print even numbers b/w 0 - 50

	// 1 * 1 = 1
	// 1 * 2 = 2
	static int x = 1;

	static void printNubers() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	static void exampleWhileLOop() {
		int i = 0;
		while (i <= 50) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	static void exampleDoWhileLOop() {
		int i = 50;
		do {
			if (i % 2 == 0) {
				System.out.println(i); // 51
			}
			i++;
		} while (i <= 50);
	}

	public static void main(String[] args) {
		exampleDoWhileLOop();
	}

}
