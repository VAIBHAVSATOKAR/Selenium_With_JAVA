package day_0_8_switch_to_windows;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNaukaryWindows_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		//Store parent or main session id of this driver instance in string
		String parentWinId=driver.getWindowHandle();
		
		System.out.println("Parent ID:"+parentWinId);
		
		
		//Store all session id of this driver instance in Set<String>
		Set<String> allWinId=driver.getWindowHandles();
	
		
		//switch to all window and if title if that page is "Tech Mahindra" maximize and browser 
		for(String win:allWinId) {
				driver.switchTo().window(win);
				if(driver.getTitle().equals("Tech Mahindra")) {
					driver.manage().window().maximize();
				}
		}
	
	}
	
}