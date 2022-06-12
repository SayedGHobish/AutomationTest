package checkBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBais3 {
	public static WebDriver driver;

	@BeforeSuite
	public void OpenUrl()
	{		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
	}

}
