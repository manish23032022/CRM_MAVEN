package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Contact...']")
    private WebElement createContactPage;

	public WebElement getCreateContactPage() {
		return createContactPage;
	}
	
	public void clickOnCreateContact() {
		createContactPage.click();
	}

}
