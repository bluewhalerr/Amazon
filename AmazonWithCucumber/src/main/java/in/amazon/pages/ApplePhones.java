package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhones {
	
	@FindBy(xpath = "(//div[contains(@class,'sg-col-inner')])[4]")
	private WebElement firstPhone;
	
	@FindBy(xpath = "(//div[contains(@class,'a-section a-spacing-base')])[1]")
	private WebElement firstSamsungPhone;

	
	public ApplePhones(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFirstPhone() {
		firstPhone.click();
	}
	public void clickFirstSamsungPhone() {
		firstSamsungPhone.click();
	}

}
