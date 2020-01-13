import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;

public class TestVersion1 {
	private static String fileWithPath;

	public static void main(String[] args) throws InterruptedException,IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
//		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
//		capabilities.setCapability("marionette", true);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		WebElement checkbox=driver.findElement(By.className("_1p7h2j"));
//		checkbox.click();
//		
//		if(!checkbox.isSelected()){
//			System.out.println("checked");
//		}
		
//		WebElement radio=driver.findElement(By.id("u_0_6"));
//		radio.click();
//		WebElement linktext=driver.findElement(By.id("u_0_13"));
//		linktext.click();
		
//		Select month=new Select(driver.findElement(By.id("month")));
//		month.selectByVisibleText("May");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:/Selection/Error.png"));
		
		
		
	}

}
