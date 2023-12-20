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


public class CreateAccountRU extends BaseTest {

	@Test
	public static void testcase10() throws InterruptedException {
		
		String expected="Accounts";
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String username=appProp.getProperty("login.valid.userid");
		String password=appProp.getProperty("login.valid.password");
		String accountnamevalue=appProp.getProperty("accountname");
		System.out.println("login page is displayed for testcase10");
		System.out.println("account name: " + accountnamevalue);
		
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,username,"username textbox");

		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,password,"password textbox");
		
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("login page is closed for testcase10");
		
		
		WebElement accountmenu= driver.findElement(By.id("Account_Tab"));
		//waitForVisibility(accountmenu, 5, "Account Tab");
		clickElement(accountmenu,"Account Tab");
		System.out.println("Account page is displayed");
		//waitForVisibility(accountmenu, 5, 2, "Account Tab");
		
		/*
		 * WebElement accountheader= driver.findElement(By.xpath(
		 * "//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1/text()"));
		 * waitForVisibility(accountheader, 10, "account header text"); String
		 * actual=getTextFromElement(accountheader,"account header text");
		 * System.out.println(actual); AssertJUnit.assertEquals(actual,
		 * expected,"Fail: Account testcase failed");
		 */
		
		
		
		  WebElement createmenu= driver.findElement(By.id("createNew"));
		  clickElement(createmenu,"create menu");
		  System.out.println("create menu is displayed");
		  
		  
		  WebElement accountlink= driver.findElement(By.xpath("//*[@id=\"createNewMenu\"]/a[3]"));
		  waitForVisibility(accountlink, 5, "account link");
		  clickElement(accountlink,"account link");
		  System.out.println("new account page is displayed");
		  
		  
		  WebElement accountname= driver.findElement(By.id("acc2"));
		  enterText(accountname,accountnamevalue,"account name textbox");
		  
		  WebElement typemenu= driver.findElement(By.id("acc6")); 
		  clickElement(typemenu,"type menu");
		  System.out.println("type menu is displayed");
		  
		  WebElement typeoption= driver.findElement(By.xpath("//option[contains(text(),'Technology Partner')]")); 
		  clickElement(typeoption,"Technology Partner");
		  System.out.println("Technology Partner is displayed");
		  
		  WebElement customerpriority= driver.findElement(By.id("00NHs00000S6gig"));
		  clickElement(customerpriority,"customer priority");
		  System.out.println("customer priority is displayed");
		  
		  WebElement priorityoption= driver.findElement(By.xpath("//option[contains(text(),'High')]"));
		  clickElement(priorityoption,"High");
		  System.out.println("High is displayed");
		  
		  WebElement savebutton= driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
		  clickElement(savebutton,"save button");
		  System.out.println("new account is added");
			
	}

}
