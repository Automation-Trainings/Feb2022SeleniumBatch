package coreJavaBasics;

public class Test1 extends ExampleExcelWorkings{	

	public Test1(String path, String sheetName) {
		super(path, sheetName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String excelPath = "D:\\Softwares\\TestData.xlsx";
		String sheetName = "Test";
		ExampleExcelWorkings obj = new ExampleExcelWorkings(excelPath, sheetName);
		obj.getRowCount();
		obj.readCellData(5, 0);
		obj.readCellData(7, 0);
		
	}

}
