package org.ne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amma {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse files\\New1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	}

}
