package trellogenericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TFileUtility {

	public String readDataFromProprtyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TrelloData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	  public void readDataFromExcel() throws IOException {
	  
	 FileInputStream excelFile=new
	  FileInputStream("./src/test/resources/trellodata.xlsx"); 
	 
	 XSSFWorkbook workbook=new XSSFWorkbook(excelFile); 
	 XSSFSheet sheet=workbook.getSheet("mydata"); 
	 int rowcount = sheet.getLastRowNum(); 
	 int columncount = sheet.getRow(0).getLastCellNum(); 
	 for (int i = 0; i < rowcount;i++) { 
		 XSSFRow currentrow=sheet.getRow(i);
	 for (int j = 0; j < columncount;j++){ 
		String value = currentrow.getCell(j).toString();
	  System.out.println(value); 
	  }
	 }
	  
	  System.out.println(sheet.getRow(2).getCell(2));
	  }

}