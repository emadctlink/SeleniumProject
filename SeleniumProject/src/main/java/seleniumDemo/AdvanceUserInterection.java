package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceUserInterection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		
		Thread.sleep(2000);
		
	/*	//Mouse Hover on
		WebElement support = driver.findElementByXPath("//a[text()='Support'][1]");	
		
		Actions mhover = new Actions(driver);
		mhover.moveToElement(support).perform();
		
		// or
		//mhover.moveToElement(driver.findElementByXPath("//a[text()='Support'][1]")).perform();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Forums']").click();
		
	*/	
		
		
		
	/*	//Drag And Drop
		driver.findElementByLinkText("Droppable").click();
		
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		
		Actions dd = new Actions(driver);
		dd.dragAndDrop(src, dest).perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		//or
		//driver.switchTo().parentFrame();
		
	*/
		
		
	/*	
		//Key Board Keys
		driver.findElementByXPath("//a[text()='Selectable']").click();
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		Thread.sleep(3000);
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(item7).click(item3).click(item5).click(item1).release().perform();
		
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		
	*/	
		
		
	/*	
		//Right Click  - Different website 
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		WebElement rcm = driver.findElementByXPath("//span[text()='right click me']");
		Actions rightclick = new Actions(driver);
		Thread.sleep(1000);
		rightclick.contextClick(rcm).perform();
		
	 */
		
		Thread.sleep(20000);
		driver.close();
		
	}

}
