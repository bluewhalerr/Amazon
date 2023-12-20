package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMobileBrands {
	Actions actions;
	WebDriverWait wait;	
	
	@FindBy(linkText = "Mobiles & Accessories")
	private WebElement mobilesAndAccessories;
	
	@FindBy(linkText = "Apple")
	private WebElement apple;
	
	@FindBy(linkText = "Samsung")
	private WebElement samsung;
	
	
	public AllMobileBrands(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void hoverOverMobilesAndAccessories() {		
		actions.moveToElement(mobilesAndAccessories).build().perform();
	}
	
	public void clickApple() {		
		wait.until(ExpectedConditions.visibilityOf(apple));//Just in case wait is needed, then write it like this
		apple.click();
	}
	public void clickSamsung() {		
		wait.until(ExpectedConditions.visibilityOf(samsung));//Just in case wait is needed, then write it like this
		samsung.click();
	}
}
