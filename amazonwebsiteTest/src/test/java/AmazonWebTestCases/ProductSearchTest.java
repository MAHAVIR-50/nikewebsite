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

public class ProductSearchTest {
	
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
	@Ignore
	@Test
	public void clickSignInLink() throws InterruptedException {
		
		AmazonHomePage.signInClick(driver);
		SignInPage.enterUsernamePassword(driver);	
		
	}
	
	@Test(dependsOnMethods= {"searchCloths"})
	public void searchShoes() throws InterruptedException {
		
		AmazonHomePage.fashionLink(driver);
		AmazonHomePage.specialClickOnMenLink(driver);
		AmazonHomePage.selectProductsLinks(driver);
		AmazonCommonCode.handleWindowTab(driver);
		AmazonHomePage.SelectShoesSizeByDrop(driver);
		AmazonHomePage.productAddToCart(driver);
		
		Thread.sleep(5000);
		String ActualPrice = driver.findElement(By.xpath("//span[text()='3,249.00']")).getText();
		System.out.println(ActualPrice);
		String ExpectedPrice ="3,249.00";
		Assert.assertNotEquals( ActualPrice, ExpectedPrice);   
		
					
		
	}
	
	
	@Test
	public void searchCloths() throws InterruptedException {
		AmazonHomePage.fashionLink(driver);
		AmazonHomePage.specialClickOnMenLink(driver);
		goToClothingPage.AddProductAndDeleteProduct(driver);
			
		
	}
	@Ignore
	@Test
	public void selectAddress() throws InterruptedException {
		
		AmazonHomePage.signInClick(driver);
		SignInPage.enterUsernamePassword(driver);
		
		AddressPage.ClickOnSignInAccount(driver);
		AddressPage.ClickYourAccount(driver);
		AddressPage.SelectCountry(driver);
		AddressPage.enterTextInAddressFields(driver);
		
	}
	

}


