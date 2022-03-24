package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage {
	public VendorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Vendor...']")
    private WebElement createVendorPage;

	public WebElement getCreateVendorPage() {
		return createVendorPage;
	}
	
	public void clickOnCreateVendor() {
		createVendorPage.click();
	}

}
