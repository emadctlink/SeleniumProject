package AdvanceUserInterection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumSoft\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
		driver.findElementByLinkText("Droppable").click();
		
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		
		Actions dd = new Actions(driver);
		dd.dragAndDrop(src, dest).perform();
		
		
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElementByXPath("//a[text()='Selectable']").click();
		//or
		//driver.switchTo().parentFrame();
		

		
		
	//driver.close();	
		
	}

	
}
