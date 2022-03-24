package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage {

	//inialisation of web element
	public ProductInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//declarartion of Web element
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement headerText;

	//getter method use in testScript
	public WebElement getHeaderText() {
		return headerText;
	}
	
	//business logic
	public String getProductText() {
		return headerText.getText();
	}
}
