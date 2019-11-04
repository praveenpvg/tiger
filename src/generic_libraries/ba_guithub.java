package generic_libraries;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ba_guithub {
	
	
	public WebDriver driver;

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}

	@BeforeMethod

	public void bm() {
		driver = new FirefoxDriver();
		driver.get("https://github.com/");

	}

	@AfterMethod

	public void ab(ITestResult res) throws IOException 
	{
		int status =res.getStatus();
		
		if (status==res.FAILURE) {
			
			Screenshot.Get_screenshot(driver);
			
		}
		//driver.quit();
	}


}
