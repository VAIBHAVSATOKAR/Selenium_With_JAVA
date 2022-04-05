package day_1_9_handling_dynamic_content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FloatingMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/floating_menu");
		
		WebElement menucontact = driver.findElement(By.xpath("//*[@id='menu']/ul/li[3]/a")) ;
        menucontact.click() ;
         String vee  = menucontact.getText() ;
         System.out.println(vee);
         
         Thread.sleep(4000);
         
         driver.close();
	}

}
 