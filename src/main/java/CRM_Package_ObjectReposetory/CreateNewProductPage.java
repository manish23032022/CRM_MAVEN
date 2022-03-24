package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;


public class CreateNewProductPage extends WebDriverUtility{
	public CreateNewProductPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		public WebElement getProductnameTextField() {
		return productnameTextField;
	}
		
		@FindBy(name="productname")
		private WebElement productnameTextField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveCreateProduct;


		public WebElement getSaveCreateProduct() {
			return saveCreateProduct;
		}

		public void enterproductname(String name) {
		productnameTextField.sendKeys(name);
		}
		
		public void clickOnSaveButton() {
			saveCreateProduct.click();
		}
	

		
}
