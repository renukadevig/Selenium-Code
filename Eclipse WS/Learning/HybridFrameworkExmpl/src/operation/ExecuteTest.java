package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExecuteTest {

	public static void main(String args[]) throws Exception 
	{
		UIOperation operation=new UIOperation();
		operation.InitiateDriver();
		Thread.sleep(2000);
		ReadObject object = new ReadObject();
		Properties allobject=object.getObjectRepository();
		
		ReadExcelFile readfile=new ReadExcelFile();
		XSSFSheet sheet = readfile.ExcelreadXSSF();
		
		Thread.sleep(2000);		
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for (int i=1;i<rowcount+1;i++)
		{
			Row row = sheet.getRow(i);
			if(row.getCell(0).toString().length()==0)
			{
				System.out.println(row.getCell(1).toString()+"----------"+row.getCell(2).toString()+
						"---------"+row.getCell(3).toString()+"------"+row.getCell(4).toString());
				
				operation.perform(allobject, row.getCell(1).toString(), row.getCell(2).toString(), 
						row.getCell(3).toString(), row.getCell(4).toString());
			}
			else
			{
				System.out.println("New Testcase->"+row.getCell(0).toString()+" Started");
			}
			
		}

	}

}
