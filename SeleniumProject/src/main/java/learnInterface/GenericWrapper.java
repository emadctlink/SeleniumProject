package learnInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{

	public ChromeDriver driver;
	
	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Chrome browser launched");
		
	}

	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
	}
	public void enterBYName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}
	public void enterByCssLocator(String locator, String locatorValue) {
		driver.findElementByCssSelector(locator).sendKeys(locatorValue);
		
	}
	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();
		
	}

	public void clickByClassName(String locator) {
		driver.findElementByClassName(locator).click();
		
	}

	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue);
		
	}

	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue);
		
	}

	public void selectVisibleTextById(String Id, String Value) {
		WebElement text = driver.findElementById(Id);
		Select dd1 = new Select(text);
		dd1.selectByVisibleText(Value);
	}

	public void selectIndexByName(String Name, int Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd = new Select(ele);
		dd.deselectByIndex(Value);
	}

	public void getTextById(String Id) {
		WebElement text = driver.findElementById(Id);
		System.out.println(text);
	}

	public void closeBrowser() {
		driver.close();
		
	}

	public void clickById(String locatorValue) {
		driver.findElementById(locatorValue);
		
	}

}
