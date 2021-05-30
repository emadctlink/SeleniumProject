package testNG_Inheritance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InheritCreateAccount extends ProjectSpecificWrapper {
	
	
	@Test
	public void creatAccount() throws InterruptedException {
		
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
	}
}
