package coreJavaBasics;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExampleExcelWorkings {

	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExampleExcelWorkings(String path, String sheetName) {
		try {
			// String path =
			// "C:\\Users\\hp\\eclipse-workspace\\SeleniumFeb2022\\TestData\\TestData.xlsx";
			wb = new XSSFWorkbook(path); // We are trying to locate workbook
			sheet = wb.getSheet(sheetName); // we are trying to access sheet
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	void getRowCount() {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
	}

	void readCellData(int rowNum, int colNum) {
		try {
			DataFormatter df = new DataFormatter();
			Object cellData = df.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println(cellData);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
