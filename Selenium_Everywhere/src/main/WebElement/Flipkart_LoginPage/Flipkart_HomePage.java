package Flipkart_LoginPage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_HomePage {
	
	WebDriver driver;
	
	public Flipkart_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);		
	}
	
	//Close the initial login popup
	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement closeLoginPopup;
	
	public void setycloseLoginPopup() {
		if(closeLoginPopup.isDisplayed()) {
			closeLoginPopup.click();
			System.out.println("Password test box is available");
		}		
		else {
			System.out.println("Password test box is not available");
		}
	}
	
	//Click on login & SignUp menu
	@FindBy(xpath = "//a[@href='/account/login?ret=/']")
	WebElement loginSignUpClk;
	
	public void setLoginSignUpClick(){
		
		loginSignUpClk.click();
	}
	
	//Enter username
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement enterUsername;
	
	public void setEnterUsername(String username) {
		if(enterUsername.isEnabled()) {
			enterUsername.sendKeys(username);
		}
		else {
			System.out.println("Username test box is not available");
		}
	}
	
	//Enter password
	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement enterPassword;
	
	public void setEnterPassword(String password) {
		if(enterPassword.isEnabled()) {
			enterPassword.sendKeys(password);
		}
		else {
			System.out.println("Password test box is not available");
		}
	}
	
	//Click on Login button
	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement clickLoginButton;
	
	public void setclickLoginButton() {
		if(clickLoginButton.isDisplayed()) {
			clickLoginButton.click();
		}
		else {
			System.out.println("Login button is not available");
		}
	}
	
	//Invalid username or password message
	@FindBy(xpath = "//span[@class='ZAtlA-']")
	WebElement invalidLoginMessage;
	
	public void setInvalidLoginMessage() {
		try {
		
			System.out.println(invalidLoginMessage.getText());
		}
		catch(NoSuchElementException e) {
			
		}
	}

}
