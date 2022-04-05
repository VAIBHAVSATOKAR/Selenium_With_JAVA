package day_1_3_wait_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Load_Time {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe") ;		 
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver() ;
		// Maximizes Window
		driver.manage().window().maximize();

		long start = System.currentTimeMillis();
		String url = "http://www.snapdeal.com" ;
		// Navigate to url
		Navigation nav = driver.navigate() ;
		nav.to(url) ; 

		@SuppressWarnings("unused")
		WebElement signInMenu = driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div"));
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for page load - "+totalTime); 

	}
}
