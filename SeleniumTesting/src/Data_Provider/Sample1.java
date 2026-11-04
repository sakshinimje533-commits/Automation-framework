package Data_Provider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample1 {
	@DataProvider(name = "cricketPlayers") 
	 public String[][] myData() throws EncryptedDocumentException, IOException { 
	  String testData[][] = readDataFromExcel("TestData", "Sheet4"); 
	  return testData; 
	 } 
	 
	 public static String[][] readDataFromExcel(String excelFileName, String sheetName) 
	   throws EncryptedDocumentException, IOException { 
	  String path = System.getProperty("user.dir") + "\\" + excelFileName + ".xlsx"; 
	  FileInputStream myFile = new FileInputStream(path); 
	  Sheet mySheet = WorkbookFactory.create(myFile).getSheet(sheetName); 
	  int rowCount = mySheet.getLastRowNum(); 
	  int cellCount = mySheet.getRow(0).getLastCellNum() - 1; 
	  System.out.println(rowCount); 
	  System.out.println(cellCount); 
	  String data[][] = new String[rowCount + 1][cellCount + 1]; 
	  for (int i = 0; i <= rowCount; i++) { 
	   for (int j = 0; j <= cellCount; j++) { 
	    String value = 
	mySheet.getRow(i).getCell(j).getStringCellValue(); 
	    data[i][j] = value; 
	   } 
	  } 
	 
	  return data; 
	 } 
}
