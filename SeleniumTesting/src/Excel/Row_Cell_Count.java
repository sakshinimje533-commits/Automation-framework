package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row_Cell_Count {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
      		int lastRowNum = mysheet.getLastRowNum();
      		System.out.println(lastRowNum);
      		
      		int totalNumberOfRow = lastRowNum;
      		
      		short lastCellNum = mysheet.getRow(0).getLastCellNum();
      		System.out.println(lastCellNum);
      		
      		int totalNumberOfCell = lastCellNum - 1;
      		
      		for(int i = 0 ; i <= totalNumberOfRow ; i++) {
      			for(int j = 0 ; j <= totalNumberOfCell ; j++) {
      				Cell mycell = mysheet.getRow(i).getCell(j);
      				CellType myCellType = mycell.getCellType();
      				
      				if(myCellType == CellType.NUMERIC) {
      				System.out.print(mycell.getNumericCellValue()+ " ");
      				}
      				
      				else if(myCellType == CellType.BOOLEAN){
      					System.out.print(mycell.getBooleanCellValue()+ " ");
      				}
      				
      				else if(myCellType ==CellType.STRING) {
      					System.out.print(mycell.getStringCellValue()+ " ");
      				}
      			}
      			System.out.println();
      		}
		
	}

}
