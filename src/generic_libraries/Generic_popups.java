package generic_libraries;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_popups {

	public void alert_handle(WebElement ele, WebDriver driver) {
		ele.click();
		Alert a = driver.switchTo().alert();
		String txt = a.getText();
		System.out.println(txt);
		a.accept();
	}
	
	public void alert_hiddendiv()
	{
		
	}

}
