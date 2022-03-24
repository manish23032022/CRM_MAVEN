package GenericUtility;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import CRM_Package_ObjectReposetory.HomePage;
import CRM_Package_ObjectReposetory.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public WebDriver driver=null;
	public ExcelUtility eu=new ExcelUtility();
	public FileUtility fu=new FileUtility();
	public JavaUtility ju=new JavaUtility();
	public WebDriverUtility wdu=new WebDriverUtility();
	public static WebDriver sDriver;

	@BeforeSuite (groups={"SmokeTest"})
	public void bs() {
		System.out.println("Connection to the datebase has done");
	}

	@BeforeTest	(groups={"SmokeTest"})
	public void bt() {
		System.out.println("Excute script in parallel mode");
	}

	//@Parameters("browser")
	@BeforeClass	(groups={"SmokeTest"})
	public void bc() throws Throwable {
		String browserName=fu.getPropertyKeyValue("browser");
		String url=fu.getPropertyKeyValue("url");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			//}else if(browserName.equals("edge")){
			//	WebDriverManager.edgedriver().setup();
			//	driver=new EdgeDriver();
		}else {
			throw new Exception("browser is not compatible");
		}
		sDriver=driver;
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@BeforeMethod	(groups={"SmokeTest"})
	public void bm() throws Throwable {
		String userName=fu.getPropertyKeyValue("username");
		String password=fu.getPropertyKeyValue("password");

		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@AfterMethod	(groups={"SmokeTest"})
	public void am() throws Throwable {
		HomePage hp=new HomePage(driver);
		hp.logout(driver);  
	}
	@AfterClass	(groups={"SmokeTest"})
	public void ac() {
		driver.quit();
	}
	@AfterTest 	(groups={"SmokeTest"})
	public void at() {
		System.out.println("close parallel mode excution");
	}
	@AfterSuite	(groups={"SmokeTest"})
	public void as() {
		System.out.println("close database connection");

	}
}








