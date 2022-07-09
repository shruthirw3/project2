package werf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewGuruProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("UserId");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
	}

}
