package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.jiosaavn.com/");
		
		driver.get("https://www.facebook.com/");
		
		//WebElement login = driver.findElement(By.id("login-btn"));
		
		WebElement login = driver.findElement(By.xpath("//input[@type=\"email\" and @name=\"email\"]"));
		
	    Thread.sleep(2000);
		
	    login.sendKeys("swathi_03@yahoo.com");

	    Thread.sleep(2000);

	    //	WebElement srch = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
	    WebElement pass1 = driver.findElement(By.xpath("//input[@type=\"password\" and @name=\"pass\"]"));
	    //WebElement user1 = driver.findElement(By.xpath("//button[@class=\"btn phone_num large login-phone\" and @id=\"static-phone-login-btn\"]"));
		Thread.sleep(2000);
		
		pass1.sendKeys("Ishaan06");

		System.out.println(driver.getTitle());

	    WebElement sub1 = driver.findElement(By.xpath("//input[@value=\"Log In\" and @aria-label=\"Log In\"]"));

	    sub1.submit();
	//	Thread.sleep(5000);
		//WebElement mob = driver.findElement(By.id("Phone number"));
	//	WebElement mob = driver.findElement(By.xpath("//input[@class=\"mdl-textfield__input firebaseui-input firebaseui-id-phone-number\"]"));
		 
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
//		mob.sendKeys("07377143293");
	}

}
