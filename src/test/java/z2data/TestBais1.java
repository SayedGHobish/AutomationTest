package z2data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBais1 {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void OpenUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://api.agify.io/?name=Ahmed");
		driver.manage().window().maximize();
	}
}
