package storelocatorTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.commonPageCode;
import pages.HomePage;
import pages.StoreLocatorPage;


public class findStore {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir") + "/BrowserDriver/chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get(commonPageCode.getProperty("URL"));
		Reporter.log("Launching Browser With URL " + commonPageCode.getProperty("URL"));
		//commonPageCode.getUrl(driver)	;
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	@Test
	public void findStoreByZipCode() throws InterruptedException {
		
		HomePage.goToStoreLocator(driver);	
		StoreLocatorPage.findStoreByZipCityAddress("63017", driver);	
		StoreLocatorPage.validateFirstStoreCity("Chesterfield", driver);				
	}
	@Test(enabled=false)
		public void findStoreByCity() throws InterruptedException {
			
			HomePage.goToStoreLocator(driver);			
			StoreLocatorPage.findStoreByZipCityAddress("London", driver);
			
	}
		

}

