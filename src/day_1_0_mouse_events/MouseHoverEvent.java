package day_1_0_mouse_events;


import org.openqa.selenium.By;

/*
 * To control complex user gexture in selenium api there is class called as Actions which 
 * control mouse and keyboard api
 * 
 * The user-facing API for emulating complex user gestures. Use this class rather than using the Keyboard or 
 * Mouse directly.
Implements the builder pattern: Builds a CompositeAction containing all actions specified by the method calls.

Call perform() at the end of the method chain to actually perform the actions.
 * 
 * 
 *  
 *  Actions is class which has parameterized constructor which take argument of Webdriver reference driver 
 * */




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEvent {

	
	
	
	public static void main(String[] ar) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.americangolf.co.uk/");
		
		WebElement target=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[5]/a"));
		
		
		
		Actions act=new Actions(driver);
		//moveToElement(webelement) perform mouse hover event on webelement
		act.moveToElement(target).perform();
		
		Thread.sleep(5000);
		WebElement putter=driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span"));
		
		//click(webelement) perform mouse click  event on  webelement
		act.click(putter).perform();
		
		
		
		

	}
	
	

}

