package AmazonCommon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class AmazonCommonCode {

	
	public static void handleWindowTab(WebDriver driver) {
		String parent=driver.getWindowHandle();

		Set<String>openTab=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> handleTab= openTab.iterator();

		while(handleTab.hasNext())
		{

		String child_tab=handleTab.next();


		if(!parent.equals(child_tab))
		{
		driver.switchTo().window(child_tab);

	}

			
			
		}
		

		

}
	public static String getProperty(String propertyName) {
		
		String propertValue = "";
		
		 try (InputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config2.properties")) {

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

}
