package scripts;

import org.testng.annotations.Test;

import generic_libraries.ba_gmailaccount;
import pom.Pom_gmail_acc;

public class Gmail_account extends ba_gmailaccount {
	@Test
	public void gamil_data() throws InterruptedException
	{
		gmail_account_sign("praveen","gouda","pexoenej","hello1234","hello1234");
	}
	
	public void gmail_account_sign(String fnn,String lnn,String us,String pwd,String cpsw) throws InterruptedException
	{
		
		driver.manage().window().maximize();
		
		Pom_gmail_acc g1=new Pom_gmail_acc(driver);
		
		Thread.sleep(2000);
		
		g1.firstname(fnn);
		
		Thread.sleep(2000);
		
		g1.lastname(lnn);
		
		Thread.sleep(2000);
		
		g1.user(us);
		
		Thread.sleep(2000);
		
		g1.password(pwd);
		
		Thread.sleep(2000);
		g1.cpassword(cpsw);
		
		Thread.sleep(2000);
		
		g1.next();
		
		
				
	}
}
