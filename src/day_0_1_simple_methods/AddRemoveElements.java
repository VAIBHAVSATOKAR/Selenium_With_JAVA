package day_0_1_simple_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//*[@id='content']/ul/li[2]/a")).click();
		WebElement add = driver.findElement(By.xpath("//*[@id='content']/div/button"));
		add.click();
		add.click();
		WebElement delete = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

		try {
			while(true)
			{
				if(delete.isDisplayed())	
				{
					delete.click();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
