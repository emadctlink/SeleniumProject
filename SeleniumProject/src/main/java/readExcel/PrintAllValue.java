package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllValue {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ExcelSheet.xlsx");
		
		XSSFSheet sheet = wb.getSheet("AllValue");
		
		// get row count to print all value from sheet(Last row count)
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		
		//get cell count to print all value from sheet then row (can't get direct from row because we didn't get row here)
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		
		
		//for loop for row
		for (int i = 0; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			//for loop for cell
			for (int j = 0; j < cellcount; j++) {
				XSSFCell cell = row.getCell(j);
			
				//get all value from sheet not particular cell because we got value from sheet
				String AllValue = cell.getStringCellValue();
				System.out.println(AllValue);
			}
		}
		
		
	}

}
