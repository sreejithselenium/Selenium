package week3day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwinhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
System.out.println("************");
	driver.findElementByLinkText("Contact Us").click();
	
	
	
	}

}
