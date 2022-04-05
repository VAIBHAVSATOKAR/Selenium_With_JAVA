package day_0_2_webpage_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws Exception {
		 WebDriver driver ;
		 System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://www.facebook.com/login");
		 driver.manage().window().maximize();
		 
		 //getTitle() method returns the Title of the WebPage
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		 
		 //Title = "Log in to Facebook"
		 
		 
		 
		 

	}

}
