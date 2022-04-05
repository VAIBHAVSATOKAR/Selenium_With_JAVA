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

public class DragAndDrop {

	
	
	
	public static void main(String[] ar) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source5000=driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement targetDebitAmt=driver.findElement(By.xpath("//*[@id='amt7']"));
		
		WebElement targetCreditAmt=driver.findElement(By.xpath("//*[@id='amt8']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source5000, targetDebitAmt).perform();
		
		act.dragAndDrop(source5000, targetCreditAmt).perform();
		
		
		// Drag And Dro[ using  clickAndHole() and release()
		/*
		 * act.clickAndHold(source5000).build().perform();
		 * act.moveToElement(targetDebitAmt).build().perform();
		 * act.release(targetDebitAmt).build().perform();
		 */
		

	}
	
	

}