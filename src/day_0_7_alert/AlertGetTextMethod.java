package day_0_7_alert;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver ;
import org.openqa.selenium.By ;
import org.openqa.selenium.Alert ;

public class AlertGetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();

		try {
			
			Alert alert=driver.switchTo().alert();
			
			String actText=alert.getText();
			String expText="I am an alert box!";
			
			if(actText.equals(expText)) {
				System.out.println("Yellow box Testing passed:"+actText);
			}
			else {
				System.out.println("Yellow box Testing failed:"+actText);
			}
			Thread.sleep(5000);
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}