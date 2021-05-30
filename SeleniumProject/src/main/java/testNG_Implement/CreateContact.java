package testNG_Implement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContact {

	@Test
	public void createContact() throws InterruptedException{

System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Hema");
		driver.findElementById("lastNameField").sendKeys("Malini");
		driver.findElementByName("generalProfTitle").sendKeys("Manager");
		driver.findElementByName("departmentName").sendKeys("MKT");
		
		driver.findElementByName("submitButton").click();
		
		Thread.sleep(3000);
		
		
		
		driver.close();
}
}
