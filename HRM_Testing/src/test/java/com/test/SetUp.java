package com.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetUp {
	
	
	static WebDriver driver ;
	static Properties prop = new Properties();
	static WebDriverWait wait ;
	 
    @BeforeTest
    public void Initalization() throws InterruptedException, IOException
    {
    	
    	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
    	prop.load(fis);
    	
    	
    	
 //   	JSONParser parser = new JSONParser();
  //      JSONObject credentialsObject = (JSONObject) parser.parse(new FileReader("path/to/credentials.json"));
    	
   	 driver = new ChromeDriver();
   	 driver.get(prop.getProperty("QA_URL"));
   	 driver.manage().window().maximize();
   	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	 Thread.sleep(2000);
    }
    
   
    
   
    
    @AfterTest
    public void CloseBrowser()
    {
   	 driver.quit();
    }


}
