package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Admin_Page extends SetUp{
	
@Test
public void DeleteUser() throws InterruptedException

{
	driver.findElement(By.xpath(prop.getProperty("AdminModule_Xpath"))).click(); // navigated to Admin page 
	Thread.sleep(1000);
	driver.findElement(By.xpath(prop.getProperty("User1_Xpath"))).click(); // selected 1st checkbox of user
	Thread.sleep(8000);
	driver.findElement(By.xpath(prop.getProperty("Delete_Xpath"))).click(); // Clicked on Delete Selected Button 
	Thread.sleep(2500);
	
	driver.findElement(By.xpath(prop.getProperty("CancelDelete_Xpath"))).click(); // Clicked on Cancel,Delete
	Thread.sleep(2500);	
	
	driver.findElement(By.xpath(prop.getProperty("Delete_Xpath"))).click(); // Clicked on Delete Selected Button 
	Thread.sleep(2500);
	
	driver.findElement(By.xpath(prop.getProperty("ConfirmDelete_Xpath"))).click(); //  Clicked on Yes,Delete
	
	
	
	
	}
                     


}
