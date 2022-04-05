package day_1_3_wait_methods;

 import org.openqa.selenium.By;

//Synchronization is concept where two or more software works parallel if one software or tool work fast and other works slow there will be expection

//Explicitwait is wait which is used for certain condition to be trure then it
		// is executed
		// Explicitwait can be chieve in two ways
		// 1.WebDriverWait is class
		// 2.Fluentwait<T>
		// Both performed same action only differennce fluentwait polls dom after
		// interval of time

		 
 import org.openqa.selenium.WebDriver; 
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.ExpectedConditions;
 import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWatiMethod {

	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver",".//lib/chromedriver.exe");
		driver = new ChromeDriver() ;
		
		driver.get("https://www.naukri.com/");
		

		// WebDriverWait is class which parameterized constructor which take two
		// argument one time in long
		// webdriver driver reference
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		By locator = By.xpath("//*[@id='allow']");
		
		Boolean flag = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed() ;
		
		if(flag)
		{
			driver.findElement(locator).click();
		}
		else {
			System.out.println("Webelement not found");
			
			
			
			
		}
				
				
		

	}

}
