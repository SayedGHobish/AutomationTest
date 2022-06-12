package pomLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssertItem  extends PageBais {

	public AssertItem(WebDriver driver) {
		super(driver);
	}

	@FindBy( id = "customers")
	public
	WebElement tableItem;
}
