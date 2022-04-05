package day_0_7_alert;

/*
 * Alert or javascript or window alert is information display or some warning are 
 * display to end user which as guidance in application 
 * Three types of alert
 * 1.Simple Alert:-We can accept(ok) the information 
 * 2.Confirm Alert:-We can either accept(ok) or dissmiss() information displayed
 * 3.prompt Alert:-We can provide input in form text and We can either accept(ok) or dissmiss() information displayed
 * 
 * 
 * To handle this type of alert or window alert in selenium there is interface called Alert interface 
 * in Alert there are are four methods
 * 1.accept()-click ok
 * 2.dissmiss()-click cancel
 * 3.getText()-extract information and return in String
 * 4.SendKeys(Sting arg0):-Send text in alert text box 
 * 
 * */

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver ;
import org.openqa.selenium.By ;
import org.openqa.selenium.Alert ;



public class AlertAcceptMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//Button[@onclick='alertbox()']")).click();
        
		
		try
		{
		 Thread.sleep(4000);
		 Alert alert = driver.switchTo().alert() ;
		 alert.accept();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		
		 
	}

}
