package com.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.Helper;

public class HomePage_AssignLeave extends SetUp {


	@Test (priority=1)
	public void AssignLeave() throws InterruptedException
	{
	   	driver.findElement(By.xpath(prop.getProperty("AssignLeave_Xpath"))).click(); //Click Assign Leave button
		 Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("EmployeeNameField_Xpath"))).sendKeys("Paul");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("EmployeeNameField_Xpath"))).sendKeys(Keys.ARROW_UP); // changing from down to up
		driver.findElement(By.xpath(prop.getProperty("EmployeeNameField_Xpath"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//WebElement FirstSuggestion=driver.findElement(By.xpath(prop.getProperty("Suggestion_Xpath")));
	    //FirstSuggestion.click();
		driver.findElement(By.xpath("//div[contains(text(),'Select')]")).click(); //Click Leave Type Arrow
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Select')]")).sendKeys(Keys.ARROW_DOWN);
	
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(prop.getProperty("FromDate_Xpath"))).click();
		Thread.sleep(2500);
		
		
		Date randomdate=Helper.generateRandomDate(15) ;
		Thread.sleep(1000);
		String formattedDate = Helper.formatDate(randomdate, "yyyy-MM-dd"); // Adjust format as needed
		
		driver.findElement(By.xpath(prop.getProperty("SelectDate_Xpath"))).sendKeys(formattedDate) ;
		Thread.sleep(2000);
		
		
		
	}
	@Test (priority=2) 
	public void Logout()
	{
		driver.findElement(By.xpath("//i[contains(@class,'userdropdown-icon')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
	}
	
	
	
	
	
	
}
