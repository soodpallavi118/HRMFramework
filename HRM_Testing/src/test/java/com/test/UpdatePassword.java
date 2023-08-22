package com.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdatePassword extends SetUp {

	@Test
	public void ForgotPassword() throws IOException, InterruptedException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("ForgotPassword_Xpath"))))
				.click(); // Click Forgot Password
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("NewEmail_Xpath"))))
				.sendKeys("TEST"); // Enter new email id
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("ResetPassword_Xpath"))))
				.click(); // Click Reset PAssword Button))
		String text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[contains(@class,'forgot-password-title')]"))).getText();
		System.out.println(text);
	}

}
