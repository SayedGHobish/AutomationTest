package pomLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadFils extends PageBais{

	public DownloadFils(WebDriver driver) {
		super(driver);
	}

	
	/*@FindBy(className = "btnDL")
	public
	WebElement button;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div/svg")
	public
	WebElement diss;*/
	@FindBy(className = "btnDL")
	public
	WebElement Button;

}
