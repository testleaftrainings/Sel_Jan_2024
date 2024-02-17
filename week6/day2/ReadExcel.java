package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readExcel(String excelFileName) throws IOException {
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");// "+excelFileName+"
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no: of rows: "+rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total no: of columns : "+columnCount);
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;// data[1-1][0]="Testleaf";	
			}			
		}
		wBook.close();
		return data;
	}

}
