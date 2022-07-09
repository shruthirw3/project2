package werf;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic3table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String dateTime ="12/07/2022 2:00 PM";
		driver.navigate().to("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		Thread.sleep(1000);
		//click on date
		WebElement SelectDate=driver.findElement(By.cssSelector(".k-icon k-i-calendar k-button-icon"));
		SelectDate.click();
		
		
		//left and right arrows
		 WebElement previousyear=driver.findElement(By.xpath("//div[@class='k-header k-hstack']/a[contains(@class,'button-flat-base k-icon-button')]"));
		 WebElement nextyear=driver.findElement(By. xpath("//div[@class='k-header k-hstack']/a[contains(@class,'k-nav-next k-button ')]"));
		
		WebElement centreclick=driver.findElement(By.id("nav-up"));
		
		//split only date part
		String date[]=(dateTime.split(" ")[0]).split("/");
		
		//get the year difference between current year and year to set in calander

        int yearDiff = Integer.parseInt(date[2])- Calendar.getInstance().get(Calendar.YEAR);
        centreclick.click();
        if(yearDiff!=0){

            //if you have to move next year

            if(yearDiff>0){

                for(int i=0;i< yearDiff;i++){

                    System.out.println("Year Diff->"+i);

                    nextyear.click();

                }

            }

            //if you have to move previous year

            else if(yearDiff<0){

                for(int i=0;i< (yearDiff*(-1));i++){

                    System.out.println("Year Diff->"+i);

                    previousyear.click();

                }

            }

        }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 * driver.findElement(By.
		 * xpath("//button[contains(@class,'k-input-button k-button')][2]")).click();
		 * driver.findElement(By.xpath("//a[@id='nav-up']")).click(); WebElement
		 * rightyeararrow=driver.findElement(By.
		 * xpath("//span[contains(@class,'k-button-icon k-icon')]"));
		 * 
		 * WebElement leftyeararrow=driver.findElement(By.
		 * xpath("//span[@class='k-icon k-i-arrow-60-right']"));
		 * 
		 * 
		 * //seleect month List<WebElement> allmonths=driver.findElements(By.xpath(
		 * "//tbody[@class='k-calendar-tbody']/tr/td"));
		 * 
		 * for(WebElement element:allmonths) { String month=element.getText();
		 * System.out.println(month);
		 * 
		 * if(month.equals("June")) { element.click(); break; } } List<WebElement>
		 * date2row=driver.findElements(By.xpath(
		 * "//tbody[@class='k-calendar-tbody']/tr[2]/td")); for(WebElement
		 * date:date2row) { String actualdate=date.getText(); if(actualdate.equals("8"))
		 * { date.click();
		 * 
		 * } }
		 */
		
	}

	
}
