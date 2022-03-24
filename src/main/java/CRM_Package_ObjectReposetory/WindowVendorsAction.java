package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowVendorsAction {
	public WindowVendorsAction(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="search_text")
	private WebElement vendorNameTextField;
	
	@FindBy(name="search")
	private WebElement searchClick;
	
	public void enterVendorName(String vendorName) {
	    vendorNameTextField.sendKeys(vendorName);
	}
	public void searchClick() {
		searchClick.click();
	}
	public WebElement getVendorNameTextField() {
		return vendorNameTextField;
	}

	public WebElement getSearchClick() {
		return searchClick;
	}

	
}
