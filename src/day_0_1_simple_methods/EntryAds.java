package day_0_1_simple_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntryAds {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/entry_ad");
		
		Thread.sleep(5000);
		
		WebElement cancel = driver.findElement(By.xpath("//*[@id='modal']/div[2]/div[3]/p"));
        cancel.click();
        
        driver.close();
	}

}
