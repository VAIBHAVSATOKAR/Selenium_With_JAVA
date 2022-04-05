package day_0_8_switch_to_windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_Handles{

	public static void main(String[] args){
		
		System.setProperty("webdriver.edge.driver", ".//lib//msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.rediff.com");

		Set<String> set=driver.getWindowHandles();

		Iterator<String> it=set.iterator();
		String mainWindow=it.next();
		String popUp=it.next();

		//close the pop-up
		driver.switchTo().window(popUp).close();
		//move control back to main window
		driver.switchTo().window(mainWindow);
	}
}