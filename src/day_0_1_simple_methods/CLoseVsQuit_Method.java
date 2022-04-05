package day_0_1_simple_methods ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





@SuppressWarnings("unused")
public class CLoseVsQuit_Method {

	public static void main(String[] ar) {
	
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", ".//lib//geckodriver.exe");
		
		//this is key word for chromedriver "webdriver.chrome.driver"
		//this is path of chromedriver.exe  ".//lib//chromedriver.exe"
		//This will set up chromedriver.exe it will communicate directly browser
		
		//WebDriver driver=new WebDriver();//this wrong way
		//We cannot create object of interface 
		
		//ChromeDriver driver=new ChromeDriver();
		//ChromeDriver is class 
		//This is correct way of launching chrome browser but not preferred way
		
		
		WebDriver driver=new ChromeDriver();
		
		//WebDriver(parent) is interface driver is reference object or reference variable
		//new is key word which intialize chromeDriver(child) class 
		
		//This is correct way of launching chrome browser and  preffered way 
		 //to achieve runtime polymorphism 
		
		
		//In chromedriver class default constructor will get intialize which find any port which is available on your
		//system to launch chrome browser
		
		
		
		//get(String arg0) is method of webdriver which is defined in implementing class like chromedriver ,firefoxdriver
		//which take argument string (url) of web application
		//get method load a new webpage on current browser window or tab
		
		driver.get("https://www.naukri.com/");
		
		
		//close is method of webdriver which is defined in implementing class like chromedriver ,firefoxdriver
		//which help us close current browser window of the driver instance 
		
		driver.close();
		
		
		//quit is method of webdriver which is defined in implementing class like chromedriver ,firefoxdriver
		//which help us close all  browser window or tab of the driver instance 
		
		driver.quit();
		
		
		
		
		
		
		

	}
	
	

}
