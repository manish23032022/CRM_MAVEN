package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getPropertyKeyValue(String Key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/main/resources/commondata/credentials.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(Key);
		return value;
		
	}

}
