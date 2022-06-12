package z2data;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pomLayar.GetValueApiAddress;

public class GetNameAgeCount extends TestBais1 {
	
	GetValueApiAddress getobject;
	
	@Test
	public void ValueApi()
	{
		getobject = new GetValueApiAddress(driver);
		System.out.println(getobject.Styless.getText());
	}
	
	@AfterTest
	public void closeUrl()
	{
		driver.quit();
	}
	
}
