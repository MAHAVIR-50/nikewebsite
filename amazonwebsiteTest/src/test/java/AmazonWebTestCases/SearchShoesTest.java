package AmazonWebTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import AmazonCommon.AmazonCommonCode;
import AmazonPages.AddressPage;
import AmazonPages.AmazonHomePage;
import AmazonPages.goToClothingPage;
import AmazonPages.SignInPage;
import AmazonPages.goToShoesLinkPage;

public class SearchShoesTest {
	
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
	
	
	@Test(invocationCount = 1)
	public void validateShoesPrice() throws InterruptedException {
		
		AmazonHomePage.fashionLink(driver);
		AmazonHomePage.specialClickOnMenLink(driver);
		AmazonHomePage.selectProductsLinks(driver);
		AmazonCommonCode.handleWindowTab(driver);
		AmazonHomePage.SelectShoesSizeByDrop(driver);
		AmazonHomePage.productAddToCart(driver);
		goToShoesLinkPage.validatePriceOfShoes("2,795.00",driver);				
		
	}
		

}


