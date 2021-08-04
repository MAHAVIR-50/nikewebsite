package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import AmazonCommon.AmazonCommonCode;

public class AmazonHomePage {
	
	public static String clickSignLink = "//span[@id='nav-link-accountList-nav-line-1']";
	
	public static void openBrowser(WebDriver driver) {
		driver.get(AmazonCommonCode.getProperty("URL"));
		
	}
	
	public static void signInClick(WebDriver driver) {
		driver.findElement(By.xpath(AmazonHomePage.clickSignLink)).click();
		
	}
	
	public static String clickFashionLink = "//a[text()='Fashion']";

	public static void fashionLink(WebDriver driver) throws InterruptedException {
		Reporter.log("Clicking On The Fashion Link");
		driver.findElement(By.xpath(AmazonHomePage.clickFashionLink)).click();
		Thread.sleep(3000);
	}
	public static void specialClickOnMenLink(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText(goToShoesLinkPage.clickOnMenLink)).click();
		
		
	}

	public static void selectProductsLinks(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath(goToShoesLinkPage.clickOnShoesLink)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(goToShoesLinkPage.clickOnSportAndOutdoorLink)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(goToShoesLinkPage.clickOnRunningLink)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(goToShoesLinkPage.clickOnSizeBoxLink)).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(goToShoesLinkPage.clickOnProductLink)).click();
		Thread.sleep(3000);
		
	}
	
	public static String SelectDropdown = "//select[@name='dropdown_selected_size_name']";

	public static void SelectShoesSizeByDrop(WebDriver driver) throws InterruptedException {
		Select dropdown = new Select(driver.findElement(By.xpath(SelectDropdown)));
		dropdown.selectByVisibleText("7 UK");
		
		Thread.sleep(4000);
	}
	

	public static void productAddToCart(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(goToShoesLinkPage.clickOnAddCartButton)).click(); //click on add to cart button
		Thread.sleep(3000);
		driver.findElement(By.linkText(goToShoesLinkPage.clickOnGoToCartButton)).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(goToShoesLinkPage.clickOnDeleteLink)).click();
		
	}

	

	
	
}
