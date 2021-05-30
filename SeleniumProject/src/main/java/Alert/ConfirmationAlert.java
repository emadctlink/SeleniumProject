package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		//here WebDriver is an interface so can’t create class for WebDriver  that’s why object  created for ChromeDriver class]
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		
//		String ConfirmationAlert = driver.switchTo().alert().getText();
//		System.out.println(ConfirmationAlert);
//		
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		
		//or
		// Alert Class
		Alert ConfirmationAlert = driver.switchTo().alert();
		ConfirmationAlert.getText();
		System.out.println(ConfirmationAlert.getText());
//		ConfirmationAlert.sendKeys("Alert is giving hard time");
		ConfirmationAlert.dismiss();
		
		
		
		
		driver.close();
		
		
	}
}
