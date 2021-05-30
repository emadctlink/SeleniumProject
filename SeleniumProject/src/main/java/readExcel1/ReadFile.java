package readExcel1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	private static XSSFRichTextString sheet1value;

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ExcelSheet.xlsx"); 
			
		XSSFSheet sheet = wb.getSheet("AllValue");
		
		XSSFRow row = sheet.getRow(6);
		
		XSSFCell cell = row.getCell(2);
		
		sheet1value = cell.getRichStringCellValue();
		System.out.println(sheet1value);
		
	}

}
