package AmazonWebTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPages.AmazonHomePage;

public class FashionTest {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		AmazonHomePage.openBrowser(driver);
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void fashionLink() {
		
		driver.findElement(By.linkText("Fashion")).click();
	}

}
