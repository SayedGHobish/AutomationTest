package pomLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBais {
	
	protected WebDriver driver;
	
	public PageBais(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
