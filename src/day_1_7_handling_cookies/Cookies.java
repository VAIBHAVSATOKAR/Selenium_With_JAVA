package day_1_7_handling_cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe") ;		 
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        
        String url = "http://www.facebook.com/login" ;
        driver.get(url) ;
        
        Cookie ck = new Cookie("foo" ,"bar");
        
        driver.manage().addCookie(ck) ;
        Set <Cookie> coo  = driver.manage().getCookies() ;
        for(Cookie c : coo)
        {
        	System.out.println(c);
        }
        
        driver.manage().deleteAllCookies() ;

	}

}
