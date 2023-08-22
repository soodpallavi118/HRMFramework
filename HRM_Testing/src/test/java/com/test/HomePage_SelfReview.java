package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Utility.Helper;

public class HomePage_SelfReview extends SetUp {

	@Test(priority = 1)
	public void EnterRating() throws InterruptedException {
		// p[contains(text(),'Pending Self Review')] / Not working

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("PendingSelfReview_Xpath")))).click(); // Clicked on pending self review
	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("Actions_Xpath")))).click(); // Clicked on Actions Icon
	

		List<WebElement> Rating = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(prop.getProperty("Rating_Xpath"))));

		int minRange = 0;
		int maxRange = 100;
		for (int i = 0; i < Rating.size(); i++) 
		{
			int randomNumber = Helper.generateRandomNumber(minRange, maxRange);
			String randomData = String.valueOf(randomNumber);
			Rating.get(i).sendKeys(randomData);

		}
	

	}

	@Test(priority = 2)
	public void EnterComments() throws InterruptedException {

		List<WebElement> KPI = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(prop.getProperty("KPI_Xpath"))));
		List<WebElement> CommentList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(prop.getProperty("Comment_Xpath"))));

		for (int i = 0; i < CommentList.size(); i++) {

			CommentList.get(i).sendKeys("CommentMade for KPI"); // KPI.get(i).getText()
		}
	

	}
	@Test (priority=3)
	public void clickSave() {
		driver.findElement(By.xpath(prop.getProperty("Save_Xpath"))).click();
		
		//how to capture the Save message
		
	}
	

}
