package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import common.commonPageCode;

public class HomePage {
	
	public static String findAStoreLink = "//a[text()='Find A Store']";

	public static void goToStoreLocator(WebDriver driver) {
		
		Reporter.log("Clicking On The Find A Store Link");
		driver.findElement(By.xpath(findAStoreLink)).click();
		
	}


}
//driver.get(commonPageCode.getProperty("URL"));
