package FirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		driver.findElementById("createLeadForm_lastName").sendKeys("Malini");
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MRS");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("250000");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		driver.findElementById("createLeadForm_description").sendKeys("this is a testing software");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Didn't finish dropdown");
		
		//dropdown
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Public Relations");
		
		WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mkt);
		dd1.selectByVisibleText("Automobile");
		
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(ind);
		dd2.selectByIndex(1);;
		
		WebElement ownship = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd3 = new Select(ownship);
		dd3.selectByValue("OWN_PARTNERSHIP");
		
	/*	driver.findElementByName("submitButton").click();
		
		driver.findElementByLinkText("Logout").click();
		
		//Explicitly wait
		Thread.sleep(3000);
		
		driver.close();
		*/
		
		
	
		
		
		
	}

}
