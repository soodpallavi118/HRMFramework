package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LoginPage extends SetUp {
	
	@Test
	
	public void Login() throws InterruptedException
	{
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("UserName_Xpath")))).sendKeys("Admin"); // Enter UserName
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("Password_Xpath")))).sendKeys("admin123"); // Enter Password
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("LoginButton_Xpath")))).click(); // Clicked on Login Button

	
    String LoggedInUserName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("User_Xpath")))).getText();
	
  	System.out.println("Name of Logged In User Is" +LoggedInUserName);
  	Thread.sleep(1000);

	}

}
