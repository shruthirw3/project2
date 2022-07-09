package werf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicMake {

	// TODO Auto-generated method stub
	public static  void main(String[] args) {
	String[] a= {"2022","June","22"};
	String year1=a[0];
	String month1=a[1];
	String date1=a[2];
	
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[contains(@class,'appendBottom10')][text()='RETURN']")).click();
		WebElement year=driver.findElement(By.xpath("//span[text()='2022']"));
		if(!year.equals(year1)) {
			do {
				driver.findElement(By.xpath("//span[contains(@class,'NavButton--next')]")).click();
			}while(!driver.findElement(By.xpath("//span[text()='2022']")).getText().equals(year1));
			
		}
		WebElement month=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
		if(!month.equals(month1)) {
			do {
				driver.findElement(By.xpath("//span[contains(@class,'NavButton--next')]")).click();
			}while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().equalsIgnoreCase(month1));
			
		}
WebElement date=driver.findElement(By.xpath("//div[@class='dateInnerCell']"));
WebElement price=driver.findElement(By.xpath("//div[@class='dateInnerCell']/p[2]"));
int q=18044;
if(!date.equals(date1)) {
if(!price.equals(q)) {
	do {
driver.findElement(By.xpath("//span[contains(@class,'NavButton--next')]")).click();	
	}while(!driver.findElement(By.xpath("//div[@class='dateInnerCell']")).getText().equals(date1));
	
}
}
}


}