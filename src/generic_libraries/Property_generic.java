package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_generic {
	
	public static  String properties(String path,String value) throws FileNotFoundException, IOException
	{
	Properties p =new Properties();
	
	p.load(new FileInputStream(path));
	
	String data = p.getProperty(value);
	
	System.out.println(data);
	
	return data;
	
}
}