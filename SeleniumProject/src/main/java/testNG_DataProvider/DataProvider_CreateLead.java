package testNG_DataProvider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DataProvider_CreateLead extends ProjectSpecificWrapper {

	@Test (dataProvider = "getData")
	public void creatLead(String CName, String FName, String LName) throws InterruptedException {
				//click create link
				driver.findElementByLinkText("Create Lead").click();
				//enter company name
				driver.findElementById("createLeadForm_companyName").sendKeys(CName);
				//enter first name
				driver.findElementById("createLeadForm_firstName").sendKeys(FName);
				//enter last name
				driver.findElementById("createLeadForm_lastName").sendKeys(LName);
				
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
