package seleniumConcepts;

public class FrameworkDetails {

	int empID = 1234;
	String empName = "Testing";
	static int minValue ;
	static int maxLength ;
	int idEmployee = 1234;
	
	public static void exTest(int x, int i) {
		minValue = i;
		maxLength = x;
		for(i=0; i<=maxLength; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		exTest(5, 0);
	}
	
	
}
