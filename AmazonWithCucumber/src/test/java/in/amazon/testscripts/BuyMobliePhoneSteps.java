package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobliePhoneSteps extends Driver {	

	
	
	@Given("a user is on the landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
			
		
	}

	@When("he clicks on Mobiles")
	public void he_clicks_on_mobiles() {
		landingPage.clickMobiles();
	}

	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
	   
	    allMobileBrands.hoverOverMobilesAndAccessories();
	    
	}

	@When("clicks on Apple in the sub-menu")
	public void clicks_on_apple_in_the_sub_menu() {
	    allMobileBrands.clickApple();
	}

	@When("he clicks on first avaliable phone")
	public void he_clicks_on_first_avaliable_phone() {
	  applePhones.clickFirstPhone();
	}

	@When("he switches the focus on the new tab")
	public void he_switches_the_focus_on_the_new_tab() {
	   ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	   driver.switchTo().window(tabs.get(1));
	   
	}

	@When("he clicks on Buy Now button")
	public void he_clicks_on_buy_now_button() {
	   
	    buyPhone.clickBuyNowBtn();
	}

	@Then("he must be able to purchase a mobile phone successfully")
	public void he_must_be_able_to_purchase_a_mobile_phone_successfully() {
	  String expectedTitle = "Amazon Sign In";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.quit();
	}
	@When("he clicks on Samsung in the sub-menu")
	public void he_clicks_on_samsung_in_the_sub_menu() {
	    allMobileBrands.clickSamsung();
	}
	@When("he clicks on first available samsung phone")
	public void he_clicks_on_first_available_samsung_phone() {
	    applePhones.clickFirstSamsungPhone();
	}

	

	@When("he clicks on Add to Cart button")
	public void he_clicks_on_add_to_cart_button() {
	   buyPhone.clickAddtoCartBtn();
	   
	}

	@Then("he must be able to successfully add the phone to cart")
	public void he_must_be_able_to_successfully_add_the_phone_to_cart() {
		  String expectedMsg = "Added to Cart";
		    String actualMsg = buyPhone.getSuccessMsg();
		    Assert.assertEquals(actualMsg, expectedMsg);

	    
	}
}
