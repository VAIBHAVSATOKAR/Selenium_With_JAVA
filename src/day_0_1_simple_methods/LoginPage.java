package day_0_1_simple_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");

		// login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith") ;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!") ;
		driver.findElement(By.xpath("//button[@type='submit']")).click() ;

		Thread.sleep(4000);

		//logout
		driver.findElement(By.xpath("//*[@id='content']/div/a/i")).click()  ;

		//driver.close();
	}

}
