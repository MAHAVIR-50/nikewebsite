package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	
	public static String clickOnSignButton ="//span[text()='Account & Lists']";
	public static String clickYourAcount = "Your Account";
	public static String clickEditAddress = "//span[text()='Edit addresses for orders and gifts']";
	public static String clickOnAddress = "//div[@class='a-box-inner a-padding-extra-large']";
	public static String selectDropdown = "//select[@name='address-ui-widgets-countryCode']";
	public static String clickVisibleText = "//a[text()='Hungary']";
	public static String enterNameTextField = "//input[@id='address-ui-widgets-enterAddressFullName']";
	public static String enterAddressLineOne = "//input[@id='address-ui-widgets-enterAddressLine1']";
	public static String enterApartment = "//input[@id='address-ui-widgets-enterAddressLine2']";
	public static String enterCityName = "//input[@id='address-ui-widgets-enterAddressCity']";
	public static String enterStateName = "//input[@id='address-ui-widgets-enterAddressStateOrRegion']";
	public static String enterPostalCode = "//input[@id='address-ui-widgets-enterAddressPostalCode']";
	public static String enterPhoneNumber ="//input[@id='address-ui-widgets-enterAddressPhoneNumber']";
	

	public static void ClickOnSignInAccount(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(AddressPage.clickOnSignButton))).build().perform();
		Thread.sleep(3000);
		
	}

	public static void ClickYourAccount(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.linkText(AddressPage.clickYourAcount)).click();
		driver.findElement(By.xpath(AddressPage.clickEditAddress)).click();
		driver.findElement(By.xpath(AddressPage.clickOnAddress)).click();
		Thread.sleep(3000);
	}

	public static void SelectCountry(WebDriver driver) throws InterruptedException {
		Select dropdown = new Select(driver.findElement(By.xpath(AddressPage.selectDropdown)));
		dropdown.selectByVisibleText("Hungary");
		driver.findElement(By.xpath(AddressPage.clickVisibleText)).click();
		Thread.sleep(3000);
		
	}

	public static void enterTextInAddressFields(WebDriver driver) {
		driver.findElement(By.xpath(AddressPage.enterNameTextField)).sendKeys("Thomas Ford");
		driver.findElement(By.xpath(AddressPage.enterAddressLineOne)).sendKeys("Main Street 2");
		driver.findElement(By.xpath(AddressPage.enterApartment)).sendKeys("Ford Apartment");
		driver.findElement(By.xpath(AddressPage.enterCityName)).sendKeys("Budapest");
		driver.findElement(By.xpath(AddressPage.enterStateName)).sendKeys("Budapest");
		driver.findElement(By.xpath(AddressPage.enterPostalCode)).sendKeys("11245");
		driver.findElement(By.xpath(AddressPage.enterPhoneNumber)).sendKeys("9090909090");
		
	}

}
