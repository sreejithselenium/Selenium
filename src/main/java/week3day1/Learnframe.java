package week3day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id=\"main\"]/div[9]/a").click();
		driver.getCurrentUrl();*/
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.findElementByXPath("/html/body/button").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert alert= driver.switchTo().alert();
		String text=alert.getText();
		alert.sendKeys("TestLeaf");
		alert.accept();
		
	}

}
