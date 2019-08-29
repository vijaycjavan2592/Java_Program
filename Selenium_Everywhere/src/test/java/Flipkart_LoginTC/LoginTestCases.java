package Flipkart_LoginTC;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.demo.Baseclass.Baseclass;


import Flipkart_LoginPage.Flipkart_HomePage;

public class LoginTestCases extends Baseclass{
	//public ExtentTest logger;
	
	@Test
	public void verifyPageTitle() {
	        
        logger = extent.createTest("Verify page title");
		
		Flipkart_HomePage f_home = new Flipkart_HomePage(driver);
		
		f_home.setycloseLoginPopup();
		logger.log(Status.PASS, "Sucessfully close the pop up");
		
		String title = driver.getTitle();
		System.out.println("title is : "+title);
		
		Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		logger.log(Status.PASS, "Page tiltle is correct");
				
	}
	
	
	@Test
	public void loginTC() {
		
		logger = extent.createTest("Verify login functionality");
		
		Flipkart_HomePage f_home = new Flipkart_HomePage(driver);
		
		f_home.setycloseLoginPopup();
		logger.log(Status.PASS, "Sucessfully close the pop up");
		
		f_home.setLoginSignUpClick();
		logger.log(Status.PASS, "Sucessfully click on Login and Sign up menu");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter username
		f_home.setEnterUsername("9765988899");
		logger.log(Status.PASS, "Sucessfully enter username");
		
		//enter password
		f_home.setEnterPassword("Happyman@123");
		logger.log(Status.PASS, "Sucessfully enter password");
		
		//Click Login button
		f_home.setclickLoginButton();
		logger.log(Status.PASS, "Sucessfully click on Login button");
		
		String title = driver.getTitle();
		System.out.println("title is : "+title);
		
		Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		logger.log(Status.PASS, "Page tiltle is correct");
		
		f_home.setInvalidLoginMessage();
		logger.log(Status.PASS, "Invalid username or password");
		
	}
	
	
	

}
