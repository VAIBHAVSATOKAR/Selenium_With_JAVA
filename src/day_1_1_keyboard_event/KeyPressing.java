package day_1_1_keyboard_event;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get ("http://the-internet.herokuapp.com/key_presses");
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	     WebElement ip = driver.findElement(By.xpath("//input[@id='target']")) ;
	     ip.sendKeys("Vaibhav Satokar", Keys.SPACE) ;
	     
	     //ip.sendKeys(Keys.chord(Keys.CONTROL, "a")) ;
	     
	     driver.close();
	     
	     
	}

}
