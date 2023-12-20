package in.amazon.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class Driver extends Tools {
		protected static LandingPage landingPage;
		protected static AllMobileBrands allMobileBrands;
		protected static ApplePhones applePhones;
		protected static BuyPhone buyPhone;
		protected static SignIn signIn;
         	public static void init() {
         		System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
         		driver = new ChromeDriver();
         		landingPage = new LandingPage(driver);
         		 allMobileBrands = new AllMobileBrands(driver);
         		 applePhones = new ApplePhones(driver);
         		 buyPhone = new BuyPhone(driver);
         		 	signIn = new SignIn(driver); 
         		
         	}
}
