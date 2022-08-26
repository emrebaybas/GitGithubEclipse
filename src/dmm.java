import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class dmm {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");

	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
		
	Actions a= new Actions(driver);
	
	WebElement timeTab=driver.findElement(By.id("menu_time_viewTimeModule"));
	
	
	a.moveToElement(timeTab).build().perform();
	
	WebElement reportsSubTab=driver.findElement(By.id("menu_time_Reports"));
	
	WebDriverWait w= new WebDriverWait(driver,8);
	w.until(ExpectedConditions.elementToBeClickable(reportsSubTab));
	
	a.moveToElement(reportsSubTab).build().perform();
	
	driver.findElement(By.id("menu_time_displayProjectReportCriteria")).click();
	
	driver.close();
	
	
	}

}
