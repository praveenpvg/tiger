package generic_libraries;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void Get_screenshot(WebDriver driver) throws IOException
	{
		String photo = "./photo/";
		Date d=new Date();
		 String sd = d.toString();
		 String nd = sd.replaceAll(":", "-");
		 
		 TakesScreenshot js=(TakesScreenshot) driver;
		 File src = js.getScreenshotAs(OutputType.FILE);
		 File f=new File(photo+nd+".jpg");
		 
		 FileUtils.copyFile(src, f);
		 
	}
}
