package day_1_6_upload_and_download_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//*[@id='content']/div/a[16]")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		 
		 

	}

}
