package day_0_2_webpage_methods;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_PageSource {

	public static void main(String[] args) throws InterruptedException, IOException {
		   WebDriver driver;
		   System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		   driver = new ChromeDriver();
		   
		   
		   driver.get("https://twitter.com/?lang=en-in");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   
		   
		   String source = driver.getPageSource();
		   
		   @SuppressWarnings("resource")
		   
		   FileWriter writer = new FileWriter(".//lib//twitter_src.txt");
		   writer.write(source);
		   
		   driver.close();
		   
		   
  }

}
