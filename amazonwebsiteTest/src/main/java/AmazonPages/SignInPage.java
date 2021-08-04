package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	public static String sendKeysToUsername = "//input[@id='ap_email']";
	public static String clickContinueButton = "//input[@id='continue']";
	public static String sendKeysToPassword = "//input[@id='ap_password']";
	public static String clickSignInButton = "//input[@id='signInSubmit']";
	
	public static void enterUsernamePassword(WebDriver driver) {
		driver.findElement(By.xpath(SignInPage.sendKeysToUsername)).sendKeys("9416165880");
		driver.findElement(By.xpath(SignInPage.clickContinueButton)).click();
		driver.findElement(By.xpath(SignInPage.sendKeysToPassword)).sendKeys("Chhoker@9050");
		driver.findElement(By.xpath(SignInPage.clickSignInButton)).click();
		
	}
	
	
}



