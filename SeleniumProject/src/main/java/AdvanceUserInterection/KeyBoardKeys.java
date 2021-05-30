package AdvanceUserInterection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Selectable']").click();
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		Thread.sleep(3000);
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).release().perform();
		
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		driver.close();
		
	}
}
