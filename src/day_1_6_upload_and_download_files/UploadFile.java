package day_1_6_upload_and_download_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='file-upload']"));

		upload_file.sendKeys("C:\\Users\\vaibh\\OneDrive\\Desktop\\Password.txt");
		
		driver.findElement(By.xpath("//*[@id='file-submit']")).click();
		driver.close();
		
	
		
		
	}

}
