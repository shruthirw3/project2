package werf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.navigate().to("https://automationstepbystep.com/quiz-time/");
		Thread.sleep(50);
		//close the popup
		/*Alert alert=driver.switchTo().alert();
		alert.dismiss();
		*/
		Actions act=new Actions(driver);
		//click on selenium tab
		WebElement element1=driver.findElement(By.xpath("//li[@id='menu-item-89']/a"));
		act.moveToElement(element1).build().perform();
		//click on selenium introduction
		WebElement element2=driver.findElement(By.xpath("//li[@id='menu-item-151']/a"));
		act.click(element2).build().perform();
		//validate selenium introduction
		String Actelement=driver.findElement(By.xpath("//article/h1")).getText();
		System.out.println(Actelement);
		Assert.assertEquals(Actelement, "Selenium Introduction");
		//go back to previous browser
		driver.navigate().back();
		
		
		
		
	
	}

}
