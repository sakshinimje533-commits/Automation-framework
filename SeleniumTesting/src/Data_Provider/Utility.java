package Data_Provider;

public class Utility {
	
	public static void readDataFromExcel() {
		
		String path = System.clearProperty("user.dir");
		System.out.println(path);
		//C:\Users\SakshiNimje\eclipse-workspace\SeleniumTesting
		

//		String path = System.clearProperty("user.dir")+"//TestData.xlsx";
//		
//		System.out.println(path);
//		//C:\Users\SakshiNimje\eclipse-workspace\SeleniumTesting//TestData.xlsx
	}
	
	public static void main(String[] args) {
		readDataFromExcel();
	}
	
	

}

