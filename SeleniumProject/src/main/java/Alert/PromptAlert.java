package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		
		
		//Promt Alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		String PromtAlert = driver.switchTo().alert().getText();
		System.out.println(PromtAlert);
		driver.switchTo().alert().sendKeys("Alert is giving me hard time");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	/*	
		// using Alert Class
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert PromtAlert = driver.switchTo().alert();
		PromtAlert.getText();
		System.out.println(PromtAlert.getText());
		PromtAlert.sendKeys("Alert ig giving hard time");
		
		Thread.sleep(2000);
		PromtAlert.accept();
		
		//driver.close();
		
*/
	}
}
