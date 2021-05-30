package AdvanceUserInterection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOn {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//WebElement support = driver.findElementByXPath("//a[text()='Support'][1]");	
		
		
		WebElement support = driver.findElementByXPath("(//a[text()='Support'])[1]");
		Actions mhover = new Actions(driver);
		mhover.moveToElement(support).perform();
		
		driver.findElementByXPath("//a[text()='Forums']").click();
		// or
		//mhover.moveToElement(driver.findElementByXPath("//a[text()='Support'][1]")).perform();
		
		Thread.sleep(2000);
		//driver.findElementByXPath("//a[text()='Forums']").click();
		
		Thread.sleep(2000);
		//driver.close();
		
		
		
		}
}
