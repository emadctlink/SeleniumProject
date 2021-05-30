package FirstPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameNested {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		
		// 1st Way- by using ID from DOM of Iframe 
		
		//Move from html to Iframe
/*		driver.switchTo().frame("iframeResult");
		System.out.println("You are in Iframe for way 1");
		
		//clear the appear name from First name by using Xpath
		driver.findElementByXPath("//input[@value='John']").clear();
		
		//Enter New Fname 
		driver.findElementByXPath("//input[@value='John']").sendKeys("Mamun");
		driver.findElementByXPath("//input[@value='Doe']").clear();
		driver.findElementByXPath("//input[@value='Doe']").sendKeys("Vai");
		
		driver.findElementByXPath("//input[@value='Submit']").click();
		
		Thread.sleep(2000);
		
		//switch back to main html /parent page
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);  
		
		
		//2nd way- by using Iframe Xpath index 1
		 * 
		//Entering to Frame from html
		driver.switchTo().frame(1);
		System.out.println("You are in Iframe for way 2");
		
	    //clear the appear first name by using Xpath
		driver.findElementByXPath("//input[@value='John']").clear();
		
		//Enter New Name 
		driver.findElementByXPath("//input[@value='John']").sendKeys("Eva");
		driver.findElementByXPath("//input[@value='Doe']").clear();
		driver.findElementByXPath("//input[@value='Doe']").sendKeys("Apa");
		
		driver.findElementByXPath("//input[@value='Submit']").click();
		
		//switch back to main html
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000); 
		
	*/	
		// 3rd way-by using Iframe Xpath, webElement and Variable
		
		// move to Frame from html
		WebElement frame3 = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(frame3);
		System.out.println("you are in to Iframe for way3");
		
		//clear the appear first name by using Xpath
		driver.findElementByXPath("//input[@id='fname']").clear();
		driver.findElementByXPath("//input[@id='fname']").sendKeys("Karim");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='lname']").clear();
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Vai");
		
		driver.findElementByXPath("//input[@value='Submit']").click();
		//switch back to main html
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);	
		
		driver.close();
		

	}

}
