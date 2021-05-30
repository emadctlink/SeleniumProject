package readExcel1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllValue {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb1 = new XSSFWorkbook("./Data/ExcelSheet.xlsx");

		XSSFSheet sheet = wb1.getSheet("AllValue");
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		
		for (int i = 0; i < lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				
				XSSFRichTextString AllValue = cell.getRichStringCellValue();
				System.out.println(AllValue);
			}
			
		}
	
	}

}
