package day_0_2_webpage_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getPageSource {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver ;
		 System.setProperty("webdriver.edge.driver",".//lib//msedgedriver.exe");
         driver = new EdgeDriver();
         
         //Open Twitter login page
         driver.get("https://twitter.com/?lang=en-in");
         driver.manage().window().maximize();
         
         //getPageSource() method returns Source of the page
         String str = driver.getPageSource();
         Thread.sleep(5000);
         System.out.println(str);
         
         
         driver.close();
         
         
         
	}

}
