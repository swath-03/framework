package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.uk/");
		
		System.out.println(driver.getTitle());
        Thread.sleep(2000);
		
	     WebElement srch = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        
	     srch.sendKeys("lego technics");
	 
	  WebElement click1 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));    	
	  
	  click1.submit();
	
	  WebElement selt = driver.findElement(By.linkText("Haunen Mc-P1 Race Car Advanced Building Set, 1363Pcs 1:12 2.4G RC Super Sports Car Model Compatible with LEGO Technic"));
	  
	  selt.click();
	  
	  Thread.sleep(2000);
	  
	  
	  WebElement cart = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"  and  @name=\"submit.add-to-cart\"]"));
	  
	  cart.click();
	  
	  //WebElement prod = driver.findElement(By.xpath("//a[@id=\"hlb-ptc-btn-native\" and @class=\"a-button-text a-text-center\"]"));
	  
	  WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.amazon.co.uk/");
		
	  WebElement srch1 = driver1.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
      
	     srch1.sendKeys("Toys");
	 
	  
	 // WebElement prod = driver.findElement(By.name("Basket"));
	 // prod.submit();
	}

}
