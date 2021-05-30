package FirstPackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameJqueryui {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//Way 1- is not possible because there is no ID or Name available in DOM of Iframe
		
//		//way 2- by using Iframe Xpath index 1
//		driver.switchTo().frame(0);
//		System.out.println("Frame check by way 2");
//		
		
		//Way 3- by using Iframe Xpath, webElement and Variable
		
		WebElement way3 = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(way3);
		System.out.println("Frame check by way 3");
		
		
		Thread.sleep(1000);
		// select Item 1
		driver.findElementByXPath("//li[text()='Item 1']").click();
		System.out.println("Item 1 checked");
		
		Thread.sleep(1000);
		//Select Item 2
		driver.findElementByXPath("//li[text()='Item 2']").click();
		System.out.println("Item 2 checked");
		
		Thread.sleep(1000);
		// select Item 3
		driver.findElementByXPath("//li[text()='Item 3']").click();
		System.out.println("Item 3 checked");
		
		Thread.sleep(1000);
		//Select Item 4
		driver.findElementByXPath("//li[text()='Item 4']").click();
		System.out.println("Item 4 checked");
		
		Thread.sleep(1000);
		//Select Item 5
		driver.findElementByXPath("//li[text()='Item 5']");
		System.out.println("Item 5 checked");
		
		
		Thread.sleep(1000);
	
		
		driver.close();
	}

}
