package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel_Read {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx");
		
        Workbook book = WorkbookFactory.create(file);
        
        Sheet mysheet = book.getSheet("Sheet2");
        int totalNumberOfRow = mysheet.getLastRowNum();
       short lastCellNum = mysheet.getRow(1).getLastCellNum();
      int totalNumberOfCell = lastCellNum - 1;
        
       for(int i = 0 ; i <= totalNumberOfRow ; i++) {
    	   for(int j = 0 ; j <= totalNumberOfCell ; j++) {
    		   
    		   String data = mysheet.getRow(i).getCell(j).getStringCellValue();
    		   System.out.print(data+ " ");
    		   
    		   
    	   }
    	   System.out.println( );
       }
       
       
       
		
	}

}
