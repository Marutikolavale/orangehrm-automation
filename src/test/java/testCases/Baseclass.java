package testCases;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import utilities.IAutoConstant;
public class Baseclass implements IAutoConstant {
public static WebDriver driver;
	SoftAssert sa = new SoftAssert();
	@BeforeSuite
	public void setup() {
		try {
			utilities.Report.createReportFolderPath();
			utilities.Report.createReport();
			utilities.Report.createScreenshotFolderPath();
			utilities.Report.createLogsFolder();
		} catch (Exception e) {
			throw new RuntimeException("Failed to initialize reporting setup", e);
		}
	}
	@BeforeMethod
	public void init() throws IOException {
		utilities.GlobalIdentifiers.setDriver(driver);
		String Browser =utilities.GlobalIdentifiers.getProperty("Browser");	
		String Url=	utilities.GlobalIdentifiers.getProperty("url");			
		switch (Browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":			
			driver = new EdgeDriver();		
			break;
		case "firefox":			
			driver = new FirefoxDriver();
			break;
		default:
			throw new Error("Enter correct brwoser values in config.properties file");	
		}		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));			
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		utilities.Report.extent.flush();
		driver.quit();
	}	
}