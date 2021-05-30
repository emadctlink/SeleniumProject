package FirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		WebElement rcm = driver.findElementByXPath("//span[text()='right click me']");
		Actions rightclick = new Actions(driver);
		
		Thread.sleep(1000);
		rightclick.contextClick(rcm).perform();
		
	
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
