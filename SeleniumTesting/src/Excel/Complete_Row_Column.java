package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Complete_Row_Column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx");
		 Workbook myworkbook = WorkbookFactory.create(myfile);
		 Sheet mysheet = myworkbook.getSheet("Sheet2");
		 
		 //read complete row 
		 for(int i = 0 ; i<=2; i++) {
			 String value = mysheet.getRow(1).getCell(i).getStringCellValue();
			 System.out.print(value + " "); //String Company Fruits 
		 }
		 System.out.println();
		 
		//read complete column
		 for(int i = 0; i <= 2; i++) {
			String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value + " ");
//			String 
//			Sakshi 
//			Pune 

		 }
		 
		 

	}

}
