package storelocatorTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.commonPageCode;
import common.myTestData;
import pages.HomePage;
import pages.StoreLocatorPage;


public class findStoreDataDriven extends myTestData{
	
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
	
	
	 @Test(dataProvider = "myData")
	public void findStoreByZipCode(String zip, String city) throws InterruptedException {
		
		HomePage.goToStoreLocator(driver);	
		StoreLocatorPage.findStoreByZipCityAddress(zip, driver);	
		StoreLocatorPage.validateFirstStoreCity(city, driver);		
			
	}
	
		@Test(enabled=false)
		public void findStoreByCity() throws InterruptedException {
			
			HomePage.goToStoreLocator(driver);			
			StoreLocatorPage.findStoreByZipCityAddress("London", driver);
			
	}
	
}

