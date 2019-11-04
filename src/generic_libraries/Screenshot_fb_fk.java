package generic_libraries;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot_fb_fk {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softselenium/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		Screenshot.Get_screenshot(driver);
		
		Thread.sleep(2000);
		
		driver.get("http://www.flipkart.com");
		
		Screenshot.Get_screenshot(driver);
	}

}
