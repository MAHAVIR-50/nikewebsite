package TestNGListnerConcept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	public static void Failed(String testMethodName) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("C:\\Users\\Mahavir\\eclipse-workspace\\Selenium-Training\\amazonwebsiteTest\\Schreenshot\\" + testMethodName + "_" +" .png" ));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
