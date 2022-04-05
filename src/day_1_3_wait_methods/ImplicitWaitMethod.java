package day_1_3_wait_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Synchronization is concept where two or more software works parallel if one software or tool work fast and other works slow there will be expection

public class ImplicitWaitMethod {

	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		driver = new ChromeDriver() ;
		
		//Implicit wait will apply for entire webpage or for all webelement
		//Implicit wait default time is 0
		//If element is not founded in within specified time below 30 second it will throw expection
		//Do not use Implicit and explicit together
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='allow']")).click();
		
		
	}

}
