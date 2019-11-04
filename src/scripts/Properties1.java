package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_libraries.Property_generic;

public class Properties1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p=new Properties();//step1 create an object
		
		Property_generic.properties("./p.properties", "country");//step 2 set the path
		
		
		p.load(new FileInputStream("./p.properties"));//step3 get the corresponding value
		
		String data=p.getProperty("iw");
		System.out.println(data);
		
		
		long lon = Long.parseLong(data);
		
		System.out.println(lon);
		
		Property_generic.properties("./p.properties", "url");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(lon,TimeUnit.SECONDS);
		
	
		
	}

}
