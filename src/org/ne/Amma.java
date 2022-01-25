package org.ne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amma {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse files\\New1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=google&rlz=1C1GCEO_enIN988IN988&oq=google&aqs=chrome..69i57j0i271l3j69i65l2j69i60l2.1187j0j7&sourceid=chrome&ie=UTF-8");
		
		
	}

}
