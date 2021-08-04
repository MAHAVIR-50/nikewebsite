package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import common.commonPageCode;

public class StoreLocatorPage {
	
	public static String findStoreTextField ="//input[@placeholder='Enter city, address or postcode']";
	public static String findStoreButton ="//div[@class='bw__SearchBarFlagship__submit']";
	
	public static void findStoreByZipCityAddress(String ZipCityAddress, WebDriver driver) throws InterruptedException {
		
		Reporter.log("Searching By " +ZipCityAddress);
		commonPageCode.specialSendKeys(StoreLocatorPage.findStoreTextField,ZipCityAddress,driver);	
		Thread.sleep(3000);
		Reporter.log("Clicking On Find Button ");
		commonPageCode.specialClick(StoreLocatorPage.findStoreButton,driver);
		
	}

	public static void validateFirstStoreCity(String validationCity, WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		String actualCity = driver.findElement(By.xpath("(//div[@class='bw__StoreLocation__cityState']/span[1])[1]")).getText();
		
		if(!actualCity.split(",")[0].equals(validationCity)) {
		Assert.fail("Actual city and Validation city did not match. Actual City : " + actualCity.split(",")[0] + "  Validation City :" + validationCity );	
			
		}else 
			Reporter.log("Actual city and Validation city match. Actual City : " + actualCity.split(",")[0] + "  Validation City :" + validationCity );
		
		
	}

	

}
