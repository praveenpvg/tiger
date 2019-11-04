package pom;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic_libraries.Writedata;

public class Pom_github {
	@FindBy(xpath="//a[@class='HeaderMenu-link no-underline mr-3']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@id='login_field']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath="(//input[@name='commit'])[1]")
	private WebElement sign;
	
	@FindBy(xpath="//a[.='Start a project']")
	private WebElement startproject;
	
	@FindBy(xpath="//input[@id='repository_name']")
	private WebElement cname;
	
	@FindBy(xpath="//button[contains(.,'Create repository')]")
	private WebElement creater;
	
	@FindBy(xpath="//input[@id='empty-setup-clone-url']")
	private WebElement geta;
	
	@FindBy(xpath="//pre[@id='empty-setup-new-repo-echo']")
	private WebElement excel;
	
	@FindBy(xpath="(//span[@class='dropdown-caret'])[2]")
	private WebElement drop;
	
	@FindBy(xpath="(//button[contains(.,'Sign out')])[2]")
	private WebElement logout;
	//ini
	
	
	public Pom_github(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void signbutton()
	{
		signin.click();
	}
	public void user(String s1)
	{
		username.sendKeys(s1);
	}
	
	public void pass(String s2)
	{
		pass.sendKeys(s2);
	}
	
	public void signin()
	{
		sign.click();
	}
	
	public void startproj()
	{
		startproject.click();
	}
	
	public void proname(String s3)
	{
		cname.sendKeys(s3);
	}
	
	public void createbutton()
	{
		creater.click();
	}
	
	public void geturl(String value)
	{
		String txt = geta.getAttribute(value);
		System.out.println(txt);
	}
	
	public void excel() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Writedata wd=new Writedata();
		
		
		
		 Select s= new Select (excel);
			
			List<WebElement> option = s.getOptions();
			int row=0;
			for (WebElement we : option) 
			{
				String txt = we.getText();
				System.out.println(txt);
				wd.Write_excel(0, "Sheet1", 0);
				row=row+1;
			}

		
		
		
	}
	
	public void drop()
	{
		drop.click();
	}
	
	public void logout()
	{
		logout.click();
	}
}
