package day_0_3_findelement_methods;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class FindElements_HyperLink {


	public static void main(String[] args) throws InterruptedException {
		 
          System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
          
          WebDriver driver = new ChromeDriver() ;
          Thread.sleep(8000);
          
          driver.get("https://www.rediff.com/");
          
          
          List <WebElement> allLinks = driver.findElements(By.tagName("a"));
          System.out.println(allLinks.size());
          
        
          
          int count = 1 ;
          for(WebElement link:allLinks)
          {
        	  System.out.println(count+"."+link.getText());
        	  count++;
          }
          
          
          driver.close();
          
          
	}

}
