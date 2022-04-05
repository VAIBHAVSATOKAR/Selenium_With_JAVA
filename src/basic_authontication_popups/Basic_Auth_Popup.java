package basic_authontication_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic_Auth_Popup {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.edge.driver",".//lib//msedgedriver.exe") ;
		WebDriver driver = new EdgeDriver()  ;
		driver.manage().window().maximize();
		
		//String url = "http://the-internet.herokuapp.com/basic_auth" ;
		String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth" ;
		driver.get(url) ;
		
		//http://username:password@test.com
		//username : admin
		//password : admin
		WebDriverWait wait =new  WebDriverWait(driver , 10) ;
		
		By locator = By.tagName("p") ;
		 
		boolean flag = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed() ;
		if(flag)
		{
			System.out.println("Authorised Entry");
		}
		else
		{
			System.out.println("Un-Authorised Entry");
		}
		
		
	}

}
