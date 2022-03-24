package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
	
	//initialisation
	public ServicesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	   //declaration
		@FindBy(xpath =  "//img[@title='Create Service...']")
	    private WebElement createServiceLink;
		
		//business logic
		public WebElement getCreateServiceLink() {
			return createServiceLink;
		}
		
		public void clickOnCreateServices() {
			createServiceLink.click();
		}
		

}
