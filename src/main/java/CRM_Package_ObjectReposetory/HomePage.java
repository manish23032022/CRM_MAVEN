package CRM_Package_ObjectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;


public class HomePage extends WebDriverUtility {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement userIcon;


	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutLink;
	
	public WebElement getUserIcon() {
		return userIcon;
	}

	public WebElement getSignoutLink() {
		return signoutLink;
	}

	public WebElement getOrganisationLink() {
		return organisationLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getProductLink() {
		return productLink;
	}

	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organisationLink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productLink;
	
	@FindBy(linkText="More")
	private WebElement moreLink;
	
	@FindBy(name="Purchase Order")
	private WebElement purchaseOrder;
	
	@FindBy(name="Services")
	private WebElement services;
	
	@FindBy(name="Vendors")
	private WebElement vendorsLink;
	
	@FindBy(name="Campaigns")
	private WebElement campaignLink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contact;

	public WebElement getVendors() {
		return vendorsLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public void setCampaignLink(WebElement campaignLink) {
		this.campaignLink = campaignLink;
	}

	public WebElement getPurchaseOrder() {
		return purchaseOrder;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getOrganisationTextField() {
		return organisationLink;
	}

	public WebElement getContactTextField() {
		return contactLink;
	}

	public WebElement getProductTextField() {
		return productLink;
	}
	public void clickOnOrganiation() {
		organisationLink.click();
	}
	public void clickOnProduct() {
        productLink.click();
	}
	public void clickOnVendor() {
        vendorsLink.click();
	}
	
	public void clickOnContact() {
        contactLink.click();
	}
	public void clickOnService(WebDriver driver) {
		mouseOverOnElement(driver, moreLink);
		services.click();
	}
	
	public void clickOnCampaign(WebDriver driver) {
		mouseOverOnElement(driver, moreLink);
		campaignLink.click();
	}
	
	public WebElement getVendorsLink() {
		return vendorsLink;
	}

	public WebElement getCampaignLink() {
		return campaignLink;
	}

	public void logout(WebDriver driver) throws Throwable {
		waitAndClick(userIcon);
		mouseOverOnElement(driver, userIcon);
		signoutLink.click();
	}
		public void clickOnPurchaseOrder(WebDriver driver) {
			mouseOverOnElement(driver, moreLink);
			purchaseOrder.click();
			
		}
		
}
