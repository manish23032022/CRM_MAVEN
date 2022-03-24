
package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
    private WebElement createProductPage;

	public WebElement getCreateProductPage() {
		return createProductPage;
	}
	
	public void clickOnCreateProduct() {
		createProductPage.click();
	}
}
