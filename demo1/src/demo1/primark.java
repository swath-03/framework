package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptException;


public class primark {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
				 
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.primark.com/en");
				
				
			Thread.sleep(5000);
			
			
				
		WebElement book = driver.findElement(By.linkText("KIDS"));
		
		System.out.println(driver.getTitle());
		
		System.out.println("enter the website");
		
		Thread.sleep(5000);
			book.click();
			
			WebElement girls = driver.findElement(By.linkText("Girls"));
			 girls.click();
            
				Thread.sleep(2000);

			 WebElement gshose = driver.findElement(By.linkText("Girls Shoes"));
			 gshose.click();
			
				Thread.sleep(5000);

			 WebElement trainer = driver.findElement(By.linkText("Younger Girl Navy Sparkle Trainers"));
			 trainer.click();

				Thread.sleep(5000);

				 WebElement store = driver.findElement(By.linkText("FIND YOUR NEAREST STORE"));
				 store.click();

				 WebElement locat = driver.findElement(By.xpath(".//input[@id=\"q\" and @class=\"search-input Locator-input js-locator-input\"]"));
				 locat.sendKeys("SL63AP");
                
				 Thread.sleep(5000);

				 WebElement srch = driver.findElement(By.xpath(".//button[@class=\"search-button Locator-button\"]"));
				 locat.submit();

				 Thread.sleep(5000);

				 WebElement storeloc = driver.findElement(By.linkText("Primark Bracknell"));
				 storeloc.click();

				 WebElement direc = driver.findElement(By.partialLinkText("GET DIRECTIONS"));
				 direc.click();

	}
}
	
