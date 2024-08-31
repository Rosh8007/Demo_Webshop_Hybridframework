package Demo.webshop.Commons;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Commons {
	
	
  public static  FileInputStream fi;
  public static   XSSFWorkbook wb;
  public static   XSSFSheet sh;
  public static   XSSFRow ro;
  public static   XSSFCell cll;
    
 	
	 public static FileInputStream getData() throws IOException
   {
  	fi=new FileInputStream("src//test//resources//Excel//Registerondemowebshop.xlsx");
  	wb=new XSSFWorkbook(fi);
  	sh=wb.getSheet("Sheet1");
  	ro=sh.getRow(0);
  	
  	return fi;
   }

   public static String getFirstName() throws IOException
   {
  	 fi=new FileInputStream("src//test//resources//Excel//Registerondemowebshop.xlsx");
   	wb=new XSSFWorkbook(fi);
   	sh=wb.getSheet("Sheet1");
   	ro=sh.getRow(0);
   	String fname=ro.getCell(0).getStringCellValue();
		return fname;
   }
   
   public static String getlastName() throws IOException
   {
  	 fi=new FileInputStream("src//test//resources//Excel//Registerondemowebshop.xlsx");
   	wb=new XSSFWorkbook(fi);
   	sh=wb.getSheet("Sheet1");
   	ro=sh.getRow(0);
   	String lname=ro.getCell(1).getStringCellValue();
		return lname;
   }
   
   public static String getEmail() throws IOException
   {
  	 fi=new FileInputStream("src//test//resources//Excel//Registerondemowebshop.xlsx");
   	wb=new XSSFWorkbook(fi);
   	sh=wb.getSheet("Sheet1");
   	ro=sh.getRow(0);
   	String email=ro.getCell(2).getStringCellValue();
		return email;
   }
   
   public static String getPassWord() throws IOException
   {
  	 fi=new FileInputStream("src//test//resources//Excel//Registerondemowebshop.xlsx");
   	wb=new XSSFWorkbook(fi);
   	sh=wb.getSheet("Sheet1");
   	ro=sh.getRow(0);
   	String password=ro.getCell(3).getStringCellValue();
		return password;
   }
   
   public static String getconfPassWord() throws IOException
   {
  	 fi=new FileInputStream("src//test//resources//Excel//Registerondemowebshop.xlsx");
   	wb=new XSSFWorkbook(fi);
   	sh=wb.getSheet("Sheet1");
   	ro=sh.getRow(0);
   	String conpas=ro.getCell(4).getStringCellValue();
		return conpas;
   }
    
    

}
