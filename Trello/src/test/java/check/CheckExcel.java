package check;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CheckExcel {
public static void main(String[] args) throws IOException {
	FileInputStream excelFile=new FileInputStream("./src/test/resources/trellodata.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	/*
	 * System.out.println(sheet.getRow(1).getCell(2).getStringCellValue()); int
	 * rowcount = sheet.getLastRowNum(); int columncount =
	 * sheet.getRow(0).getLastCellNum(); for (int i = 0; i < rowcount; i++) {
	 * XSSFRow currentrow=sheet.getRow(i); for (int j = 0; j < columncount; j++) {
	 * String value = currentrow.getCell(j).toString(); System.out.println(value); }
	 * }
	 */
	
	}
}

