package testNG_Inheritance;

import org.testng.annotations.Test;

public class InheritCreateContact extends ProjectSpecificWrapper {

	
	@Test
	public void creatContact() throws InterruptedException {
		
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Hema");
		driver.findElementById("lastNameField").sendKeys("Malini");
		driver.findElementByName("generalProfTitle").sendKeys("Manager");
		driver.findElementByName("departmentName").sendKeys("MKT");
		
		driver.findElementByName("submitButton").click();
		
		Thread.sleep(3000);
		
	}
}
