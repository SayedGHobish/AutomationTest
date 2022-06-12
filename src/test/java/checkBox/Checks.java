package checkBox;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pomLayar.CheckPage;

public class Checks extends TestBais3 {

	CheckPage checking;

	@Test
	public void checkedBox() throws InterruptedException
	{
		checking = new CheckPage(driver);
		checking.checked.click();
		Thread.sleep(2000);
		if (checking.checked.isSelected())
		{		
			System.out.println("checked");
			
		}
		
	}

	@AfterTest
	public void quite()
	{
		driver.quit();
	}

}
