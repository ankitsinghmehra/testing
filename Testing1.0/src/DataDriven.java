import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class DataDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	FileInputStream fi= new FileInputStream("C:\\test\\test.xlsx");
//	XSSFWorkbook wb=new XSSFWorkbook(fi);
//	XSSFSheet sh=wb.getSheetAt(0);
//	Row r=sh.getRow(0);
//	org.apache.poi.ss.usermodel.Cell c=r.getCell(0);
	
	
	//insertion in webpage
	//String str=c.toString();
	//CharSequence[] ch=str.split("");
	//driver.findElement(By.id("email")).sendKeys(ch);
	
	
	//insertion in xlsx file
	
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheetAt(0);
	Row r=sh.getRow(0);
	//org.apache.poi.ss.usermodel.Cell c=r.getCell(0);
	int rowcount=0;
	Row newrow=sh.createRow(rowcount+1);
	org.apache.poi.ss.usermodel.Cell cell=newrow.createCell(1);
	cell.setCellValue(driver.findElement(By.className("_5iyx")).getText());
	fi.close();
	FileOutputStream fo=new FileOutputStream("C:\\test\\test1  .xlsx");
	wb.write(fo);
	fo.close();
	System.out.println("retrieved");
	
}
catch(Exception ex){
	ex.printStackTrace();
}
	}

}
