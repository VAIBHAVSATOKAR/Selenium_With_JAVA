package day_1_9_handling_dynamic_content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControls {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe") ;
			WebDriver driver = new ChromeDriver();

			driver.get("http://the-internet.herokuapp.com/dynamic_controls");
			
			// Remove/Add
			
			//Selects checkbox
			WebElement chkbox = driver.findElement(By.xpath("//*[@id='checkbox']/input"));		
			chkbox.click();
			
			// Removes ChkBox
			WebElement remove = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));		
			remove.click();
			
			Thread.sleep(5000);
			
			// Add chkbox
			WebElement add = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));		
			add.click();
			
			Thread.sleep(5000);
			
			// Eneble/Disable
			
			// Enebling input
			WebElement enable = driver.findElement(By.xpath("//*[@id='input-example']/button"));		
			enable.click();
			
			Thread.sleep(5000);
			
			// SendKeys to input
			WebElement send = driver.findElement(By.xpath("//*[@id='input-example']/input"));		
			send.click();
			
			Thread.sleep(2000);
			
			// Disabling input
			WebElement disable = driver.findElement(By.xpath("//*[@id='input-example']/button"));		
			disable.click();
			
			Thread.sleep(5000);
			
			driver.close();
			
			
			
			
			
			
		
	}
}