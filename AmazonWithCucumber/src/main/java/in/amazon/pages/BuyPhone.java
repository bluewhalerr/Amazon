package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPhone {
	WebDriverWait wait;
	
	@FindBy(id="buy-now-button")
	private WebElement buyNowBtn;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//div[contains(@id,'attach-added-to-cart-alert-and-image-area')]/div/span")
	private WebElement addToCartMsg;

	
	public BuyPhone(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}
	
	public void clickBuyNowBtn() {
		buyNowBtn.click();
	}
	public void clickAddtoCartBtn(){
		addToCartBtn.click();
	}
	
	public String getSuccessMsg() {
		wait.until(ExpectedConditions.visibilityOf(addToCartMsg));
		String msg = addToCartMsg.getText();
		return msg;
	}

}
