package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		
	/*	// 1st Way - by using ID from DOM of Iframe 
		//Move from html to Iframe
		driver.switchTo().frame("iframeResult");
		System.out.println("You are in Iframe for way 1");
		
		//clear the appear name from First name by using Xpath
		driver.findElement(By.xpath("//input[@value='John']")).clear();
		
		//Enter New Fname 
		driver.findElement(By.xpath("//input[@value='John']")).sendKeys("Mamun");
		driver.findElement(By.xpath("//input[@value='Doe']")).clear();
		driver.findElement(By.xpath("//input[@value='Doe']")).sendKeys("Vai");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Thread.sleep(2000);
		
		//switch back to main html /parent page
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);  */
		
		
	/*	//2nd way- by using Iframe Xpath index 1
		//Entering to Frame from html
		driver.switchTo().frame(1);
		System.out.println("You are in Iframe for way 2");
		
	    //clear the appear first name by using Xpath
		driver.findElement(By.xpath("//input[@value='John']")).clear();
		
		//Enter New Name 
		driver.findElement(By.xpath("//input[@value='John']")).sendKeys("Eva");
		driver.findElement(By.xpath("//input[@value='Doe']")).clear();
		driver.findElement(By.xpath("//input[@value='Doe']")).sendKeys("Apa");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//switch back to main html
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000); */
		
		
		// 3rd way-by using Iframe Xpath, webElement and Variable
		// move to Frame from html
		WebElement IframeThird = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(IframeThird);
		
		System.out.println("you are in to Iframe for way3");
		
	    //clear the appear first name by using Xpath
		driver.findElement(By.xpath("//input[@value='John']")).clear();
		
		//Enter New Name 
		driver.findElement(By.xpath("//input[@value='John']")).sendKeys("Hasan");
		driver.findElement(By.xpath("//input[@value='Doe']")).clear();
		driver.findElement(By.xpath("//input[@value='Doe']")).sendKeys("Vai");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//switch back to main html
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);	
		
		driver.close();
		

	/*	//jqueryui
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//Way 1- is not possible because there is no ID or Name available in DOM of Iframe
		
//		//way 2- by using Iframe Xpath index 1
//		driver.switchTo().frame(0);
//		System.out.println("Frame check by way 2");
//		
		
		//Way 3- by using Iframe Xpath, webElement and Variable
		
		WebElement way3 = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(way3);
		System.out.println("Frame check by way 3");
		
		
		Thread.sleep(1000);
		// select Item 1
		driver.findElementByXPath("//li[text()='Item 1']").click();
		System.out.println("Item 1 checked");
		
		Thread.sleep(1000);
		//Select Item 2
		driver.findElementByXPath("//li[text()='Item 2']").click();
		System.out.println("Item 2 checked");
		
		Thread.sleep(1000);
		// select Item 3
		driver.findElementByXPath("//li[text()='Item 3']").click();
		System.out.println("Item 3 checked");
		
		Thread.sleep(1000);
		//Select Item 4
		driver.findElementByXPath("//li[text()='Item 4']").click();
		System.out.println("Item 4 checked");
		
		Thread.sleep(1000);
		//Select Item 5
		driver.findElementByXPath("//li[text()='Item 5']");
		System.out.println("Item 5 checked");
		
		
		Thread.sleep(1000);
	
		
		driver.close();
		
		*/
	}

}
