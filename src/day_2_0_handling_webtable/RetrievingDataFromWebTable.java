package day_2_0_handling_webtable;

/*
 *consider a webtable of 4 rows and 3 columns
 *xPath to get all rows of a webtable -
    "//table[@class='dataTable']/tbody/tr"

 *xPath to get 1st row of a webtable - 
    "//table[@class='dataTable']/tbody/tr[1]"

 *xPath to get all columns of a webtable - 
    "//table[@class='dataTable']/tbody/tr[4]/td"

 *xPath to get 2nd column of a webtable -
    "//table[@class='dataTable']/tbody/tr/td[2]"
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingDataFromWebTable {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html") ;
		
		//code to print 1st row
		List <WebElement> rows=driver.findElements(By.xpath("/html/body/center/table/tbody/tr[1]"));
		//print row size
		System.out.println("Rows Size "+rows.size());

		//for loop to get the content of the row
		for(int i=0; i < rows.size(); i++){
			System.out.println(rows.get(i).getText());
		}
	}
}

