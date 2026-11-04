package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mysheet = myworkbook.getSheet("Sheet3");
		Row myRow = mysheet.getRow(4);
		Cell myCell = myRow.getCell(2);
		CellType datatype = myCell.getCellType();
		System.out.println(datatype); //STRING
		
		String value = myCell.getStringCellValue();
		System.out.println(value); //ZENSAR
		
	}

}
