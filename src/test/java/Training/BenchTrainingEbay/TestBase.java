package Training.BenchTrainingEbay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {

	protected WebDriver driver;
	
	/*@BeforeTest
	@Parameters("browser")
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\santvina\\Desktop\\new\\chromedriver.exe");
			driver = new ChromeDriver();		}
	}*/

	@BeforeMethod
	public void before() {
		driver = DriverManager.getWebDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// navigate to URL
		driver.get("https://www.phptravels.net/home");
		// delete cookies
		driver.manage().deleteAllCookies();
	}

	@AfterMethod
	public void after() {
		DriverManager.killDriver();

	}

}
