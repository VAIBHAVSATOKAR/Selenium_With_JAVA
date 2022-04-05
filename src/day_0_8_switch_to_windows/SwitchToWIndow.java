package day_0_8_switch_to_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWIndow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=iphone+13+");
		String parWinId = driver.getWindowHandle();
		System.out.println(parWinId);
		driver.findElement(By.className("_4rR01T")).click() ;
		
		Set<String> allWId = driver.getWindowHandles();
		
		for(String win:allWId) {
			if(!win.equals(parWinId)) {
			driver.switchTo().window(win);
			}
		}
		
		String productName = driver.findElement(By.className("B_NuCI")).getText() ;
		System.out.println(productName);
		
	}
	
}