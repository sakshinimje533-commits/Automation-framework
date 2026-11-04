package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Whole_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream myfile = new FileInputStream("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mysheet = myworkbook.getSheet("Sheet2");
		
		for(int i = 0; i<=2;i++) {
			for(int j =0; j<=2;j++) {
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		
	}
	

}

//output
//=======
//String Company Fruits 
//Sakshi Fujitsu Apple 
//Pune TCS Mang
