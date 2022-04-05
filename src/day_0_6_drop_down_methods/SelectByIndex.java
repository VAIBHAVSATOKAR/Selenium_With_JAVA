package day_0_6_drop_down_methods;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver ; 
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By ;
import org.openqa.selenium.WebElement; ;


public class SelectByIndex {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
  
		 WebElement country = driver.findElement(By.xpath("//select[@id='country']")); 
		 
		 Select select = new Select(country) ;
		 
		 Boolean flag = select.isMultiple() ;
		 System.out.println("Can we select  multiple :"+flag);
		 
		 select.selectByIndex(96);
		 
	}

}
