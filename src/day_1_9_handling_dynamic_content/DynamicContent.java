package day_1_9_handling_dynamic_content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_content?with_content=static ");
		
		// TO MAKE DYNAMIC CONTENT STATIC APPEND "?with_content=static"  WITH URL
		
		Thread.sleep(5000);
		
		Navigation nav = driver.navigate() ;
		nav.refresh();

	}

}
