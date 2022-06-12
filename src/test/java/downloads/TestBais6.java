package downloads;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBais6 {
	public static WebDriver driver;

	public static String downloadPath = System.getProperty("user.dir")+"\\zData\\Downloads";

	public static ChromeOptions chromeOptions()
	{
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default.content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", chromePrefs);
		return options;

	}
	@BeforeSuite
	public void OpenUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions());
		driver.navigate().to("https://www.vertex42.com/ExcelTemplates/excel-gantt-chart.html");
		driver.manage().window().maximize();
	}
}
