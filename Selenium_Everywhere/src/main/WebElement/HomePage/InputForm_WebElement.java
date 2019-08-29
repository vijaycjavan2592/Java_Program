package HomePage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

public class InputForm_WebElement {
	
	WebDriver driver;
	
	public InputForm_WebElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		wait.withTimeout(2, TimeUnit.SECONDS);
		wait.pollingEvery(20, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
	}
	
	//WebElement from "Simple Demo Form" page
	
	@FindBy(xpath = "//input[@id='user-message']")
	WebElement enterMessage;
	
	public void setEnterMessage(String message) {
		enterMessage.sendKeys(message);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Show Message')]")
	WebElement clickShowMessageButton;

	public void setClickShowMessageButton() {
		clickShowMessageButton.click();
	}
	
	
	@FindBy(xpath = "//span[@id='display']")
	WebElement verifyMessage;

	public String setVerifyMessage() {
		return verifyMessage.getText();
	}

	//--------------------------------------------------------------------------------
	
	//WebElement from "Radio Button Demo" page
	
	//Click on Radio button
	@FindBy(xpath = "//label[@class='radio-inline']")
	List<WebElement> selectRadioButton;
	
	public void SetSelectRadioButton(String menu) {
		for(WebElement ab : selectRadioButton ) {
		if(ab.getText().equals(menu)) {
			ab.click();
		}
		}
	}
	
	//Click on Get Checked Value button
	@FindBy(xpath = "//button[@id='buttoncheck']")
	WebElement clickGetCheckedValueButton;
	
	public void setClickGetCheckedValueButton() {
		clickGetCheckedValueButton.click();
	}
	
	//Verify the message once click on Get Checked Value button
	@FindBy(xpath = "//p[@class='radiobutton']")
	WebElement verifyRadioButtonMessage;
	
	public String setVerifyRadioButtonMessage() {
		return verifyRadioButtonMessage.getText();
	}
	
	
}
