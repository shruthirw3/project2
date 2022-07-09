package werf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airindiacalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.airindiaexpress.in/en");
		driver.findElement(By.id("departureDateButton")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='picker-switch']")).getText().contains("July"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String day=driver.findElements(By.className("day")).get(i).getText();
			if(day.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
			break;
			}
		}
		
	
	}

}

