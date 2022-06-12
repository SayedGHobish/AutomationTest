package downloads;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pomLayar.DownloadFils;

public class DownFils extends TestBais6 {
	
	@DataProvider(name="Exceldata")
	public Object [] readData() throws IOException
	{
		ExeclRead ES = new ExeclRead();
		return ES.getExcelData();
	}


	DownloadFils downObj;
	@Test(dataProvider = "Exceldata")
	public void downFromWeb() throws InterruptedException
	{
		downObj = new DownloadFils(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", downObj.button);
		
		JavascriptExecutor art = (JavascriptExecutor) driver;
		art.executeScript("arguments[0].click();", downObj.diss);

		JavascriptExecutor down = (JavascriptExecutor) driver;
		down.executeScript("arguments[0].click();", downObj.Button);
	}

	@AfterTest
	public void closeUrl()

	{
		driver.quit();
	}
}
