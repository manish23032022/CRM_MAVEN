package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;


public class CreateNewPurchaseOrderPage extends WebDriverUtility {
	public CreateNewPurchaseOrderPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="subject")
	private WebElement subjectTextField;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement createVendorName;
	
	@FindBy(xpath="//input[@value='Add Service']")
	private WebElement addService;
	
	@FindBy(id="searchIcon2")
		private WebElement service;
	
	@FindBy(css="img[src='themes/images/delete.gif']")
	private WebElement deleteIconImage;
	
	
	public WebElement getDeleteIconImage() {
		return deleteIconImage;
	}

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getCreateVendorName() {
		return createVendorName;
	}

	public WebElement getAddService() {
		return addService;
	}

	public WebElement getService() {
		return service;
	}
	public void clickOnAddService() {
		addService.click();
		service.click();
	}
	public void deleteItem()
	{
		deleteIconImage.click();
	}
}
