package pomLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetValueApiAddress extends PageBais {

	public GetValueApiAddress(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/pre")
	public
	WebElement Styless;

}
