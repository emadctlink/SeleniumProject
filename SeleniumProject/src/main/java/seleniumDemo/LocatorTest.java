package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		System.out.println("url = "+driver.getTitle());
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Employee");
		
		WebElement mktcamp = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mktcamp);
		dd1.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(ind);
		dd2.selectByIndex(2);
		
		WebElement curency = driver.findElementById("createLeadForm_currencyUomId");
		Select dd3 = new Select(curency);
		dd3.selectByVisibleText("USD - American Dollar");
		
		WebElement ownship = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd4 = new Select(ownship);
		dd4.selectByValue("OWN_PARTNERSHIP");
		
		
		
		
		
		/*//logout
		driver.findElementByLinkText("Logout").click();
		
		//explicitly wait
		Thread.sleep(2000);
		
		driver.close();*/
		
		
		

	}

}