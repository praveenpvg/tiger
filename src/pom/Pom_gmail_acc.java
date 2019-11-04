package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_gmail_acc {
	
	@FindBy (xpath="//input[@id='firstName']")
	private WebElement firstname;
	
	@FindBy (xpath="//input[@id='lastName']")
	private WebElement lastname;
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement user1;
	
	@FindBy (xpath="//input[@name='Passwd']")
	private WebElement pass;
	
	@FindBy (xpath="//input[@name='ConfirmPasswd']")
	private WebElement conpass;
	
	@FindBy (xpath="(//span[.='Next'])[1]")
	private WebElement next;
	
	//ini
	
	public Pom_gmail_acc(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//
	
	public void firstname(String a)
	{
		firstname.sendKeys(a);
	}
	
	public void lastname(String b)
	{
		lastname.sendKeys(b);
	}
	
	public void user(String user)
	{
		user1.sendKeys(user);
	}
	
	public void password(String c)
	{
		pass.sendKeys(c);
	}
	
	public void cpassword(String d)
	{
		conpass.sendKeys(d);
	}
	
	public void next()
	{
		next.click();
	}
	
}
