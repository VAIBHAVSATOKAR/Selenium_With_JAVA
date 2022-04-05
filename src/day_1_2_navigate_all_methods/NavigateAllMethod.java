package day_1_2_navigate_all_methods;
/*
 * 
 * 
 * driver.navigate() navigate is method in webdriver which return Navigation interface 
		Navigation interface controls navigation bar in browser
		There 4 methods in Navigation interface 
		1.to(String arg0) it perform like get(String arg0) thats loading new webpage in current browser window but 
		only difference that when we use  to(String arg0) it store history of browsing 
		2.back(); going back to previous history
		3.forward(); going forward to previous history
		4.refresh(); 
 * */

import java.util.List;

import org.openqa.selenium.By;

/*
 * Xpath: is extensible markup language is used for storing and transfering data from client to machine/server
 * xpath: extensible path which helps us to locate and navigate within XML or DOM 
 *Two of xpath 1.Absoulte and 2.Relative 
 * 1.Absoulte xpath start from root node (html) begin with single slash / it not preferred for locating webelement
 * example:/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]
 * 
 * 2.Relative xpath: start from middle of dom begin with double slash // most popular way  for locating webelement
 * Syntax://tagName[@attribute='attribute value']
 * //*[@attribute="attribute value"]
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class NavigateAllMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		Navigation nav=driver.navigate();
		
		
		nav.to("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		
		Thread.sleep(10000);
		
		nav.back();
		
		Thread.sleep(10000);
		
		nav.forward();
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("login1")).sendKeys("Selenium");
		
		Thread.sleep(10000);
		
		nav.refresh();
		
	}

}