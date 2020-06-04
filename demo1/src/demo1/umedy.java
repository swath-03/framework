package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptException;


public class umedy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\OneDrive\\Documents\\courses\\chromedriver.exe");
				 
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://pandawatford.co.uk/");
				
				
			Thread.sleep(5000);
			
			
				
		WebElement book = driver.findElement(By.xpath(".//a[@href='/index.php?r=site%2Fproduct&id=18&type=product']"));
		
		System.out.println(driver.getTitle());
		
		System.out.println("enter the website");
		
		Thread.sleep(5000);
			book.click();
			
		/*	WebElement ortyp =  driver.findElement(By.xpath(".//input[@type=\"radio\" and @value=\"collection\"] "));
			
			
			System.out.println(ortyp.getText());
			Thread.sleep(5000);

			System.out.println("the value of radio button" );
			ortyp.click();
			System.out.println("type collection");

			Thread.sleep(5000); */

			List<WebElement> menu = driver.findElements(By.xpath(".//div[@class=\"soup-name\"] "));
	int i;
	 for(i=0;i<10;i++)

	{
	WebElement lmenu = menu.get(i);
	
	String value = lmenu.getText();
	
	System.out.println(lmenu.getText());
	
	if (value.contains("VEGETABLE SPRING ROLLS (4) (斋春卷)"))
			
	{
	
		WebElement radio =  driver.findElement(By.xpath(".//button[@class=\"add-btn\" and @type=\"button\"] "));
           
		//System.out.println(radio.getText());
		radio.click();
		
		System.out.println("the button clicked");
		Thread.sleep(5000);


	//	if (value1.contains("collection"))
//				{
//		 lortyp.click();
//				}
	}	
		
		
	    
          

//	System.out.println("the value of i"+i);	
//WebElement menu=  driver.findElement(By.xpath(".//div[@class=\"soup-name\"] ")); 

//System.out.println(menu.getText(i));
 
				}
	
	}

		
	}

		
	
