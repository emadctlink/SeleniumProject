package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC004DeleteLead {

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
		
		//click on Phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		Thread.sleep(2000);
		//enter phone number what used before
		driver.findElementByName("phoneAreaCode").sendKeys("876");
		
		driver.findElementByName("phoneNumber").sendKeys("12345678");
		
		//click on find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//click on FstResLead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		driver.findElementByLinkText("Delete").click();
	}

}
