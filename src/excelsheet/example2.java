package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\software testing\\28thjan.xlsx\"");
			
	String value = 	WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

			System.out.println(value);
			// Workbook book = WorkbookFactory.create(file); 
			//diffClassname.methodname();
			// Sheet sh = book.getSheet("Sheet1")
}
}
