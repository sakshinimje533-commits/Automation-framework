package ReadPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir")+"//FbTest.properties";
		
		//file cha input ghyaycha ahe mhnun file cha object create kraycha ahe
		FileInputStream myFile = new FileInputStream(filePath);
		
		//properties cha class java util pasun milel
		Properties prop = new Properties(); 
		prop.load(myFile);// file load kraychi
		
		String value = prop.getProperty("url");
		System.out.println(value);
		
//		String value1 = prop.getProperty("firstName");
//		System.out.println(value1);
//		
//		String value2 = prop.getProperty("lastName");
//		System.out.println(value2);
//		

	}

}
