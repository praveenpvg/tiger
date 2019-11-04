package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import generic_libraries.ba_guithub;
import pom.Pom_github;

public class Github_login extends ba_guithub{
@Test
public void  github1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
	github("praveenpvg","usausa193","fp3", "value");
}

public void github(String us,String pw, String pn,String value) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Pom_github f1=new Pom_github(driver);
	
	
	
	Thread.sleep(2000);
	
	f1.signbutton();
	
	Thread.sleep(2000);
	
	f1.user(us);
	
	Thread.sleep(2000);
	
	f1.pass(pw);
	
	Thread.sleep(2000);
	
	f1.signin();
	
	Thread.sleep(2000);
	
	f1.startproj();
	
	Thread.sleep(2000);
	
	f1.proname(pn);
	
	Thread.sleep(2000);
	
	f1.createbutton();
	
	Thread.sleep(2000);
	
	f1.geturl(value);
	
	Thread.sleep(2000);
	
	f1.excel();
	
	Thread.sleep(2000);
	
	f1.drop();
	
	Thread.sleep(2000);
	
	f1.logout();
}

}
