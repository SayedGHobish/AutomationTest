package pomLayar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleTaskPagw extends PageBais{

	public GoogleTaskPagw(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(name = "q")
	WebElement SendTxT;
	
	@FindBy(css = " div.NJo7tc.Z26q7c.jGGQ5e>div.yuRUbf>a[href=\"https://www.javatpoint.com/selenium-tutorial\"] ")
	public
	WebElement url1;
	
	@FindBy(css ="div.NJo7tc.Z26q7c.jGGQ5e>div.yuRUbf>a[href=\"https://www.tutorialspoint.com/selenium/index.htm\"]")
	public
	WebElement Url2;
	
	public void GogleValue(String firstVal, String secondVal) 
	{
		SendTxT.sendKeys(firstVal);
		SendTxT.sendKeys(Keys.ENTER);
		SendTxT.clear();
		SendTxT.sendKeys(secondVal);
		SendTxT.sendKeys(Keys.ENTER);
	}
}
