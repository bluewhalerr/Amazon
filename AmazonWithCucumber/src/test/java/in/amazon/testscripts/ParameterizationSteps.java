package in.amazon.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizationSteps extends Driver {
	
	
	@Given("user is on the home page of Amazon")
	public void user_is_on_the_home_page_of_amazon() {
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));

	   
	}
	@When("he hovers the pointer over Hello Sign In menu")
	public void he_hovers_the_pointer_over_hello_sign_in_menu() {
		landingPage.hoverOverHelloSignInMenu();
	    
	}
	@When("he clicks on the Sign in button in the sub-menu")
	public void he_clicks_on_the_sign_in_button_in_the_sub_menu() {
	    landingPage.clickSignInBtn();
	}
	@When("he enters an invalid username  {string}")
	public void he_enters_an_invalid_username(String string) {
	    signIn.enterUsername(string);
	}
	@When("he clicks on Continue button")
	public void he_clicks_on_continue_button() {
	    signIn.clickContinueBtn();
	}
	@Then("he must see the error message  {string}")
	public void he_must_see_the_error_message(String string) {
	    String expectedMsg = string;
	    String actualMsg = signIn.getErrMsg();
	    Assert.assertEquals( actualMsg, expectedMsg);
	}


}
	