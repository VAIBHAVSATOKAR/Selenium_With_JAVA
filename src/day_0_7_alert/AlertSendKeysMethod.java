package day_0_7_alert;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver ;
import org.openqa.selenium.By ;
import org.openqa.selenium.Alert ;

public class AlertSendKeysMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		
		driver.findElement(By.xpath("//Button[@onclick='promptbox()']")).click();
		
		try {
		
			Alert alert=driver.switchTo().alert();
			alert.sendKeys("Vaibhav Satokar");
			Thread.sleep(5000) ;
			alert.accept();
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}