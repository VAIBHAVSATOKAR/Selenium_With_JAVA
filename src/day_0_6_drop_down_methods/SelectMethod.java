package day_0_6_drop_down_methods;

/* Select is class in selenium support ui package help to perform event  on dropdown 
 * Select class has paramertized constructor which take argument of webelement reference 
 *Select class has three methods
 *1. selectByIndex() : select WebElement by using index
 *2. selectByVisibleText() : select WebElement by using Text visible to user
 *3. selectByValue() : select WebElement by using Value
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver ;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By ;
import org.openqa.selenium.WebElement ;


public class SelectMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();

		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

		WebElement  country = driver.findElement(By.xpath("//select[@id='country']"));

		Select s = new Select(country);
		
		// Logic for finding weather we can select multiple WebElement or not
		Boolean flag = s.isMultiple() ;
		System.out.println("Can we select multiple countries :"+flag);
	}

}
