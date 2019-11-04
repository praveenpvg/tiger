package generic_libraries;

import java.util.List;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_select {
	Select s;

	public Generic_select(WebElement ele) {
		s = new Select(ele);
	}

	public void selectIndex(int i) {

		s.selectByIndex(i);
	}

	public void selectValue(String value) {

		s.selectByValue(value);
	}

	public void SelectVisible(String txt) {

		s.selectByVisibleText(txt);
	}

	public void deSelect(WebElement ele) {
		Select s = new Select(ele);

		s.deselectAll();
	}

	public void deIndex(int i) {

		s.deselectByIndex(i);
	}

	public int options_size(int i) {

		List<WebElement> optin = s.getOptions();

		int count = optin.size();
		System.out.println(count);

		return count;
	}

	public void option_text() {

		List<WebElement> option = s.getOptions();

		for (WebElement we : option) {
			String txt = we.getText();
			System.out.println(txt);
		}

	}

	public boolean multiple() {
		boolean bol = s.isMultiple();

		System.out.println(bol);

		return bol;

	}

	public void selectall() {
		List<WebElement> slc = s.getAllSelectedOptions();

		for (WebElement we : slc) {
			Point loc = we.getLocation();
			int x = loc.getX();
			int y = loc.getY();

			System.out.println(y);
			System.out.println(x);
		}
	}

}