package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	FileOutputStream fout;
	File src;
    public ExcelDataConfig(String excelPath) {
    try {
	src= new File(excelPath);
    FileInputStream fis= new FileInputStream(src);
	wb=new XSSFWorkbook(fis);
			
			} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
}
 //=======Read Excel=========
 public String getData(int sheetnumber,int row,int column)
   {
	 sheet1=wb.getSheetAt(sheetnumber);
	 String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	 return data;
	 }
 //=======Writing in Excel=========
 /*public void putData(int sheetnumber,int row,int column,String value) throws Exception
 //{
	 //fout= new FileOutputStream(src);
	 //sheet1=wb.getSheetAt(sheetnumber);
	 //sheet1.getRow(row).createCell(column).setCellValue(value);
	 //try {
		//wb.write(fout);
		//wb.close();
	//} catch (Exception e) {
		// TODO Auto-generated catch block
		//System.out.println(e.getMessage());
	//}
	
		}*/
}