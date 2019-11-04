package generic_libraries;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Generic_webelement {
	


	public void sendtext(WebElement ele,String b)
	{
		    ele.sendKeys(b); 
	}

	public void click1(WebElement ele) {
		ele.click();
	}

	public void clear1(WebElement ele) {
		ele.clear();
	}

	public String attribute(WebElement ele, String a) {
		String att = ele.getAttribute(a);
		return att;
	}

	public void loc(WebElement ele) {
		Point p1 = ele.getLocation();

		int x = p1.getX();
		int y = p1.getY();

		System.out.println(x);
		System.out.println(y);

	}

	public void sub(WebElement ele) {
		ele.submit();
	}

	public void gtext(WebElement ele) {
		String txt = ele.getText();
		System.out.println(txt);
	}

	public boolean enable(WebElement ele) {
		boolean en = ele.isEnabled();
		return en;
	}

	public boolean displayed(WebElement ele) {
		boolean en = ele.isDisplayed();
		return en;
	}

	public boolean select(WebElement ele) {
		boolean en = ele.isSelected();
		return en;
	}

	public void getsize1(WebElement ele, Dimension a, Dimension b) {
		Dimension en = ele.getSize();
		int h = en.getHeight();
		int w = en.getWidth();
		System.out.println(h);
		System.out.println(w);

	}

	public void cssvalue(WebElement ele, String arg) {
		String s = ele.getCssValue(arg);
		System.out.println(s);
	}

}
