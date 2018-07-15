package week3day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Login extends Webdriverlistener{

	
	//@Test
	public void main() throws InterruptedException {
		// Launch Chrome
		System.setProperty("webdriver1.chrome.driver", 
				"./drivers/chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("http://leaftaps.com/opentaps/");
		
	//	driver1.findElement(By.id("username1")).sendKeys("Demo");
		// maximize browser
		driver.manage().window().maximize();
		
		
		//Enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click Crmsfa link
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		// dropdown
		WebElement source = driver.findElementById("createLeadForm_companyName");
		source.sendKeys("NewCompany");
		WebElement source1 = driver.findElementById("createLeadForm_firstName");
		source1.sendKeys("Newname");
		WebElement source2 = driver.findElementById("createLeadForm_lastName");
		source2.sendKeys("Lastname");
		
	
	}
}
