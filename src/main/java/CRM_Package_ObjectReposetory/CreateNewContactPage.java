package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	public CreateNewContactPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		public WebElement getContactnameTextField() {
		return contactnameTextField;
	}
		
		@FindBy(name="lastname")
		private WebElement contactnameTextField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveCreateContact;


		public WebElement getSaveCreateCampaign() {
			return saveCreateContact;
		}

		public void entercampaignname(String name) {
		contactnameTextField.sendKeys(name);
		saveCreateContact.click();
		}
}
