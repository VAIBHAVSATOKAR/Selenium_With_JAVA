package day_1_0_mouse_events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",".//lib//msedgedriver.exe") ;
		WebDriver driver = new EdgeDriver()  ;
		driver.manage().window().maximize();

		//String url = "http://the-internet.herokuapp.com/basic_auth" ;
		String url = "https://jqueryui.com/resizable/" ;
		driver.get(url) ;
		
		driver.switchTo().frame(0) ;		
		WebElement resizable = driver.findElement(By.xpath("//*[@id='resizable']/div[3]")) ;
        Actions action = new Actions(driver) ;
        action.moveToElement(resizable).
        dragAndDropBy(resizable, 50 ,50).
        build().perform() ;
        
	}

}
