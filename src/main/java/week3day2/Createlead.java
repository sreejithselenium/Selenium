package week3day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createlead extends Webdriverlistener{

	@Test
	public void createlead() {
		
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		//driver.get("http://leaftaps.com/opentaps/");
		
	//	driver1.findElement(By.id("username1")).sendKeys("Demo");
		// maximize browser
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
			
		
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
		source.sendKeys("Krishrish");
		WebElement source1 = driver.findElementById("createLeadForm_firstName");
		source1.sendKeys("Ramkrish");
		WebElement source2 = driver.findElementById("createLeadForm_lastName");
		source2.sendKeys("CT");
		driver.findElementByXPath("(//input[@class='smallSubmit'])").click();
		driver.close();
	}
	
}
