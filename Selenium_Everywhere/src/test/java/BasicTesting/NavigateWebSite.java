package BasicTesting;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demo.Baseclass.Baseclass;


import HomePage.HomePage_WebElement;
import HomePage.InputForm_WebElement;

public class NavigateWebSite extends Baseclass {
	
	@Test(enabled=false)
	public void verifyPageTitle()  {
		
		
		
		Assert.assertEquals(driver.getTitle(), "Selenium Easy - Table Data search and filter data");
			
		
		HomePage_WebElement home = new HomePage_WebElement(driver);
		InputForm_WebElement inputForm = new InputForm_WebElement(driver);
		
		home.setClickInputForms();
		
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		home.setSelectSubOption();
		
		String message1 = "ABCD";
		inputForm.setEnterMessage(message1);
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		inputForm.setClickShowMessageButton();
		 
		Assert.assertEquals(inputForm.setVerifyMessage(), message1);
		
	}
	
	@Test(enabled=false)
	public void verifyRadioButton()  {
		
		
		
		Assert.assertEquals(driver.getTitle(), "Selenium Easy - Table Data search and filter data");
		
		
		HomePage_WebElement home = new HomePage_WebElement(driver);
		InputForm_WebElement inputForm = new InputForm_WebElement(driver);
		
		//Click on Input Form link
		home.setClickInputForms();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		
				
		//Click on Radio Button Demo link
		home.setClickRadioButtonOption();
		
		//Click on Rasio Button
		String gender = "Female";
		inputForm.SetSelectRadioButton(gender);
		
		//Click on Get Checked Value button
		inputForm.setClickGetCheckedValueButton();
		
		//Verify the message once click on Get Checked Value button
				
		SoftAssert sa = new SoftAssert();
		//sa.assertEquals(inputForm.setVerifyRadioButtonMessage(), "Radio button'"+gender+"' is checked123");
		
		Assert.assertEquals(inputForm.setVerifyRadioButtonMessage(), "Radio button '"+gender+"' is checked");
		inputForm.setVerifyRadioButtonMessage();
		
		sa.assertAll();

	}


}
