package common;

import org.testng.annotations.DataProvider;

public class myTestData {
	
	@DataProvider(name = "myData")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { "63017", "Chesterfield" }, { "84095", "West Jordan" }, { "84006", "Athens" } };
	}		

}
