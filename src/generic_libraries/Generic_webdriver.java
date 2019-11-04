package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic_webdriver {
	



	public void close1(WebDriver driver) {
		driver.close();
	}

	public void get1(WebDriver driver, String value) {
		driver.get(value);
	}
	
	public void geturl(WebDriver driver)
	{
		driver.getCurrentUrl();
	}
	
	public void pagesource(WebDriver driver)
	{
		driver.getPageSource();
	}
	
	public void title(WebDriver driver)
	{
		String arg = driver.getTitle();
		System.out.println(arg);
	}
	
	public void quit1(WebDriver driver)
	{
		driver.quit();
	}
	
	public String windowhandle(WebDriver driver ,String a)
	{
	String parent_id = driver.getWindowHandle();
	System.out.println(parent_id);
	return parent_id;
	}
	
	public void windowhandles(WebDriver driver,String b)
	{
		Set<String> all = driver.getWindowHandles();
		
		int count =all.size();
		System.out.println(count);
		
		
		for (String wh : all) {
			System.out.println(wh);
			
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		
		System.out.println(title);
		}
		
		
	
	}
	
	public void maxwindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void minwindow(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}
	
	public void write_data() throws FileNotFoundException
	{
		
		
		
		
		
		
	}
	

}
