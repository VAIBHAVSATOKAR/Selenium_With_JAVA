package day_1_0_mouse_events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HorizontalSlider {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",".//lib//msedgedriver.exe") ;
		WebDriver driver = new EdgeDriver()  ;
		driver.manage().window().maximize();

		//String url = "http://the-internet.herokuapp.com/basic_auth" ;
		String url = "https://jqueryui.com/slider/" ;
		driver.get(url) ;
		
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe) ;

		Actions act = new Actions(driver) ;
		WebDriverWait wait = new WebDriverWait(driver , 30) ;
		By locator = By.xpath("//*[@id='slider']/span") ;

		boolean flag = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed() ;

		if(flag)
		{
			WebElement slider = driver.findElement(locator);
			act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform() ;  
		}
		else {
			System.out.println("WEBELEMENT NOT FOUND");
		}
	}

}
