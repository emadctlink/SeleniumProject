package utils_IntegrareExcelDataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	//public static string[][] main(string[] args)throws IOException {
	public  String[][] readExcel() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data_DataProvider/DataProvider.xlsx");
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		// get row count to print all value from sheet(Last row count)
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		
		//get cell count to print all value from sheet then row (can't get direct from row because we didn't get row here)
		int columncount = sheet.getRow(0).getLastCellNum();
		System.out.println(columncount);
		
		//String data[][] = new String [2][3];
		String data[][] = new String [rowcount][columncount];
		
		//for loop for row
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			//for loop for cell
			for (int j = 0; j < columncount; j++) {
				XSSFCell cell = row.getCell(j);
			
				//get all value from sheet not particular cell because we got value from sheet
				String value = cell.getStringCellValue();
				System.out.println(value);
				
				//data[0][0] ="ABC";
				//data[i][j] =value; [note: i=1. i-1=1-1=0]
				data[i][j] =value;
				
			}
		}
		return data;		//return type
	}
		
}
