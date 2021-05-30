package testNG_Implement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateAccount {

	@Test
	public void createAccount() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	
	
	
	driver.findElementByLinkText("Create Account").click();
	driver.findElementById("accountName").sendKeys("TBA");
	driver.findElementById("groupNameLocal").sendKeys("Hem");
	driver.findElementById("officeSiteName").sendKeys("TBA-CA");
	driver.findElementById("annualRevenue").sendKeys("2500000");
	WebElement industry = driver.findElementByName("industryEnumId");
		Select dd = new Select(industry);
		dd.selectByVisibleText("Computer Software");;
	driver.findElementById("numberEmployees").sendKeys("410");
	driver.findElementByClassName("inputBox").sendKeys("Learning TestNG Annotations");
	
	driver.findElementByClassName("smallSubmit").click();
	
	Thread.sleep(3000);
	
	
	
	driver.close();
	
	}	
}
