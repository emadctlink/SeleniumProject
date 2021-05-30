package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
		
		
		// Alert class
		
		Alert SimpleAlert = driver.switchTo().alert();
		SimpleAlert.getText();
		System.out.println(SimpleAlert.getText());
		
		Thread.sleep(3000);
		SimpleAlert.accept();

		//or
		
//		String SimpleAlert = driver.switchTo().alert().getText();
//		System.out.println(SimpleAlert);
//		
//		driver.switchTo().alert().accept();
//		
		
		
		driver.close();
		
		
	}
}
