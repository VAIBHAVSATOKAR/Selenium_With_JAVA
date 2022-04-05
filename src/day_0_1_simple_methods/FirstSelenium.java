package day_0_1_simple_methods ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * 
 * public :access modifier which give access to JVM
 * static :keyword which give access to entire class 
 * void : it return nothing
 * main(String[] args):method name which take argument of String of array
 * 
 * 
 * 
 * */



@SuppressWarnings("unused")
public class FirstSelenium {

	public static void main(String[] ar) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", ".//lib//geckodriver.exe");
		
		//this is key word for chromedriver "webdriver.chrome.driver"
		//this is path of chromedriver.exe  ".//lib//chromedriver.exe"
		//This will set up chromedriver.exe it will communicate directly browser
		
		//WebDriver driver=new WebDriver();//this wrong way
		//We cannot create object of interface 
		
		//ChromeDriver driver=new ChromeDriver();
		//ChromeDriver is class 
		//This is correct way of launching chrome browser but not preffered way
		
		
		 driver=new ChromeDriver();
		
		//WebDriver(parent) is interface driver is refrence object or refrence variable
		//new is key word which intialize chromeDriver(child) class 
		
		//This is correct way of launching chrome browser and  preffered way 
		 //to achieve runtime polymorphism 
		
		
		// driver=new FirefoxDriver();
		
			
			//WebDriver(parent) is interface driver is refrence object or refrence variable
			//new is key word which intialize FirefoxDriver(child) class 
			
			//This is correct way of launching firefox browser and  preffered way 
			 //to achieve runtime polymorphism 
		
		
		System.out.println(7);

	}
	
	

}