package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_action {

	Actions act;

	public Generic_action(WebDriver driver) {
		act = new Actions(driver);
	}

	public void mouse_hover(WebElement ele) {

		act.moveToElement(ele).perform();

	}

	public void drag_drop(WebElement a1, WebElement a2) {
		act.dragAndDrop(a1, a2).perform();
	}

	public void contextclick(WebElement ele) throws AWTException {
		act.contextClick(ele).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);

	}

	public void rightclick(WebElement ele) {
		act.doubleClick(ele).perform();
	}

	public void privatewindow(WebElement ele) throws AWTException {
		act.contextClick(ele).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_P);

		r.keyRelease(KeyEvent.VK_P);

	}

	public String attribute(WebElement ele, String a) {
		String att = ele.getAttribute(a);
		return att;
	}

}
