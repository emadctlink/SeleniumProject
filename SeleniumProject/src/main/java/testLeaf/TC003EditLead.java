package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC003EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		System.out.println("Testleaf url= "+driver.getTitle());
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		 
		
		//click crm/sfa
		driver.findElementByLinkText("CRM/SFA").click();
				
		//click on Leads link
		driver.findElementByLinkText("Leads").click();

		//click on Find leads link
		driver.findElementByLinkText("Find Leads").click();
		
		//click on Name&ID
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		
		//driver.findElementByXPath("//span[text()='Phone']").click();
		
		//enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		
		//enter last name
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Mali");
		
		//click on find leads button
		driver.findElementByLinkText("Find Leads").click();
		//click on FstResultingLead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").click();
		
		System.out.println("verifyed title = "+driver.getTitle());
		
		driver.findElementByLinkText("Edit").click();
		
		Thread.sleep(3000);
		driver.findElementById("updateLeadForm_companyName").clear();
		Thread.sleep(2000);
		
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByClassName("smallSubmit").click();
	
		driver.close();
	}

}
