package fils;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pomLayar.UploadFile;

public class filesUpload extends TestBais5 {
	String xpath = System.getProperty("user.dir")+ "\\Resources\\board-361516_960_720.jpeg" ;
	UploadFile upObj;
	@Test
	public void testUpload() throws InterruptedException 
	{
		upObj = new UploadFile(driver);
		upObj.sendData(xpath);

		Assert.assertEquals("board-361516_960_720.jpeg", upObj.assUpload.getText());


	}	

	@AfterTest
	public void endUpload()
	{
		driver.quit();
	}
}
