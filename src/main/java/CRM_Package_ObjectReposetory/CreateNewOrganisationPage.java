package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;


public class CreateNewOrganisationPage extends WebDriverUtility {
	public CreateNewOrganisationPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
	
	@FindBy(name="accountname")
	private WebElement accountnameTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveCreateOrg;


	public WebElement getSaveCreateOrg() {
		return saveCreateOrg;
	}

	public WebElement getAccountnameTextField() {
		return accountnameTextField;
	}
	@FindBy(name="industry")
	private WebElement dropdownTextField;
	
	public WebElement getDropdownTextField() {
		return dropdownTextField;
	}

	public void enteraccountname(String name) {
		accountnameTextField.sendKeys(name);
	}
	
	public void selectIndustry(String industry)
	{
		select(dropdownTextField, industry);
	}
	
	public void clickOnSaveButton() {
		saveCreateOrg.click();
	}
}