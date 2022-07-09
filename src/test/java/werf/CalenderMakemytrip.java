package werf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.client.model.geojson.Point;

public class CalenderMakemytrip {

	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		WebElement departcal=driver.findElement(By.xpath("//span[contains(@class,'appendBottom10')][text()='DEPARTURE']"));
			departcal.click();
		//select month
		Thread.sleep(1000);
		String currentmonth=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		if(!currentmonth.equals("July 2022"))
		do	
		{		Thread.sleep(1000);

			driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']//following-sibling::span")).click();
		}while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().equals("July 2022"));
		
		Thread.sleep(1000);

					List<WebElement> alldateofmonth=driver.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]"));
					Thread.sleep(1000);
int count=driver.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]")).size();
for(int i=0;i<count;i++)
{
	String day=driver.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]")).get(i).getText();
	if(day.equalsIgnoreCase("23"))
	{
		driver.findElements(By.xpath("//div[@class='dateInnerCell']")).get(i).click();
	}
}
	
				}
}