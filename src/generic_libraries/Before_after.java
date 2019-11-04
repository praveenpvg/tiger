package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Before_after {
	
	
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

	public void ab( ) {
		
		
		
		driver.quit();
	}


}
