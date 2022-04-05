package day_0_5_handling_chkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement ;

import java.util.List ;



public class CheckboxXpath {

	 
   public static void main(String[] args) throws InterruptedException {
		 
	   System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	   WebDriver driver = new ChromeDriver() ;
	   driver.manage().window().maximize();
	   
	   driver.get("https://echoecho.com/htmlforms09.htm");
	   
	   List <WebElement> chkbox = driver.findElements(By.xpath("//input[@name='Checkbox']"));
	   
	   
	   for(WebElement c:chkbox)                  //this logic allows to select only
		                                         // de-selected chkboxes
	   {
		   if(!c.isSelected())
		   {
			c.click();   
		   }
	   }
	   
	   
	   Thread.sleep(4000);
	   
	   
	   driver.close();
	   
	   

	}

}
