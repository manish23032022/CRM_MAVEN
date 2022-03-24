package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewVendorPage {
	public CreateNewVendorPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		public WebElement getVendornameTextField() {
		return vendornameTextField;
	}
		
		@FindBy(name="vendorname")
		private WebElement vendornameTextField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveCreateVendor;


		public WebElement getSaveCreateVendor() {
			return saveCreateVendor;
		}

		public void enterVendorname(String name) {
		vendornameTextField.sendKeys(name);
		}
		
		public void clickOnSaveButton() {
			saveCreateVendor.click();
		}
	


}
