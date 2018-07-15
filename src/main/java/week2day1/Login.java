package week2day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends Webdriverinit {

	/*public static void main(String[] args) {*/
		// TODO Auto-generated method stub
public static void loggedOn() {

try {
driver.get("http://leaftaps.com/opentaps/control/main");

driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
}
catch (Exception e) {
	// TODO: handle exception
	throw new RuntimeException();
}
finally {
	takeSnap();
}
/*catch (Exception e) {
	// TODO: handle exception
	throw new RuntimeException();
}*/

/*catch (Exception e) {
	System.out.println("exception");
	// TODO: handle exception
}*/
	}
	public static void takeSnap() {
		int i=1;
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

}
