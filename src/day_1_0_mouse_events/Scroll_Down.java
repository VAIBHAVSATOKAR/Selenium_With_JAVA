package day_1_0_mouse_events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;


public class Scroll_Down{

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		//Method 1 - Using JavaScript to scroll down
		//Scroll Down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)", "");

		//Scroll Up
		js.executeScript("window.scrollBy(2000,0)", "");

		//Method 2 - Using sendKeys
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.PAGE_DOWN);

		//Method 3 - Scroll to specific element
		WebElement element=driver.findElement(By.xpath("xpath"));
		Coordinates co=((Locatable)element).getCoordinates();
		co.inViewPort();

	}
}