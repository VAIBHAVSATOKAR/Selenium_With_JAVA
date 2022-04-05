package day_1_5_takes_screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotMethod {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//TakesScreenshot is interface implementating in chromdriver,firefoxdriver class 
		//((TakesScreenshot)driver) typecasting webdriver driver reference
		//getScreenshotAs(OutputType.FILE) is method of TakesScreenshot
		
		 
		File from=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File to=new File(".//Files//rediff.png");
		
		FileHandler.copy(from, to);
		 
	}

}
