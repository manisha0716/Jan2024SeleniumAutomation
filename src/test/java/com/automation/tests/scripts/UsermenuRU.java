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


public class UsermenuRU extends BaseTest {

	
	public static void testcase5() throws InterruptedException {
		
		//String expected="Please enter your password.";
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		System.out.println("login page is displayed for testcase5");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase5");
		
		WebElement usermenu = driver.findElement(By.id("userNav"));
		waitForVisibility(usermenu, 5, "user menu");
		clickElement(usermenu,"user menu");
		System.out.println("home page is displayed with user menu");
		waitForVisibility(usermenu, 5, 2, "user menu");
		
	}
	
	
	public static void testcase6() throws InterruptedException {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		System.out.println("login page is displayed for testcase6");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");
	
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase6");
		
		WebElement usermenu = driver.findElement(By.id("userNav"));
		//waitForVisibility(usermenu, 5, "user menu");
		clickElement(usermenu,"user menu");
		System.out.println("home page is displayed with user menu");
		//waitForVisibility(usermenu, 5, 2, "user menu");
		
		WebElement profilemenu= driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		waitForVisibility(profilemenu, 5, "My Profile link");
		clickElement(profilemenu,"My Profile link");
		System.out.println("My Profile page is displayed");

		
		WebElement editprofile= driver.findElement(By.className("contactInfoLaunch.//editLink"));
		waitForVisibility(editprofile, 20, "edit link");
		clickElement(editprofile,"user menu");
		System.out.println("Edit Profile page is displayed");
		waitForVisibility(editprofile, 5, 2, "edit link");
		
	}
	
	
	public static void testcase7() throws InterruptedException {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		System.out.println("login page is displayed for testcase7");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");
	
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase7");
		
		WebElement usermenu = driver.findElement(By.id("userNav"));
		//waitForVisibility(usermenu, 5, "user menu");
		clickElement(usermenu,"user menu");
		System.out.println("home page is displayed with user menu");
		
		
		WebElement settingmenu= driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		waitForVisibility(settingmenu, 5, "My Settings link");
		clickElement(settingmenu,"My Settings link");
		System.out.println("My Settings page is displayed");
		
		
		WebElement personalmenu= driver.findElement(By.id("PersonalInfo"));
		clickElement(personalmenu,"personal menu");
		System.out.println("personal menu is displayed");
		
		
		WebElement loginhistory= driver.findElement(By.id("LoginHistory_font"));
		waitForVisibility(loginhistory, 5, "Login History link");
		clickElement(loginhistory,"Login History");
		System.out.println("Login History page is displayed");
	
		
		WebElement displaylayout= driver.findElement(By.id("DisplayAndLayout"));
		clickElement(displaylayout,"DisplayAndLayout menu");
		System.out.println("DisplayAndLayout menu is displayed");
		
		
		WebElement customizetabs= driver.findElement(By.id("CustomizeTabs_font"));
		waitForVisibility(customizetabs, 5, "Customize My Tabs link");
		clickElement(customizetabs,"Customize My Tabs");
		System.out.println("Customize My Tabs page is displayed");
		waitForVisibility(customizetabs, 10, 5, "Customize My Tabs");
		
	}
	
	
	public static void testcase8() throws InterruptedException {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		System.out.println("login page is displayed for testcase8");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");
	
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase8");
		
		WebElement usermenu = driver.findElement(By.id("userNav"));
		clickElement(usermenu,"user menu");
		System.out.println("home page is displayed with user menu");
		
		WebElement developermenu= driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		waitForVisibility(developermenu, 5, "Developer Console link");
		clickElement(developermenu,"Developer Console link");
		
	}
	
	@Test
	public static void testcase9() throws InterruptedException {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		System.out.println("login page is displayed for testcase9");
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");
	
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase9");
		
		WebElement usermenu = driver.findElement(By.id("userNav"));
		clickElement(usermenu,"user menu");
		System.out.println("home page is displayed with user menu");
		
		WebElement logoutmenu= driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		waitForVisibility(logoutmenu, 5, "Logout link");
		clickElement(logoutmenu,"Logout link");
		System.out.println("home page is closed");
	}

}
