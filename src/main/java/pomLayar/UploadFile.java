package pomLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFile extends PageBais {

	public UploadFile(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "file-upload")
	WebElement setPhoto;
	
	@FindBy(className = "button")
	WebElement uploadPhoto;
	
	public void sendData(String xpath)
	{
		setPhoto.sendKeys(xpath);
		uploadPhoto.click();
	}
	@FindBy(id ="uploaded-files")
	public
	WebElement assUpload;
	
}
