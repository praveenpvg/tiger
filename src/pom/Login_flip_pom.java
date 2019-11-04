package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libraries.Generic_action;



public class Login_flip_pom {
	
	//Declaration
	@FindBy(xpath="//button[.='✕']")
	private WebElement closelog;
	
	@FindBy(xpath="//form/div[@class='_39M2dM JB4AMj'][1]")
	private WebElement user ;
	
	@FindBy(xpath="//form/div[@class='_39M2dM JB4AMj'][2]")
	private WebElement pswd;
	
	@FindBy(xpath="//button/span[.='Login']")
	private WebElement login; 
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement compose;
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement to;
	
	@FindBy(xpath="//span[.='Men']")
	private  WebElement hover;
	
	@FindBy(xpath="//a[.='Shirts']")
	private WebElement sht;
	
	@FindBy(xpath="(//div[@class='IIdQZO _1R0K0g _1SSAGr'])[1]")
	private WebElement s_title;
	
	@FindBy(xpath="//li[@id='swatch-2-size']/a")
	private WebElement size;
	
	@FindBy(xpath="//li/button")
	private WebElement cart;
	
	@FindBy(xpath="//button[2]")
	private WebElement plus;
	
	@FindBy(xpath="//span[@class='pMSy0p XU9vZa']")
	private WebElement total;
	//inilization
	
	public Login_flip_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void closelog()
	{
	closelog.click();
	}
	
	public void user()
	{
		user.sendKeys("praveeenpvg@gmail.com");
	}
	
	public void pass()
	{
		pswd.sendKeys("");
	}
	
	public void submit()
	{
		login.click();
	}
	
	public void mos_house(WebDriver driver)
	{
	 
		Generic_action act=new Generic_action(driver);
		
		act.mouse_hover(hover);
	}
	
	public void shirt()
	{
		sht.click();
	}
	
	public void shirt_title()
	{
		s_title.click();
	}
	
	public void size()
	{
		size.click();
	}
	
	public void cart()
	{
		cart.click();
	}
	
	public void plus() throws InterruptedException
	{
		for (int i = 0; i <= 5; i++) {
			plus.click();

			Thread.sleep(2000);
		}
	}
	
	public void total()
	{
	String txt = total.getText();
		
		System.out.println(txt);
		int intcar = Integer.parseInt(txt);
		System.out.println(intcar);
	}



	
}
