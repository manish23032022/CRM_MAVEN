package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewService {

	public CreateNewService(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="servicename")
	private WebElement servicename;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveServiceName;
	
	public WebElement getSaveServiceName() {
		return saveServiceName;
	}

	public WebElement getServicename() {
		return servicename;
	}
	
	public void createService(String name){
		servicename.sendKeys(name);
		saveServiceName.click();
		}
}
