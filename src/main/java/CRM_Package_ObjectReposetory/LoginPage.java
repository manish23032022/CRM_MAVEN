package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// initialisation of webelement
public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//Declaration of webelement
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	//getter method to it in the test script
	public  WebElement getuserNameTextField() {
		return userNameTextField;
	}
	
		public  WebElement getpasswordTextField() {
			return passwordTextField;
	}
		public  WebElement getloginButton() {
			return loginButton;
	}
		//business logic
		public void login(String username,String password) {
			userNameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
		}
	
}
