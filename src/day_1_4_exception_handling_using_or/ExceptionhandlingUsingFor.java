package day_1_4_exception_handling_using_or;

/*
 * //Synchronization is concept where two or more software works parallel if one software or tool work fast and other works slow there will be expection
		//Unconditional and conditional synchronization
		//Unconditional synchronization example Thread.sleep(long mills) stop jvm certain amount ,disadvantage uncessary waiting
		//Conditional synchronization can be achieved in two way implicit and explicit 
		
		//Implicit wait will apply for entire webpage or for all webelement
		//Implicit wait default time is 0
		//If element is not founded in within specified time below 30 second it will throw expection
		//Donot use Implicit and explicit together */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionhandlingUsingFor {

	public static void main(String[] ar) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+13+");
		//To handle any selenium expection like NoSuchElement,StaleElement,not clickable,....Can be handled using for loop 
		while (true) {
			try {

				for (int i = 0; i < 10; i++) {

					if (driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed()) {
						driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
						break;
					}
					else {
						continue;
					}  
				}

			} catch (Exception e) {
				break;

			}

		}

	}

}