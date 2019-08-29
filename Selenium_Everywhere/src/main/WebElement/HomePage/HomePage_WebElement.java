package HomePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_WebElement {
	
	WebDriver driver;
	
	public HomePage_WebElement(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(this.driver, this);
	}

	//Click on Input Form Menu
	@FindBy(xpath = "//li[@class='tree-branch']//a[contains(text(),'Input Forms')]")
	private WebElement clickInputForms;
	
	public void setClickInputForms() {
		clickInputForms.click();
	}
	
	//Click on Simple Form Demo option
	@FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[contains(text(),'Simple Form Demo')]")
	WebElement subOption;
	
	public void setSelectSubOption() {
		subOption.click();
	}
	
	
	//Click on Radio Buttons Demo option
	@FindBy(xpath = "//li[@class='tree-branch']//ul//li//a[contains(text(),'Radio Buttons Demo')]")
	WebElement clickRadioButtonOption;
	
	public void setClickRadioButtonOption() {
		clickRadioButtonOption.click();
	}

	
}
