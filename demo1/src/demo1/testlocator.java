package demo1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\Testing\\geckodriver.exe");
		
	//	dis = new DesiredCapabilities();
	//	dis.setCapability("marionette", false);  // to disable marionette, by default true
	
	//	FirefoxProfile profile = new FirefoxProfile(new File());
		FirefoxOptions options = new FirefoxOptions();
	//	options.setProfile(profile);
	//	FirefoxOptions capabilities = null;
	//	capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
//	@SuppressWarnings("deprecation")
	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.udemy.com/");
		
	Thread.sleep(2000);
		
	//WebElement c2021 = driver1.findElement(By.xpath(".//li[@class=\"__rc-years\" and @data-year=\"2021\"]"));

WebElement book = driver.findElement(By.xpath(".//input[@data-purpose=\"search-input\" and @placeholder=\"Search for anything\"]"));

book.sendKeys("Selenium");
		
		Thread.sleep(5000);
		WebElement sub = driver.findElement(By.xpath(".//span[@class=\"input-group-btn\"]"));
//		
		sub.submit();
		
		Thread.sleep(5000);
		WebElement cor = driver.findElement(By.name("Selenium WebDriver with Java -Basics to Advanced+Frameworks"));
		
		cor.submit();
		
	}

}
