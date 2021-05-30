package utils_IntegrareExcelDataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Utils_CreateLead {

	@Test
	public void createLead() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://www.leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	//print url
	System.out.println("url is = "+driver.getTitle());
	
	//input username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	//input password
	driver.findElementById("password").sendKeys("crmsfa");
	//click login
	driver.findElementByClassName("decorativeSubmit").click();
	
	//Implicitly wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//click crm/sfa
	driver.findElementByLinkText("CRM/SFA").click();
	
	
	
	
	//click create link
	driver.findElementByLinkText("Create Lead").click();
	//enter company name
	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	//enter first name
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	//enter last name
	driver.findElementById("createLeadForm_lastName").sendKeys("Malini");
	
	WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	Select dd = new Select(src);
	dd.selectByVisibleText("Employee");
	
	WebElement mktcamp = driver.findElementById("createLeadForm_marketingCampaignId");
	Select dd1 = new Select(mktcamp);
	dd1.selectByValue("CATRQ_AUTOMOBILE");
	
	//enter first name local
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hem");
	//enter last name local
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Ma");
	//enter title
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
	//enter Department
	driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
	//enter annual revenue
	driver.findElementById("createLeadForm_annualRevenue").sendKeys("2500000");
	
	WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
	Select dd2 = new Select(ind);
	dd2.selectByIndex(2);
	
	WebElement curency = driver.findElementById("createLeadForm_currencyUomId");
	Select dd3 = new Select(curency);
	dd3.selectByVisibleText("USD - American Dollar");
	
	WebElement ownship = driver.findElementById("createLeadForm_ownershipEnumId");
	Select dd4 = new Select(ownship);
	dd4.selectByValue("OWN_PARTNERSHIP");
	
	//enter create lead
		driver.findElementByName("submitButton").click();
		
		Thread.sleep(3000);
}
}
