package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Open workbook
		// creating an object of Workbook class and pass path of data folder
		// here ./ is project path>data is folder name >Excelsheet.xlsx is file name with extension.
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ExcelSheet.xlsx");
		
		
		//get the sheet from workbook
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//select row from sheet
		XSSFRow row = sheet.getRow(3);
		
		//select cell from row (not from sheet)
		XSSFCell cell = row.getCell(1);
		
		//Actions- Read/get value from selected cell
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
		
	}

}
