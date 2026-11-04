package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	private static String myTest;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//How many rows are there?
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));//Rows
		 int totalNumberOfRows = rows.size();
		 System.out.println("Total No of Rows : " + totalNumberOfRows);
		 
		 //How many columns are there?
		 //List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th"));//Row 1 Column
		 List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//th")); //Column
		 int totalNumberOfColumns = columns.size();
		 System.out.println("Total No of Columns : " + totalNumberOfColumns);
		 
//		 //How to read particular data from table?
//		 WebElement CheckAnyElement = driver.findElement(By.xpath("//table[@name='courses']//tr[3]//td[2]")); // 3row 2column
//		 String myText = CheckAnyElement.getText();
//		 //String myTest = null;
//		 System.out.println("Data is " + myText); //Data is Learn SQL in Practical + Database Testing from Scratch
//		 
//		 //How to read particular row from table
//		 for(int i = 1 ; i <= totalNumberOfColumns ; i++) {
//			 WebElement element = driver.findElement(By.xpath("//table[@name='courses']//tr[5]//td["+i+"]"));
//			 String text = element.getText();
//			 System.out.println(text);//Rahul Shetty
//			                          //WebSecurity Testing for Beginners-QA knowledge to next level
//			                          // 20
//			  }
//		 
//		 for(int i = 2; i <= totalNumberOfColumns ; i++) {
//			 WebElement element = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[3]"));
//			 String text = element.getText();
//			 System.out.println(text);//30 
//			                          //25	 
//		 }
		 
		 //How to read all table data -> excluding header
		 //added header seperately
//		 for(int i=1; i<= totalNumberOfColumns; i++) {
//			WebElement header = driver.findElement(By.xpath("//table[@name='courses']//tr[1]/th["+i+"]")); 
//			System.out.print(header.getText()+" "); //Instructor Course Price 
//			
//		 }
//		 System.out.println();
		 
//		 for(int j = 2 ; j<= totalNumberOfRows; j++) {
//			 for(int k = 1 ; k <= totalNumberOfColumns; k++) {
//				 WebElement data = driver.findElement(By.xpath("//table[@name='courses']//tr["+j+"]/td["+k+"]"));
//				 System.out.print(data.getText()+ " ");
//			 }
//			 System.out.println();
//		 }
		 
		 for(int j = 1; j<= totalNumberOfRows; j++) {


			 for(int k = 1 ; k <= totalNumberOfColumns; k++) {
				 if(j == 1) {
					WebElement header = driver.findElement(By.xpath("//table[@name='courses']//tr["+j+"]/th["+k+"]"));
					System.out.print(header.getText()+" "); 
				 }else {
					 WebElement data = driver.findElement(By.xpath("//table[@name='courses']//tr["+j+"]/td["+k+"]"));
					 System.out.print(data.getText()+ " "); 
				 }
				 
			 }
			 System.out.println();
		 }
		 
		 } 
	
//	Instructor Course Price 
//	Rahul Shetty Selenium Webdriver with Java Basics + Advanced + Interview Guide 30 
//	Rahul Shetty Learn SQL in Practical + Database Testing from Scratch 25 
//	Rahul Shetty Appium (Selenium) - Mobile Automation Testing from Scratch 30 
//	Rahul Shetty WebSecurity Testing for Beginners-QA knowledge to next level 20 
//	Rahul Shetty Learn JMETER from Scratch - (Performance + Load) Testing Tool 25 
//	Rahul Shetty WebServices / REST API Testing with SoapUI 35 
//	Rahul Shetty QA Expert Course :Software Testing + Bugzilla + SQL + Agile 25 
//	Rahul Shetty Master Selenium Automation in simple Python Language 25 
//	Rahul Shetty Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C 20 
//	Rahul Shetty Write effective QA Resume that will turn to interview call 0 
//
//	
//	
//	
//         
}
