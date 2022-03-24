package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaignPage {
	public CreateNewCampaignPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		public WebElement getCampaignnameTextField() {
		return campaignnameTextField;
	}
		
		@FindBy(name="campaignname")
		private WebElement campaignnameTextField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveCreateCampaign;


		public WebElement getSaveCreateCampaign() {
			return saveCreateCampaign;
		}

		public void entercampaignname(String name) {
		campaignnameTextField.sendKeys(name);
		saveCreateCampaign.click();
		}
		
	
	


}
