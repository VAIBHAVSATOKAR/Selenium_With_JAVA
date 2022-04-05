package day_0_3_findelement_methods;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsTagNameButton {

	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        List<WebElement> inputbox =driver.findElements(By.tagName("input"));
		
		
		inputbox.get(2).sendKeys("MarkZuckerBerg@facebook.com");
		inputbox.get(3).sendKeys("MarkZuckerBerg@facebook.com");
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		

	}
	
	

}