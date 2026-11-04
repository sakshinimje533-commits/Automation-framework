package ReadPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	//craete method
	public static String readDataFromPropertiesFile(String key) throws IOException {
		
		//String filePath = System.getProperty("user.dir")+"//FbTest.properties";
		
		FileInputStream myFile = new FileInputStream(System.getProperty("user.dir")+"//FbTest.properties");
		
		Properties prop = new Properties();
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
		//System.out.println(value);
	}
	
//	public static void main(String[] args) throws IOException {
//		Utility.readDataFromPropertiesFile("url");
//		
//		
//	
//		
//	}

}
