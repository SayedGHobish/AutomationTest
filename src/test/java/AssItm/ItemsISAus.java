package AssItm;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pomLayar.AssertItem;



public class ItemsISAus extends TestBais4 {

	AssertItem assObject;

	@Test 
	public void testItem()
	{
		assObject = new AssertItem(driver);
		List<WebElement> rows = assObject.tableItem.findElements(By.tagName("tr"));
		Assert.assertEquals(7, rows.size());

		for (WebElement row : rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col : cols)
			{
				System.out.println(col.getText() + "\t");
			}
			System.out.println();
		}
	}

	@AfterTest
	public void closeWeb()
	{
		driver.quit();
	}

}
