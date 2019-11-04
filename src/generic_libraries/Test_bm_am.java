package generic_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_bm_am extends Generic_start {
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//a[.='Login & Signup']")).click();
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("praveeenpvg@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("maverickm4a1");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Assert.assertTrue(title.contains("Online Shopping"));
		
		Assert.assertEquals(url, "https://www.flipkart.com/");
		
		System.out.println("1");

	}
}
