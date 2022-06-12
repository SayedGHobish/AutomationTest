package task1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pomLayar.GoogleTaskPagw;

public class GoogleTask extends TestBais2 {
	
	@DataProvider(name ="ExcelData")
	public Object [][] GoogleData() throws IOException 
	{
		ExcelReader ER =new ExcelReader();
		return ER.getExcelData();
		
	}
	

	GoogleTaskPagw googleObj;

	@Test(dataProvider = "ExcelData")
	public void googleSearch(String firstVal , String secondVal)
	{
		googleObj = new GoogleTaskPagw(driver);
		googleObj.GogleValue(secondVal, secondVal);
		googleObj.url1.getAttribute("href");
		Assert.assertEquals("https://www.javatpoint.com/selenium-tutorial", googleObj.url1.getAttribute("href"));
		googleObj.Url2.getAttribute("href");
		Assert.assertEquals("https://www.tutorialspoint.com/selenium/index.htm", googleObj.Url2.getAttribute("href"));


	}


	@AfterTest
	public void close() {
		driver.quit();
	}
}
