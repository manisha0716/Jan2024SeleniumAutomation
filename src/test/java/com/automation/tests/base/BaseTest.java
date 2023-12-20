package com.automation.tests.base;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.tests.utilities.PropertiesUtility;

public class BaseTest {
	protected static WebDriver driver=null;
	static WebDriverWait wait=null;
	
	@BeforeClass
	public void setUpBeforeTestClass() {
		System.out.println("******login_to_Salesforce automation script started***********");
	}
	
	@AfterClass
	public void tearDownAfterTestClass() {
		closeBrowser();
		System.out.println("******login_to_Salesforce automation script ended***********");
	}
	
	@BeforeMethod
	@Parameters("browsername")
	public static void setUpBeforeTestMethod(@Optional("chrome") String browser_name) {
		PropertiesUtility pro=new PropertiesUtility();
		Properties applicationProFile=pro.loadFile("applicationDataProperties");
		String url=applicationProFile.getProperty("url");
		launchBrowser(browser_name);
		maximiseBrowser();
		goToUrl(url);
	}
	@AfterMethod
	public void tearDownAfterTestMethod() {
		//closeBrowser();
		//System.out.println("******login_to_Salesforce automation script ended***********");
	}
	
	public static void launchBrowser(String browserName) {
		switch(browserName) {
		case "firefox":driver=new FirefoxDriver();
						System.out.println("firefox browser launched");
						break;
		case "chrome":driver=new ChromeDriver();
						System.out.println("chrome browser launched");
						break;
		default: System.out.println("you have not entrered the correct browser");
		
			
		}
	}
	
	public static void goToUrl(String url) {
		driver.get(url);
		System.out.println(url+ " is entered");
	}
	
	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("browser window has maximized");
	}
	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static void refreshPage() {
		driver.navigate().refresh();

	}
	
	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		System.out.println("extracted the text from "+ objectName);
		return data;
	}
	
	public static void closeBrowser() {
		driver.close();
		System.out.println("browser closed");
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			clearElement(ele, ObjectName);
			ele.sendKeys(data);
			System.out.println("data is entered in the "+ObjectName);
		} else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	public static void clearElement(WebElement ele,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			System.out.println(ObjectName+" is cleared");
		}
		else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			System.out.println(ObjectName+" is clicked");
			}
			else {
				System.out.println(ObjectName + " is not enabled");
			}
	}
	
	public static void waitForVisibility(WebElement ele,int time,int pollingtime,String objectName) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(time))
		.pollingEvery(Duration.ofSeconds(pollingtime))
		.ignoring(ElementNotInteractableException.class);
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println(objectName +" is waited for visibility using fluent wait");
	}
	
	public static void waitForVisibility(WebElement ele,int time,String objectNam) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	public static void waitForAlertPresent(int time) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		System.out.println("switched to alert");
		return alert;
	}
	
	public static void AcceptAlert(Alert alert) {
		System.out.println("Alert accepted");
		alert.accept();
	}
	
	public static String getAlertText(Alert alert, String objectname) {
		System.out.println("etrcting text in the" + objectname + "alert");
		String text = alert.getText();
		System.out.println("text is extracted from alert box is==" + text);
		return text;
	}
	
	
	public static void selectByIndexData(WebElement ele,int index,String objName) {
		waitForVisibility(ele,index,objName);
		Select selectCity = new Select(ele);
		selectCity.selectByIndex(index);
		System.out.println(objName + "selected with index" + index);
	}

}