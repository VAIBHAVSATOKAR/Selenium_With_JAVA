 package day_0_4_css_selector_methods;


/*
 *CssSelector is mechanism to locate webelement using cssproperty
 *CssSelector is two type 1.Absolute css and 2.Relative
 
 //Absolute cssSelector type
 *1.Absoulte css start from root node ie html and relative start from middle of dom
 *2.html>body>center>form>div>table>tbody>tr

 *Relative cssSelector type
 *1.single attribute:tagName[attribute='attribute value']
 *2.start-with:tagName[attribute^='starting attribute value']
 *3.end-with:tagName[attribute$='ending attribute value']
 *4.all/any:tagName[attribute*='any or all attribute value']
 *5.multiple attribute:tagName[attribute='attribute value'][attribute='attribute value'][attribute='attribute value']...
*/

 import org.openqa.selenium.WebDriver ;
 import org.openqa.selenium.edge.EdgeDriver ;
 import org.openqa.selenium.By ;

public class CSS_Selector_SingleAttribute {

	public static void main(String[] args) throws InterruptedException {
		 
           WebDriver driver ;
           System.setProperty("webdriver.edge.driver", ".//lib//msedgedriver.exe");
           driver = new EdgeDriver();	
           
           driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
           
           driver.manage().window().maximize();
           
           Thread.sleep(4000);
           
           //end-with:tagName[attribute$='ending attribute value']  
           driver.findElement(By.cssSelector("input[aria-label='Username']")).sendKeys("veersatokar");
           
           Thread.sleep(4000);
           
           driver.close();
           
	}

}
