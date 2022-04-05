package day_1_0_mouse_events;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
	
	 public static void main(String[] args) throws InterruptedException {
		 
	      System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get ("http://the-internet.herokuapp.com/context_menu");
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	      // identify element
	      WebElement locator=driver.findElement(By.xpath("//div[@id='hot-spot']"));
	      
	      // Actions class with moveToElement() and contextClick()
	      Actions a = new Actions(driver);
	      a.moveToElement(locator).contextClick().build().perform();
	     
	      
	      Alert at = driver.switchTo().alert() ;
	      at.accept();
	      
	      Thread.sleep(5000);
	      
	      driver.close();
	   }

}
