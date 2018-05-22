package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
	public XSSFSheet ExcelreadXSSF() throws IOException
	{
	String Filename="keywordexcel.xlsx"	;
	File src=new File(System.getProperty("user.dir")+"\\"+Filename);
	
	FileInputStream finput=new FileInputStream(src);
	String fileExtensionName=Filename.substring(Filename.indexOf("."));
	
	if (fileExtensionName.equals(".xlsx"))
	{
	XSSFWorkbook workbook = new XSSFWorkbook(finput);
		
	XSSFSheet sheet = workbook.getSheetAt(0);	
	return sheet;
	}
	else 
	{
	return null;
	}
	
	}
	
	public HSSFSheet ExcelreadHSSF() throws IOException
	{
	String Filename="keywordexcel.xlsx"	;
	File src=new File(System.getProperty("user.dir")+"\\"+Filename);
	
	FileInputStream finput=new FileInputStream(src);
	String fileExtensionName=Filename.substring(Filename.indexOf("."));
	
	if (fileExtensionName.equals(".xls"))
	{
		HSSFWorkbook workbook = new HSSFWorkbook(finput);
		
		HSSFSheet sheet = workbook.getSheetAt(0);	
		return sheet;
	}
	else 
	{
	return null;
	}
	}
}