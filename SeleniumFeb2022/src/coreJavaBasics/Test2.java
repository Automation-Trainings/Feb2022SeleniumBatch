package coreJavaBasics;

public class Test2 extends ExampleExcelWorkings{	

	public Test2(String path, String sheetName) {
		super(path, sheetName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String excelPath = "C:\\Users\\hp\\eclipse-workspace\\SeleniumFeb2022\\TestData\\TestData.xlsx";
		String sheetName = "Sheet1";
		ExampleExcelWorkings obj = new ExampleExcelWorkings(excelPath, sheetName);
		obj.getRowCount();
		obj.readCellData(5, 0);
		obj.readCellData(4, 0);
		
	}

}
