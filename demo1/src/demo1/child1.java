package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class child1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
	Thread.sleep(5000);
	
	
		
WebElement gapp= driver.findElement(By.xpath(".//a[@class=\"gb_D gb_xc\" and @title=\"Google apps\"]"));

System.out.println(driver.getTitle());

System.out.println("enter the website");


	gapp.click();
	
	Thread.sleep(5000);
	System.out.println("enter the gapp");
//	List<WebElement> gapp1= driver.findElements(By.xpath("//ul[@jsname=\"k77Iif\" and @class=\"LVal7b u4RcUd\"]/li[@class=\"j1ei8c\"]/a[@class=\"tX9u1b\"]"));

	//WebElement gapp1= driver.findElement(By.xpath(".//li[@class=\"j1ei8c\"]/a[@ class=\"tX9u1b\"  and "]"));
	
	WebElement gapp1= driver.findElement(By.xpath(".//a[@href='https://meet.google.com?hs=197']"));
	Thread.sleep(5000);
gapp1.click();
	
	Thread.sleep(5000);
	}
}
	
	/*	System.out.println("size"+gapp1.size());

	//System.out.println("size"+gapp1.toArray(a)
/*	Thread.sleep(5000);
	for(int i=0;i< gapp1.size();i++)
	{
		WebElement element = gapp1.get(i);
		System.out.println("enter the for loop");
		System.out.println(element.getText());
		String inhtml = element.getAttribute("innerHTML");
		
	System.out.println(inhtml);
	} */
//	System.out.println(driver.getTitle());

//	System.out.println("enter the gapp2");

//	Thread.sleep(5000);
		

		
		
	


