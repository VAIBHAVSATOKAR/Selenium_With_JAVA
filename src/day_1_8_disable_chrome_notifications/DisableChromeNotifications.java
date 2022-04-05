package day_1_8_disable_chrome_notifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableChromeNotifications {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		 WebDriver driver ;
		 System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		 driver = new ChromeDriver(options);
		 
		 driver.get("http://www.facebook.com/login/");
		 driver.manage().window().fullscreen();
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8766739475"); 
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("a@@VRS8669356584"); 
		 driver.findElement(By.xpath("//button[@name='login']")).submit();
		 
		 Thread.sleep(10000);
		 driver.close();		 

	}

}
