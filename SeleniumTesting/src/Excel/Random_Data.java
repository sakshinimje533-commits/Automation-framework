package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Random_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx");
        CellType data = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(2).getCell(1).getCellType(); //STRING
		System.out.println(data); 
//		
//		String value = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(2).getCell(2).getStringCellValue();
	//	System.out.println(value); //INFOSYS
	}
}
