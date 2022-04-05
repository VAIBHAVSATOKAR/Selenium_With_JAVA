package day_1_9_handling_dynamic_content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryUIMenu {
	
	public static void main(String [] args) 
	{
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get ("http://the-internet.herokuapp.com/jqueryui/menu");
	      driver.manage().window().maximize();
	      
	      WebElement Enabled =driver.findElement(By.xpath("//*[@id='ui-id-2']"));
	      WebElement back =driver.findElement(By.xpath("//*[@id='ui-id-5']"));
	     
	      
	      
	      Actions act=new Actions(driver);
			//moveToElement(webelement) perform mouse hover event on webelement
			act.moveToElement(Enabled).click().build().perform();
			
			act.moveToElement(back).click().build().perform();
			
	      
	      
	      
	       
	}

}
