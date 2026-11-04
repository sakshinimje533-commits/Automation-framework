package Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name="teacher")
 
  public String[][] myData() {
		
		String data[][] = {{"Sachin","Tendulkar","9898989898"},{"Rohit","Sharma","8888888888"}};
				
	return data;
	}
	
	@DataProvider(name="student") 
	public String[][] myData1(){
		String data1[][] = {{"Sakshi","Nimje","9444444444"},{"Farhin","Khalifa","9293949596"},
				{"Rekha","Shirshikar","8989898989"}};
	
	
		return data1;
  }
}
