package scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic_libraries.ba_flipkartlogin;
import pom.Login_flip_pom;

public class Login_page_flip extends ba_flipkartlogin {
	@Test
	
	public void Login() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Login_flip_pom f1=new Login_flip_pom(driver);
		
		f1.closelog();
		
		Thread.sleep(5000);
	
		
		f1.mos_house(driver);
		
		Thread.sleep(5000);
		
		f1.shirt();
		
		Thread.sleep(5000);

		
		f1.shirt_title();
		
		Thread.sleep(5000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all = driver.getWindowHandles();
		
		int count =all.size();
		
		System.out.println(count);
		
		for (String wh : all) {
			System.out.println(wh);
			
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		
		System.out.println(title);
		}
				
		
		f1.size();
		
		Thread.sleep(5000);

		
		f1.cart();
		
		Thread.sleep(5000);

		
		f1.plus();
		
		Thread.sleep(2000);
		
		  f1.total();
		
		
		
		
		
		
	}
}
