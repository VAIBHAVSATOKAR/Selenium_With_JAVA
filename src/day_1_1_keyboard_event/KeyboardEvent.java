package day_1_1_keyboard_event;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

	public static void main(String[] ar) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement target = driver.findElement(By.xpath("//input[@name='q']"));

		Actions act = new Actions(driver);

		act.sendKeys(target, "New year greetings 2022").perform();
		Thread.sleep(5000);

		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		
		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000);
			act.sendKeys(Keys.ARROW_UP).perform();
			
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		//copy text of textbox or text area 
		//act.sendKeys(target, Keys.CONTROL+"c" );
		
		//paste text in textbox or text area 
		//act.sendKeys(target, Keys.CONTROL+"v" );

	}

}