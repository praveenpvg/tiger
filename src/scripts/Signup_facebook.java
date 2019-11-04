package scripts;

import org.testng.annotations.Test;

import generic_libraries.ba_fb;
import pom.Pom_facebook_signup;

public class Signup_facebook extends ba_fb {
	
	
	
	@Test
	public void facebooksignupscript() throws InterruptedException
	{
		signup_facebook("praveen","gouda","praveengouda@gmail.com","praveengouda@gmail.com","hello",13,3,"1992");
	}
	
	public void signup_facebook(String fn,String ln,String e,String ce,String pw,int day,int m,String y) throws InterruptedException
	{
		
		driver.manage().window().maximize();
		
		Pom_facebook_signup l1=new Pom_facebook_signup(driver);
		
		Thread.sleep(2000);
		
		l1.first_name(fn);
		
		Thread.sleep(2000);
		
		l1.lastname(ln);
		
		Thread.sleep(2000);

		l1.email(e);
		
		Thread.sleep(2000);
		
		l1.conf_email(ce);
		
		Thread.sleep(2000);
		
		l1.password(pw);
		
		Thread.sleep(2000);
		
		l1.day(day);
		
		Thread.sleep(2000);
		
		l1.month(m);
		
		Thread.sleep(2000);
		
		l1.year(y);
		
		Thread.sleep(2000);
		
		l1.gender();
		
		Thread.sleep(2000);
		
		l1.sign();
	}
		
}
