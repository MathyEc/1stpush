package org.testing;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		LaunchChrome();
		winMax();
		loadUrl("https://www.facebook.com");
		WebElement user = driver.findElement(By.id("email"));
		fill(user, "Mathy");
		dclick(user);
		//rclick(user);
		//Thread.sleep(3000);
		cpy();
		//closechrome();
		 
	} 

}
  