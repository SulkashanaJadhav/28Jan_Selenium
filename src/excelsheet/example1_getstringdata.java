package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getstringdata 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("\"C:\\Users\\Admin\\OneDrive\\Documents\\software testing\\28thjan.xlsx\"");
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(value);
	
	
	

//Workbook book=WorkbookFactory.create(file);		//diffclassname.methodname();

//Sheet sh = book.getSheet("Sheet1");
//Row rw = sh.getRow(1);
//Cell c1= rw.getCell(0);
//String value= c1.getStringCellValue();
//System.out.println(value);
	
 
   
		  
  
}
}
