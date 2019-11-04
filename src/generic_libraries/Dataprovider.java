package generic_libraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Dataprovider implements Auto_const {
@DataProvider

	public static Object [][] getdata() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(excel_value);
		
		 Workbook ws = WorkbookFactory.create(fis);
		 
		 Sheet sh = ws.getSheet("Sheet1");
		 
		 Row row = sh.getRow(0);
		 
		 int rc = sh.getLastRowNum();
		 
		 short cell = row.getLastCellNum();
		 
		 Object[][] data=new Object[rc+1][cell];
		 
		 for (int i = 0; i < rc+1; i++) 
		 {
			 sh.getRow(i);
			 
			 for (int j = 0; j < cell; j++) 
			 {
				 Cell c = row.getCell(j);
				 
				 String val = c.toString();
				 
			}
			
		}
		 
		return data;
		
	}
}
