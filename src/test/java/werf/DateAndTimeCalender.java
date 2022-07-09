package werf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateAndTimeCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/");
		
	WebElement element=	driver.findElement(By.xpath("//input[@type='datetime-local']"));
		element.sendKeys("01022022");
		element.sendKeys(Keys.TAB);
		element.sendKeys("12:22PM");
		Thread.sleep(1000);
		driver.close();
	}

}
