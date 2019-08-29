package com.demo.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.demo.commonMethods.BaseURL;
import com.demo.commonMethods.ExplictWait;



public class Baseclass {
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlreport;
	public ExtentReports extent;
	public ExtentTest logger;
	
	
	//@Parameters({"browser"})
	//@BeforeMethod
	public void Baseclass1(String browser) {		
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D://JarFile/12/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {

			}

			else if (browser.equalsIgnoreCase("IE")) {

			} 
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.setProperty("webdriver.chrome.driver", "D://JarFile/12/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	 	
		driver.navigate().to(BaseURL.URL());
		
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeTest
	public void startReport() {
		
		htmlreport = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "//test-output//Reportsreportextent30.html");

		extent = new ExtentReports();

		extent.attachReporter(htmlreport);
		
		htmlreport.config().setTheme(Theme.DARK);
		
	}
	@BeforeMethod
	public void browserLaunch() {		

		
		System.setProperty("webdriver.chrome.driver", "D://JarFile//chromedriver_76.0.3809.126/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	 	
		driver.navigate().to(BaseURL.URL());
		
		driver.manage().window().maximize();
		
		
	}

	
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			//logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
			//MarkupHelper is used to display the output in different colors
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,  MarkupHelper.createLabel("Test case skiped is "+result.getName(), ExtentColor.ORANGE));
		}
		
		
		driver.close();
	}
	
	
	@AfterTest
	public void endReport() {
		
		extent.flush();
		
	}

}
