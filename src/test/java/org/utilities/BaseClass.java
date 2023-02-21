 package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	public static WebDriver driver;
    public static Actions a;
    public static Robot r;
	 
	//1
	public static void LaunchChrome() {
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	}
	//2
	public static void winMax() {
		driver.manage().window().maximize();
	}
	//3
	public static void loadUrl(String url) {
	 driver.get(url);
}
    //4
	public static void printTitle() {
	System.out.println(driver.getTitle());
}
    //5
	public static void fill(WebElement e,String value) {
	e.sendKeys(value);
	
}   //6
	public static void closechrome() {
	driver.quit();
}//7
	public static void dclick(WebElement e) {
		a=new Actions(driver);
	a.doubleClick(e).perform();
   //8
	}
	public static void rclick(WebElement e) {
		a=new Actions(driver);
		a.contextClick(e).perform();

	}
	//9
public static void cpy() throws AWTException {
	r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
}
//10
public static void btnclick(WebElement e) {
	e.click();
}
}
