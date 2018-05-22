package Pack2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pack1.Class1;



public class file_io 
{
	static Class1 obj=new Class1();

	public static void main(String args[]) throws IOException
	{
obj.mul(2,3);
		File src=new File("D:\\Renuka\\Book11.xlsx");
		
		FileInputStream finput=new FileInputStream(src);
		
		XSSFWorkbook workbook = new XSSFWorkbook(finput);
				
		XSSFSheet sheet = workbook.getSheetAt(0);	
		
		for (int i=1;i<= sheet.getLastRowNum();i++)
		{
		XSSFCell cell = sheet.getRow(i).getCell(1);
		
		//if (cell2.getStringCellValue().equalsIgnoreCase("Yes")) 
		//cell.setCellType(cell.CELL_TYPE_STRING);
		//driver.findElement(By.id("username")).sendKeys(cell.getStringCellValue());
		
		System.out.println(cell);
		}
		FileOutputStream foutput=new FileOutputStream(src);
		
		String message="tested";
				
		sheet.getRow(1).createCell(3).setCellValue(message);
		
		workbook.write(foutput);
		
		foutput.close();
		
		//To create a new WorkBook with xlsx extension
        File fileName = new File("D:\\Fund.xlsx");
        
        FileOutputStream fos = new FileOutputStream(fileName);
        XSSFWorkbook  workbook1 = new XSSFWorkbook();            

        XSSFSheet sheet1 = workbook1.createSheet("fund");  

        XSSFRow row = sheet1.createRow(0);   
        XSSFCell cell0 = row.createCell(0);
        cell0.setCellValue("Nav Value");

        XSSFCell cell1 = row.createCell(1);

        cell1.setCellValue("Amount Change");       

        XSSFCell cell2 = row.createCell(2);
        
        cell2.setCellValue("Percent Change");

        workbook1.write(fos);
        workbook1.close();
        fos.flush();
        fos.close();
		
		
		
	}
	

}
