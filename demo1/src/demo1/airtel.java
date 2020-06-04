package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class airtel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
 // 	WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.edureka.co/");
		
	//	Thread.sleep(5000);
	//	WebElement pre1 = driver.findElement(By.linkText("DevOps"));
		
	//	pre1.click();
		
     WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://in.bookmyshow.com/hyderabad/movies");
		
		Thread.sleep(9000);
		WebElement book = driver1.findElement(By.linkText("Buzz"));
		
		book.click();
		
		Thread.sleep(9000);
		WebElement movie = driver1.findElement(By.linkText("Movies"));
		
		movie.click();
		
		Thread.sleep(9000);
		WebElement coming = driver1.findElement(By.linkText("Coming Soon"));
		
		coming.click();
		
		Thread.sleep(9000);
		WebElement c2021 = driver1.findElement(By.xpath(".//li[@class=\"__rc-years\" and @data-year=\"2021\"]"));
		
	//	Thread.sleep(1000);
		c2021.click();
		
//WebElement cmar = driver1.findElement(By.xpath(".//li[@class=\"__rc-week\" and @data-month=\"3\"]"));
	
		WebElement cmar = driver1.findElement(By.linkText("MAR"));
	//	Thread.sleep(1000);
		cmar.submit();
		
		
	}

}
