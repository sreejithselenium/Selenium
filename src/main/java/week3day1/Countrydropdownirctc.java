package week3day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test

public class Countrydropdownirctc {

	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("userRegistrationForm:nationalityId")).click();
		WebElement element=driver.findElementById("userRegistrationForm:nationalityId");
		Select country=new Select(element);
		List<WebElement> options=country.getOptions();
		for(WebElement eachoption:options) 
		{
			if(eachoption.getText().startsWith("E")) 
			{	i++;
			if(i==2) {
				System.out.println(eachoption.getText());
				eachoption.click();
				break;
			}
			}

		}
		driver.close();
	}

}
