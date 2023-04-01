package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] getData(String excelfilename) throws IOException {
		// To open a spreadsheet
		XSSFWorkbook book = new XSSFWorkbook("./testData/"+excelfilename+".xlsx");
		// To open a specific sheet
		XSSFSheet sheet = book.getSheetAt(0);
		// To get the number of rows of data available
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: " + rowCount);
		// To get the number of cols of data available
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: " + colCount);
		
		// Create 2D to store the data read from the excel
		String[][] data = new String[rowCount][colCount];
		
		// Iterate over the rows and cols
		for(int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for(int j = 0; j < colCount; j++) {
				XSSFCell cell = eachRow.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
			}
		}
		
		book.close();
		return data;
	
	}
}
