package day_0_1_simple_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/forgot_password");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaibhavamsatokar@gmail.com") ;
		driver.findElement(By.xpath("//button[@id='form_submit']")).click() ;
        
         
         
         Thread.sleep(4000);
         
         driver.close();
	}

}
 