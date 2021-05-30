package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathTest {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByXPath("//div[@id='label']").click();
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Malini");
		
		WebElement src = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd = new Select(src);
		dd.selectByVisibleText("Partner");
		
//		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
//		Select src = new Select(source);
//		src.selectByVisibleText("Partner");
	
	}
	
	
	
}
