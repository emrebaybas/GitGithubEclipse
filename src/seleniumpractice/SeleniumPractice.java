package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://expedia.com");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		driver.navigate().to("https://amazon.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().sendKeys("asd");
		
		
//	driver.get("https://www.cars.com/");
//	driver.findElement(By.linkText("Find cars for sale")).sendKeys(Keys.LEFT_CONTROL,Keys.ENTER);
//		
//	Set<String> windowHandles=driver.getWindowHandles();
//	Iterator<String> it=windowHandles.iterator();
//	String parentWindow=it.next();
//	String childWindow=it.next();
//	
//	driver.switchTo().window(childWindow);
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.close();
//	driver.switchTo().window(parentWindow);
//	System.out.println(driver.getCurrentUrl());
	
	
	
		//Add a File with SendKeys
	driver.get("https://www.freepdfconvert.com/pdf-to-word");
	driver.findElement(By.xpath("//input[@accept=\".pdf\"]")).sendKeys("C://Users//emrba//OneDrive//Masaüstü/dummyPDF.pdf");
	
	
		
		
	}

}
