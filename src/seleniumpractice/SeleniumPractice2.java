package seleniumpractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masa�st�//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.cars.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Find a Car")).sendKeys(Keys.LEFT_CONTROL,Keys.ENTER);;
		
		String expectedTitle="Used Cars for Sale Online Near Me | Cars.com";
		
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> it=windowHandles.iterator();
		
		String parentWindow=it.next();
		String childWindow=it.next();
		
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}
	
}
