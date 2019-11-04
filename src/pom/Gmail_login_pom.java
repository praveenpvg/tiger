package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_login_pom {
	//Declaration
	
	@FindBy(id="identifierId")
	private WebElement usmail ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwmail;
	
	@FindBy()
	private WebElement Submail; 
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement compose;
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement to;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement sub;
	
	@FindBy(xpath="(//table/tbody/tr/td[@class='Ap']/div/div)[2]")
	private WebElement txt;
	
	@FindBy(xpath="//div[.='Send']")
	private WebElement send;
	
	@FindBy(xpath="//div[.='Sent']")
	private WebElement sent;
	
	@FindBy(xpath="(//td/span)[2]")
	private WebElement gettime;
	
	@FindBy(xpath="//a/span[@class='gb_xa gbii']")
	private WebElement logo;
	
	@FindBy(xpath="//a[@id='gb_71']")
	private WebElement logout;
	
	
	
	//inisilization
	
	public Gmail_login_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilizTION
	
	public void user(String a1)
	{
		usmail.sendKeys(a1);
	}
	
	public void pass(String a2){
		pwmail.sendKeys(a2);
	}
	
	public void submit()
	{
		Submail.click();
	}
	
	public void next()
	{
		next.click();
	}
	public void  get_time()
	{
		
	}
	public void compose()
	{
		compose.click();
	}
	
	public void to(String toemail)
	{
		to.sendKeys(toemail);
	}
	
	public void subj(String su)
	{
		sub.sendKeys(su);
	}
	
	public void send()
	{
		send.click();
	}
	public void textarea(String c)
	{
		txt.sendKeys(c);
	}
	
	public void timetext()
	{
		String text = gettime.getText();
		System.out.println(text);
	}

	
	public void sent()
	{
		sent.click();
	}
	
	public void logo()
	{
		logo.click();
	}
	
	public void logot()
	{
		logout.click();
	}
}
