package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverinit {
	static ChromeDriver driver;
	public static void main(String[] args) {
		//for reports
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 Login.loggedOn();
}
}