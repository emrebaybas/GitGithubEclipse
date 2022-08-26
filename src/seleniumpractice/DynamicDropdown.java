package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DynamicDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//emrba//OneDrive//Masaüstü//Drivers//WebDrivers//chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lap");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div/div/span"));
		System.out.println(list.size());

	
		
		String searchKeyword="cooling"	;
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lap");
		for (int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getText().contains(searchKeyword)) {
				list.get(i).click();;
				break;
			}
		}
	}
	
}
