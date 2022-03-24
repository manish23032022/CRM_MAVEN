package GenericUtility;


import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * its contains WebDriver specific reusable actions
 * @author Manish
 * @
 */
public class WebDriverUtility {
	
	/**
	 * wait for page to load before identifying any synchronized element in DOM[HTML-Document]
	 * @param driver
	 */
public void waitForPageToLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
/**
 * wait for page load before identifying any as synchronized[java script actions]element in DOM[HTML-Document]
 * @param driver
 */
public void waitForPageToLoadForJSElement(WebDriver driver) {
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
}
/**
 * used to wait for element to be clickable in GUI,& check for specific element for every500 millisecond
 * @param driver
 * @param element
 */
public void waitForElementToBeClickAble(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * used to wait for element to be clickable in GUI,& check for specific element for every 500milliseconds
 * @param driver
 * @param element
 * @param pollingTime
 * @throws InterruptedException
 */

public void waitForElementwithCustomTimeOut(WebDriver driver,WebElement element,int pollingTime) throws InterruptedException {
	FluentWait wait=new FluentWait(driver);
	wait.pollingEvery(pollingTime,TimeUnit.SECONDS);
	wait.wait(20);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * used to Switch to Any Window based on Window Title
 * @param driver
 * @param partialTitleText
 */
public void switchToWindow(WebDriver driver, String partialTitleText) {
	Set<String> set=driver.getWindowHandles();
	Iterator<String> it=set.iterator();
	while(it.hasNext()) {
		String wID=it.next();
		driver.switchTo().window(wID);
		String currentWindowTitle=driver.getTitle();
		if(currentWindowTitle.contains(partialTitleText)) {
			break;
}
}
}
/**
 * used to Switch to Alert Window & Click on OK button
 * @param driver
 */
public void switchToAlertWindowAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
/**
 *  used to Switch to Alert Window & Click on Cancel button
 * @param driver
 */
public void switchToAlertWindowAndCancel(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
/**
 * used to Switch to Frame Window based on index
 * @param driver
 * @param index
 */
public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}
/**
 * used to Switch to frame Window based on id or name attribute
 * @param driver
 * @param id_name_attribute
 */
public void switchToFrame(WebDriver driver,String id_name_attribute) {
	driver.switchTo().frame(id_name_attribute);
}
/**
 * used to select the value from the dropDown based on index
 * @param element
 * @param index
 */
public void select(WebElement element,int index) {
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
/**
 * used to select the value from the dropDown based on value/option available in GUI	
 * @param element
 * @param text
 */
public void select(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
/**
 * used to mouse cursor on specified element
 * @param driver
 * @param element
 */
public void mouseOverOnElement(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
/**
 * used to right click on specified element
 * @param driver
 * @param element
 */
public void rightClickOnElement(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}
/**
 * 
 * @param driver
 * @param javaScript
 */
public void executeJavaScript(WebDriver driver,String javaScript) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeAsyncScript(javaScript, null);
}
public void waitAndClick(WebElement element) throws InterruptedException {
	int count=0;
	while(count<20) {
		try {
			element.click();
			break;
			}catch(Throwable e) {
				Thread.sleep(1000);
				count++;
			}
	}
	
}
/**
 * for secreenshot
 * @param driver
 * @param screenshotName
 * @throws Throwable 
 */
public String takeScreenshot(WebDriver driver,String screenshotName) throws Throwable {
	String dateAndtime=LocalDateTime.now().toString().substring(0, 22).replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+screenshotName+dateAndtime+".png");
	FileUtils.copyFile(src,dest);
	return dest.getAbsolutePath();
}

public void passEnterKey(WebDriver driver) {
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	
}}
















