package generic_libraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public void Write_excel(int row, String sheet,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("./excel/data.xlsx");
		
		Workbook ws = WorkbookFactory.create(fis);
		
		Sheet sh = ws.getSheet(sheet);
		
		Row rw = sh.createRow(row);
		
		Cell cl = rw.createCell(cell);
		
		
		FileOutputStream fos = new FileOutputStream("./excel/data.xlsx");
		
		ws.write(fos);
		
		
	}
	

}
