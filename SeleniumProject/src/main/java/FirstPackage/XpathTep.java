package FirstPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTep {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumSoft\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://tepeople.com/service.html");
		driver.manage().window().maximize();
		
		//collection base, click on contact us
		driver.findElementByXPath("(//a[text()='Contact Us'])[1]").click();
		
		//Attribute base for name, email....
		driver.findElementByXPath("//input[@placeholder='Name*']").sendKeys("Abul Bashar");
		
		//partial Attribute base E-mail
		driver.findElementByXPath("//input[contains(@placeholder,'E-m')]").sendKeys("abc@gmail.com");
		
		driver.findElementByXPath("//input[@placeholder='Subject*']").sendKeys("Nothing");
		driver.findElementByXPath("//input[@placeholder='Phone*']").sendKeys("12345678");
		
		//Parent to child navigation
		driver.findElementByXPath("//div[@class='form-group']/textarea").sendKeys("For Xpath testing and don't submit");
		
		//explicitly wait
		Thread.sleep(3000);
		
		//collection Xpath n click on Blog
		driver.findElementByXPath("(//a[@href='reference.html'])[1]").click();
		
		
		//driver.findElementByXPath("//h3[text()='Simple Guidance for You about Basic Computer Training']").click();
		
		//driver.findElementByXPath("//h3[contains(text(),'4 ')]").click();
		
		
		//text base Xpath and click on 'This is why...'
		driver.findElementByXPath("//h3[text()='This is why smart people are increasingly joining in IT industry since the last 15 years']").click();
		
		//or
		
		// Partial text base '4 reason why'
		driver.findElementByXPath("//h3[contains(text(),'4 Reasons Why')]").click();
		
		
		//driver.close();
		
		
	}

}
