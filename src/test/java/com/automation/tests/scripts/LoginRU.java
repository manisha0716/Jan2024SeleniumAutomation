package com.automation.tests.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class LoginRU extends BaseTest {
	
	@Test
	public static void testcase1() throws InterruptedException {
		
		//System.out.println("******login_to_Salesforce automation script started***********");
		//String expected="Please enter your password.";
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		System.out.println("login page is displayed for testcase1");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");

		WebElement passwordEle = driver.findElement(By.id("password"));
		clearElement(passwordEle, "password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase1");
		waitForAlertPresent(5);
		
		/*
		 * Alert loginerrorAlert= switchToAlert(); String actual=
		 * getAlertText(loginerrorAlert,"login error alert box");
		 * System.out.println(actual); AcceptAlert(loginerrorAlert);
		 * AssertJUnit.assertEquals(actual, expected,"Fail: testcase failed");
		 */
		
	}
	
	
	public static void testcase2() throws InterruptedException {
		
		//System.out.println("******login_to_Salesforce automation script started***********");
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		System.out.println("login page is displayed for testcase2");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase2");
		waitForAlertPresent(5);
	}
	
	
	
	public static void testcase3() throws InterruptedException {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		System.out.println("login page is displayed for testcase3");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		
		WebElement checkEle = driver.findElement(By.id("rememberUn"));
		clickElement(checkEle,"remember checkbox");
		waitForVisibility(usernameEle, 5, 2, "remember checkbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase3");
		
		
		WebElement usermenu = driver.findElement(By.id("userNav"));
		waitForVisibility(usermenu, 5, "user menu");
		clickElement(usermenu,"user menu");
		System.out.println("home page is displayed with user menu");
		
		
		WebElement logoutLink= driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		clickElement(logoutLink,"logout link");
		System.out.println("home page is closed for testcase3");
		waitForVisibility(logoutLink, 5, 2, "logout link");
		
	}
	
	
	public static void testcase4a() throws InterruptedException {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		System.out.println("login page is displayed for testcase4a");
		

		WebElement passwordEle = driver.findElement(By.id("forgot_password_link"));
		clickElement(passwordEle,"forgot password link");
		
		WebElement usernameEle = driver.findElement(By.id("un"));
		waitForVisibility(usernameEle, 10, "username textbox");
		enterText(usernameEle,username,"username textbox");
		
		WebElement continueEle = driver.findElement(By.id("continue"));
		clickElement(continueEle,"continue button");
		System.out.println("login page is closed for testcase4a");
		waitForVisibility(continueEle, 5, 2, "continue button");
	}
	
	
	public static void testcase4b() throws InterruptedException {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String invalidusername=appProp.getProperty("login.invalid.userid");
		String invalidpassword=appProp.getProperty("login.invalid.password");
		System.out.println("login page is displayed for testcase4b");
		
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,invalidusername,"username textbox");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,invalidpassword,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase4b");
		waitForAlertPresent(5);
	}
		

}
