package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		//Open the workbook using file name and the path of your file
		XSSFWorkbook wBook = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//Go to the Specific sheet (Sheet name / Sheet index)
		XSSFSheet sheet = wBook.getSheetAt(0);
//		//Go to the Specific Row (by index)
//		XSSFRow row = sheet.getRow(2);
//		
//		//Go to the specific Columns(Cell) -> By index
//		XSSFCell cell = row.getCell(3);
//		
//		//read the data in a specific cell
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);
		
		//get the rowcount
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no: of rows: "+rowCount);
		
		//columnCount ctrl+2, L
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total no: of columns : "+columnCount);
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
			
		}
		


		
		
	}

}
