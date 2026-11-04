package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_DifferentType_Of_Data {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
FileInputStream file = new FileInputStream("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx");
		
        Workbook book = WorkbookFactory.create(file);
        
        Sheet mysheet = book.getSheet("Sheet3");
        
        int totalNumberOfRow = mysheet.getLastRowNum();
        short lastCellNum = mysheet.getRow(1).getLastCellNum();
       int totalNumberOfCell = lastCellNum - 1;
       
       System.out.println(totalNumberOfRow);
       System.out.println( totalNumberOfCell);
       
       for(int i = 0 ; i <= totalNumberOfRow ; i++) {
    	   for(int j = 0 ; j <= totalNumberOfCell ; j++) {
    		  CellType datatype = mysheet.getRow(i).getCell(j).getCellType();
    		 // System.out.print(datatype+ "\t");  
    		  
    		  if(datatype == CellType.STRING) {
    			 String value = mysheet.getRow(i).getCell(j).getStringCellValue();  
    			 System.out.print(value+  " ");
    		  }
    		  
    		  else if (datatype == CellType.BOOLEAN) {
    			  boolean value = mysheet.getRow(i).getCell(j).getBooleanCellValue();
    			  System.out.print(value+ " ");
    			  
			} else if(datatype == CellType.NUMERIC){
				
				double value = mysheet.getRow(i).getCell(j).getNumericCellValue();
				 System.out.print(value+ " ");
			}
    		  
    	   }
    	   System.out.println( );
    	   
       }
	}
	

}

//output
//===============
//4
//3
//Name Code String Value 
//Sakshi 4 TCS false 
//Farhim 1 INFOSYS true 
//Rekha 2 ACCENTURE false 
//Sanvi 3 ZENSAR true 

