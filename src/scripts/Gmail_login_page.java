package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Gmail_login_pom;

public class Gmail_login_page {
	@Test
	
	public void login() throws InterruptedException, AWTException
	{
		
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get("http://www.gmail.com");
		
		Gmail_login_pom gl=new Gmail_login_pom(driver);
		
		gl.user("praveeenpvg");
		
		Thread.sleep(2000);
		
		
		gl.next();
		
		Thread.sleep(2000);

		
		gl.pass("Starstar193");
		
		Thread.sleep(2000);

		
		gl.next();
		
		Thread.sleep(4000);
		
		gl.compose();
		
		Thread.sleep(2000);

		gl.to("praveeenpvg");
		
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		

		
		gl.textarea("hrllo");
		Thread.sleep(5000);

		
		gl.send();
		
		Thread.sleep(2000);
		gl.sent();
		
		Thread.sleep(2000);
		
		gl.timetext();
		
		gl.logo();
		
		Thread.sleep(2000);

		
		gl.logot();
		
		driver.quit();
	}
}
