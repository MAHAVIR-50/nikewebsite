package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class goToClothingPage {
	
	public static String ClickingOnClothingLink="//span[text()='Clothing']";
	public static String ClickingOnTShirtPolo="//span[text()='T-Shirts & Polos']";
	public static String ClickOnSize = "//button[@value='M']";
	public static String ClickOnColorPattern = "+15 colors/patterns";
	public static String SelectColor ="//img[@alt='Aqua Blue']";
	public static String AddCartButton ="//input[@value='Add to Cart']";
	public static String GoCartButton="Cart";
	public static String DeleteItem ="//input[@aria-label='Delete AMERICAN CREW Men&#39;s Regular Fit T-Shirt (AC386-M_Aqua Blue_Medium)']";
	
	public static void AddProductAndDeleteProduct(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(goToClothingPage.ClickingOnClothingLink)).click();
		driver.findElement(By.xpath(goToClothingPage.ClickingOnTShirtPolo)).click();
		driver.findElement(By.xpath(goToClothingPage.ClickOnSize)).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(goToClothingPage.ClickOnColorPattern)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(goToClothingPage.SelectColor)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(goToClothingPage.AddCartButton)).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText(goToClothingPage.GoCartButton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(goToClothingPage.DeleteItem)).click();
		
		
		
	}
	
	

	
		

}
