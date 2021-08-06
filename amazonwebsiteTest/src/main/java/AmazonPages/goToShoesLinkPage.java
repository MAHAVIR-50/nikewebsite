package AmazonPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class goToShoesLinkPage {
	public static String clickOnMenLink = "Men";
	public static String clickOnShoesLink ="//span[text()='Shoes']";
	public static String clickOnSportAndOutdoorLink ="//span[text()='Sports & Outdoor Shoes']";
	public static String clickOnRunningLink = "//span[text()='Running Shoes']";
	public static String clickOnSizeBoxLink ="//span[text()='7.5']";
	public static String clickOnProductLink ="Men's Ultimashow Running Shoe";

	public static String clickOnAddCartButton= "//input[@value='Add to Cart']";
	public static String clickOnGoToCartButton = "Cart";
	public static String validatePrice = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']";
	//public static String clickOnDeleteLink = "//input[@aria-label='Delete Adidas Men&#39;s ULTIMASHOW Running Shoe,RED, 7 UK']";
	
	public static void validatePriceOfShoes(String validationPrice,WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		String actualPrice = driver.findElement(By.xpath(goToShoesLinkPage.validatePrice)).getText();
		if(actualPrice.equals(validationPrice)) {
			
			Assert.fail("Actual Price and Validation Price did not match. Actual Price : " +actualPrice + " Validation Price :" +validationPrice );
		}else 
			Reporter.log("Actual Price and Validation Price match. Actual Price : " +actualPrice+ "Validation Price :" +validationPrice);
			
		
	}
	
}

	
