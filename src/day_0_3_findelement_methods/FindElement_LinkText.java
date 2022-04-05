package day_0_3_findelement_methods;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By ;
 

public class FindElement_LinkText {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 String str = driver.getTitle();
		 System.out.println(str);
		 
		 driver.findElement(By.linkText("Create a new account")).click();
	}

}
