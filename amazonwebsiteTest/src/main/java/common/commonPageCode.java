package common;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.StoreLocatorPage;


public class commonPageCode {
	
	
	public static void specialSendKeys(String xpath, String textToEnter, WebDriver driver) {
		
		for(int i=0; i<=2;i++){
			  try{
			     driver.findElement(By.xpath(xpath)).sendKeys(textToEnter);
			     break;
			  }
			  catch(Exception e){
			    
			  }
			}
		
		
	}

	public static void specialClick(String xpath, WebDriver driver) {

		for (int i = 0; i <= 2; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {

			}
		}
	}

		public static String getProperty(String propertyName) {
			
			String propertValue = "";
			
			 try (InputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config.properties")) {

		            Properties prop = new Properties();

		            // load a properties file
		            prop.load(input);

		            // get the property value and print it out
		            propertValue= prop.getProperty(propertyName);
		           

		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
			
			return propertValue;
			
			
		}

	/*	public static void getUrl(WebDriver driver) {
			driver.get(commonPageCode.getProperty("URL"));
			
		}    */

		
		
		
}
