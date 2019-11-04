package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ba_gmailaccount {
	
	
	public WebDriver driver;

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}

	@BeforeMethod

	public void bm() {
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S-1257392093%3A1571828064668047&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");

	}

	@AfterMethod

	public void ab() {
		driver.quit();
	}


}
