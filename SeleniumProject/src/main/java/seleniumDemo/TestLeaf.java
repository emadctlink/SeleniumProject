package seleniumDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestLeaf {

	public static void main(String[] args) throws InterruptedException {
	
	
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//print url
		System.out.println("url is = "+driver.getTitle());
		
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click crm/sfa
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on Leads
		driver.findElementByLinkText("Leads").click();
		
		//click on create lead
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
		
		
		
		//enter employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("410");
		// enter ticker symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("not found");		
		//enter Description
		driver.findElementById("createLeadForm_description").sendKeys("Testleaf is software company");
		//enter note
		driver.findElementById("createLeadForm_importantNote").sendKeys("Didn't finish Birth date");
		//enter Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("876");
		//enter Phone Number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("12345678");
		//enter extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("20");
		//person to ask
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Abul");
		//enter email
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		//enter web url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		
		//enter to name
		driver.findElementById("createLeadForm_generalToName").sendKeys("Abul Hasan");
		//Attention Name
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Mr. Bashar");
		//Enter address
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("123 old county road");
		//Enter city
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chhotadesh");
		
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd5 = new Select(state);
		dd5.selectByVisibleText("New York");
		
		//enter Zip code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("11001");
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd6 = new Select(country);
		dd6.selectByVisibleText("United States");
		
		//click create lead
		driver.findElementByName("submitButton").click();
		
		
		//Explicitly wait
		Thread.sleep(2000);
	
		
		//click on logout btn
		//driver.findElementByLinkText("Logout").click();
		
		//close web page
		//driver.close();
		
	
	}
	
}
