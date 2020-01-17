package AmazonTest;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVersion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harpic");
			driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/span/a")).click();
			Thread.sleep(5000);
			Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        driver.findElement(By.id("add-to-cart-button")).click();
	        
	        
	        Thread.sleep(5000);
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("scotch");
	        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
	        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > span > div > div > span > a > div > img")).click();
	        Thread.sleep(5000);
			Set<String> ids1 = driver.getWindowHandles();
	        Iterator<String> it1 = ids1.iterator();
	        String parentId1 = it1.next();
	        String parentId2=it1.next();
	        String childId1 = it1.next();
	        driver.switchTo().window(childId1);
	        driver.findElement(By.id("add-to-cart-button")).click();
	        
	        
	        Thread.sleep(5000);
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("turban for men");
	        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
	        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(7) > span > div.s-result-list.sg-row > div:nth-child(4) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-24.sg-col-4-of-12.sg-col-4-of-36.sg-col-4-of-28.sg-col-4-of-16.sg-col.sg-col-4-of-20.sg-col-4-of-32 > div > div > span > a > div > img")).click();
	        Thread.sleep(5000);
	        Set<String> ids2 = driver.getWindowHandles();
	        Iterator<String> it2 = ids2.iterator();
	        String parentId3 = it2.next();
	        String parentId4=it2.next();
	        String parentId5=it2.next();
	        String childId2 = it2.next();
	        driver.switchTo().window(childId2);
	        driver.findElement(By.id("add-to-cart-button")).click();
	        
	        
	        Thread.sleep(5000);
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
	        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
	        driver.findElement(By.cssSelector("#anonCarousel1 > ol > li:nth-child(2) > div > div > span > a > div > img")).click();
	        Thread.sleep(5000);
	        Set<String> ids3 = driver.getWindowHandles();
	        Iterator<String> it3 = ids3.iterator();
	        String parentId6 = it3.next();
	        String parentId7=it3.next();
	        String parentId8=it3.next();
	        String parentId9=it3.next();
	        String childId3 = it3.next();
	        driver.switchTo().window(childId3);
	        driver.findElement(By.id("add-to-cart-button")).click();
	        
	        
	        Thread.sleep(5000);

		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
