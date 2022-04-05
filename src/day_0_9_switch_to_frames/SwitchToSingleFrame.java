package day_0_9_switch_to_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSingleFrame {
 
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.findElements(By.tagName("iframe"));
		
		//it will switch to first frame which is avialiable
		driver.switchTo().frame(0);
				
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium Tester");


		
	}
	
}
