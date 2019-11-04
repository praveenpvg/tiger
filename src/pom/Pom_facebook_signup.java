package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libraries.Generic_select;

public class Pom_facebook_signup {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname ;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement confirmemail; 
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement password;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement day ;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month ;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year ;
	
	@FindBy(xpath="(//span/input)[2]")
	private WebElement gender;
	
	@FindBy(xpath="(//button[.='Sign Up'])[1]")
	private  WebElement sign;
	
	//declaration
	
	
	public Pom_facebook_signup (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void first_name(String fn)
	{
		firstname.sendKeys(fn);
	}
	
	public void lastname(String ln)
	{
		lastname.sendKeys(ln);
	}
	
	public void email(String e)
	{
		email.sendKeys(e);
	}
	
	public void conf_email(String confe)
	{
		confirmemail.sendKeys(confe);
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void day(int a1)
	{
		Generic_select sl=new Generic_select(day);
			sl.selectIndex( 1);
	}
	
	public void month(int a2)
	{
		Generic_select s2=new Generic_select(month);
		s2.selectIndex(3);
	}
	
	public void year(String a3)
	{
		Generic_select s3=new Generic_select(year);
		s3.SelectVisible("1992");
	}
	
	public void gender()
	{
		gender.click();
	}
	
	public void sign()
	{
		sign.click();
	}
}
