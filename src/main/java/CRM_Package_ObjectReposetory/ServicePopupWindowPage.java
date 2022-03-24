package CRM_Package_ObjectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;


public class ServicePopupWindowPage {
	
	public ServicePopupWindowPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	WebDriverUtility wdu = new WebDriverUtility();
	
	public void window(WebDriver driver)
	{
		wdu.switchToWindow(driver,"Vendors&action");
	}
	@FindBy(id="search_txt")
	private WebElement searchFieldText;
	
	@FindBy(name="search")
	private WebElement search;
	
	@FindBy(name="search_field")
	private WebElement listBox;

	public WebDriverUtility getWdu() {
		return wdu;
	}

	public WebElement getSearchFieldText() {
		return searchFieldText;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getServiceNo() {
		return listBox;
	}
	
	
	public void selectServiceFromPopup(WebDriver driver, String serviceName)
	{
		searchFieldText.sendKeys(serviceName);
		wdu.select(listBox, "Service Name");
		search.click();
		driver.findElement(By.linkText(serviceName)).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}





