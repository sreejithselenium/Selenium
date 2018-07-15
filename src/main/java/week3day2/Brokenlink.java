package week3day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.util.concurrent.ServiceManager.Listener;

public class Brokenlink {

	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("Total links are "+links.size());
	
	
	}
	}
