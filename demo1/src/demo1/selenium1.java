package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		System.out.println(driver.getTitle());
        Thread.sleep(2000);
		WebElement srch = driver.findElement(By.xpath("//input [@id=\"search\"]"));
		srch.sendKeys("peppa pig");
       
		System.out.println("enter the youtube program step1");
       
		WebElement click1 = driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]"));
		click1.click();
		
		System.out.println("enter the youtube program step2");
		Thread.sleep(2000);
		
		//WebElement video = driver.findElement(By.xpath("//a[(@id=\"video-title\" && @title=\"Peppa Pig Plays Minecraft Again\"]"));
	    WebElement video = driver.findElement(By.linkText("Peppa Pig Plays Minecraft Again"	));	
		video.click();
	}

}
