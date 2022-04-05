package day_2_1_page_loading_strategy;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Normal_Page_Loading {

	public static void main(String[] args) {
		
		// By Default , when Selenium Webdriver loads a page
		//it follows Normal Page Strategy
		
		ChromeOptions opt = new ChromeOptions() ;
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL) ;
		
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe") ;		 
        WebDriver driver = new ChromeDriver(opt) ;
        driver.manage().window().maximize();
        
        String url = "http://www.facebook.com/login" ;
        driver.get(url) ;

	}

}
