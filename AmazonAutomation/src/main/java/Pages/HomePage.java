package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
		@FindBy (xpath = "//input[@role='searchbox']")
		private WebElement search_box ;
		
		@FindBy (xpath = "//input[@role='searchbox']")
		private WebElement search_box1 ;
		
		@FindBy (xpath = "//input[@role='searchbox']")
		private WebElement search_box3 ;
		
		@FindBy (xpath = "//input[@type='submit']")
		private WebElement search_icon ;
		
		@FindBy (xpath = "//a[text()='Fashion']")
		private WebElement fashion ;
		
		@FindBy (xpath = "//a[text()='Bestsellers'][1]")
		private WebElement bestSeller ;
		
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void sendSearch_box(String search_box){
			this.search_box.sendKeys(search_box);
		}
		
		public void sendSearch_box1(String search_box1){
			this.search_box.sendKeys(search_box1);
		}

		public void sendSearch_box2(String search_box2){
			this.search_box.sendKeys(search_box2);
		}
		
		public void sendSearch_box3(String search_box3){
			this.search_box.sendKeys(search_box3);
		}
		
		public void sendfashion(String fashion){
			this.search_box.sendKeys(fashion);
		}
		
		public void sendbestSeller(String bestSeller){
			this.search_box.sendKeys(bestSeller);
		}
		
		public void searchbox(String ONEPLUS, String CLOTHES){
			this.sendSearch_box(ONEPLUS);
			this.sendSearch_box1(CLOTHES);
			this.sendSearch_box2(CLOTHES);
			//this.clickOnsearch_icon1();
		}

		
	

}
