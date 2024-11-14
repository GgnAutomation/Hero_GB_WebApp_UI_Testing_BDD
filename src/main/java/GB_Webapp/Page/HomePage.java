package GB_Webapp.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GB_Webapp.Utility.Library;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
//======================================================================================================
	@FindBy(xpath="//div[@class='d-none d-lg-block']//span[contains(text(),'Zambia')]")
	private WebElement ZambiaCountryName;
	
	@FindBy(xpath="//a[normalize-space()='COLLECTIONS']")
	private WebElement Collections;
	
	@FindBy(xpath="//a[normalize-space()='Zambia']")
	private WebElement SelectZambiaCountry;
	
	@FindBy(xpath="//button[@class='btn-close modal-close']")
	private WebElement CloseCountryButton;
	
	@FindBy(xpath="//blockquote[text()='Be the future of ']")
	private WebElement HomePageText;
	
	@FindBy(xpath="//blockquote[text()='With the immense credibility of a global brand and the trust of more than ']")
	private WebElement HomePageText1;
	
	@FindBy(xpath="(//span[normalize-space()='MOTO TAXI'])[2]")
	private WebElement MotoTaxi;
	
			@FindBy(xpath="//div[contains(text(),'Hunter 100')]")
			private WebElement Hunter100;
			
					@FindBy(xpath="//div[contains(@class,'animate__zoomIn')]//img[contains(@alt,'Hunter 100')]")
					private WebElement Hunter100BikeImage;
					
					@FindBy(xpath="//div[normalize-space()='Fuel it, Forget It']")
					private WebElement Hunter100BikeTagline;
					
					@FindBy(xpath="//div[contains(@class,'bike-logo')]//img[contains(@alt,'Hunter 100')]")
					private WebElement Hunter100BikeLogo;
					
					@FindBy(xpath="//blockquote[contains(text(),'Save more with the best in class fuel efficient Hu')]")
					private WebElement Hunter100Bikecontent;
					
					@FindBy(xpath="//div[normalize-space()='Fuel it, Forget It']//parent::div//child::ul")
					private WebElement Hunter100BikeSpecification;
					
					@FindBy(xpath="(//a[normalize-space()='REQUEST A CALL BACK'])[1]")
					private WebElement Hunter100BikeRequestACallBack;
					
					@FindBy(xpath="(//a[@type='button'][normalize-space()='VIEW SPECIFICATIONS'])[1]")
					private WebElement Hunter100BikeViewSpecification;
			
			@FindBy(xpath="//div[contains(text(),'Hunter 125')]")
			private WebElement Hunter125;
			
					@FindBy(xpath="//div[contains(@class,'animate__zoomIn')]//img[contains(@alt,'Hunter 125')]")
					private WebElement Hunter125BikeImage;
					
					@FindBy(xpath="//div[normalize-space()='Any Load, Any Road']")
					private WebElement Hunter125BikeTagline;
					
					@FindBy(xpath="//div[contains(@class,'bike-logo')]//img[contains(@alt,'Hunter 125')]")
					private WebElement Hunter125BikeLogo;
					
					@FindBy(xpath="//blockquote[contains(text(),'Experience the perfect combination of fuel efficie')]")
					private WebElement Hunter125Bikecontent;
					
					@FindBy(xpath="//div[@id='bikeDetailsSection-1']//ul[@class='bike-specification d-flex ']")
					private WebElement Hunter125BikeSpecification;
					
					@FindBy(xpath="(//a[normalize-space()='REQUEST A CALL BACK'])[2]")
					private WebElement Hunter125BikeRequestACallBack;
					
					@FindBy(xpath="(//a[@type='button'][normalize-space()='VIEW SPECIFICATIONS'])[2]")
					private WebElement Hunter125BikeViewSpecification;
			
			@FindBy(xpath="//div[@class='bike-name'][normalize-space()='Hunter 150']")
			private WebElement Hunter150;
			
					@FindBy(xpath="//div[contains(@class,'animate__zoomIn')]//img[@alt='Hunter 150']")
					private WebElement Hunter150BikeImage;
					
					@FindBy(xpath="//div[normalize-space()='Feel the Power']")
					private WebElement Hunter150BikeTagline;
					
					@FindBy(xpath="//div[@id='bikeDetailsSection-2']//div[contains(@class,'bike-detail-content')]//img[contains(@alt,'Hunter 150')]")
					private WebElement Hunter150BikeLogo;
					
					@FindBy(xpath="//blockquote[normalize-space()='Power up your rides with Hunter 150']")
					private WebElement Hunter150Bikecontent;
					
					@FindBy(xpath="//div[normalize-space()='Feel the Power']//parent::div//child::ul")
					private WebElement Hunter150BikeSpecification;
					
					@FindBy(xpath="(//a[normalize-space()='REQUEST A CALL BACK'])[3]")
					private WebElement Hunter150BikeRequestACallBack;
					
					@FindBy(xpath="(//a[@type='button'][normalize-space()='VIEW SPECIFICATIONS'])[3]")
					private WebElement Hunter150BikeViewSpecification;
			
			@FindBy(xpath="//div[contains(text(),'Hunter 150 TR')]")
			private WebElement Hunter150TR;
			
					@FindBy(xpath="//div[contains(@class,'animate__zoomIn')]//img[contains(@alt,'Hunter 150 TR')]")
					private WebElement Hunter150TRBikeImage;
					
					@FindBy(xpath="//div[normalize-space()='All Road Ready']")
					private WebElement Hunter150TRBikeTagline;
					
					@FindBy(xpath="//div[contains(@class,'bike-logo')]//img[contains(@alt,'Hunter 150 TR')]")
					private WebElement Hunter150TRBikeLogo;
					
					@FindBy(xpath="//blockquote[contains(text(),'Conquer any terrain with the excellence of power w')]")
					private WebElement Hunter150TRBikecontent;
					
					@FindBy(xpath="//div[normalize-space()='All Road Ready']//parent::div//child::ul")
					private WebElement Hunter150TRBikeSpecification;
					
					@FindBy(xpath="(//a[normalize-space()='REQUEST A CALL BACK'])[4]")
					private WebElement Hunter150TRBikeRequestACallBack;
					
					@FindBy(xpath="(//a[@type='button'][normalize-space()='VIEW SPECIFICATIONS'])[4]")
					private WebElement Hunter150TRBikeViewSpecification;
	
	@FindBy(xpath="(//span[normalize-space()='PERSONAL'])[2]")
	private WebElement Personal;
	
			@FindBy(xpath="//div[contains(text(),'XPULSE 200')]")
			private WebElement XPULSE200;
			
					@FindBy(xpath="//div[contains(@class,'animate__zoomIn')]//img[contains(@alt,'XPULSE 200')]")
					private WebElement XPULSE200BikeImage;
					
					@FindBy(xpath="//div[normalize-space()='Born for the Toughest Terrains']")
					private WebElement XPULSE200BikeTagline;
					
					@FindBy(xpath="//div[contains(@class,'bike-logo')]//img[contains(@alt,'XPULSE 200')]")
					private WebElement XPULSE200BikeLogo;
					
					@FindBy(xpath="//blockquote[contains(text(),'Be it city streets or the great outdoors, get read')]")
					private WebElement XPULSE200Bikecontent;
					
					@FindBy(xpath="//div[normalize-space()='Born for the Toughest Terrains']//parent::div//child::ul")
					private WebElement XPULSE200BikeSpecification;
					
					@FindBy(xpath="(//a[normalize-space()='REQUEST A CALL BACK'])[5]")
					private WebElement XPULSE200BikeRequestACallBack;
					
					@FindBy(xpath="(//a[@type='button'][normalize-space()='VIEW SPECIFICATIONS'])[5]")
					private WebElement XPULSE200BikeViewSpecification;
	
	@FindBy(xpath="(//span[normalize-space()='SCOOTER'])[2]")
	private WebElement SCOOTER;
	
			@FindBy(xpath="//div[@class='bike-name'][normalize-space()='Destini 125']")
			private WebElement Destini125;
			
					@FindBy(xpath="//div[contains(@class,'animate__zoomIn')]//img[contains(@alt,'Destini 125')]")
					private WebElement Destini125scooterImage;
					
					@FindBy(xpath="//div[normalize-space()='Stay Ahead']")
					private WebElement Destini125scooterTagline;
					
					@FindBy(xpath="//div[contains(@class,'bike-logo')]//img[contains(@alt,'Destini 125')]")
					private WebElement Destini125scooterLogo;
					
					@FindBy(xpath="//blockquote[contains(text(),'Stay ahead in style, technology and comfort with D')]")
					private WebElement Destini125scootercontent;
					
					@FindBy(xpath="//div[normalize-space()='Stay Ahead']//parent::div//child::ul")
					private WebElement Destini125scooterSpecification;
					
					@FindBy(xpath="(//a[normalize-space()='REQUEST A CALL BACK'])[6]")
					private WebElement Destini125scooterRequestACallBack;
					
					@FindBy(xpath="(//a[@type='button'][normalize-space()='VIEW SPECIFICATIONS'])[6]")
					private WebElement Destini125scooterViewSpecification;
			
	@FindBy(xpath="//i[contains(@onclick,\"hideModal('requestCallBackModel')\")]")
	private WebElement CLosePopup;
			
	@FindBy(xpath="//span[normalize-space()='SPECIFICATIONS']")
	private WebElement Specifications;
			
	@FindBy(xpath="//div[normalize-space()='SPECIFICATIONS']")
	private WebElement SpecificationsPageText;
	
	@FindBy(xpath="//h2[normalize-space()='SPECIFICATIONS']")
	private WebElement SpecificationsPageText1;   // "Specifications" use due to personal and scooter bike change xpath
	
	@FindBy(xpath="//img[@alt='offers']")
	private WebElement OffersBanner;
	
	@FindBy(xpath="//h2[@class='text-uppercase']")
	private WebElement LetUsCallYouBackText;
	
	@FindBy(xpath="//div[@class='testride-form-container common-section']//button[@type='submit'][contains(text(),'Submit')]")
	private WebElement SubmitEnquiryButton;
	
	@FindBy(xpath="//button[contains(text(),'Submit enquiry')]")
	private WebElement SubmitEnquiryButton1;
	
	@FindBy(xpath="(//span[normalize-space()='Name Required'])[2]")
	private WebElement NameRequired;
	
	@FindBy(xpath="(//span[normalize-space()='Mobile Number Required'])[2]")
	private WebElement MobileNumberRequired;
	
	@FindBy(xpath="(//p[normalize-space()='City Required'])[2]")
	private WebElement CityRequired;
	
	@FindBy(xpath="(//input[@placeholder='Enter Your Name'])[2]")
	private WebElement EnterCustomerName;
	
	@FindBy(xpath="(//input[@aria-label='Mobile Number'])[2]")
	private WebElement EnterMobileNumber;
	
	@FindBy(xpath="(//input[@placeholder='Enter Email'])[2]")
	private WebElement EnterEmail;
	
	@FindBy(xpath="(//input[@placeholder='Enter your City'])[1]")
	private WebElement EnteryourCity;
	/////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath="(//span[normalize-space()='Name Required'])[1]")
	private WebElement NameRequired1;
	
	@FindBy(xpath="(//span[normalize-space()='Mobile Number Required'])[1]")
	private WebElement MobileNumberRequired1;
	
	@FindBy(xpath="(//p[normalize-space()='City Required'])[1]")
	private WebElement CityRequired1;
	
	@FindBy(xpath="(//input[@placeholder='Enter Your Name'])[1]")
	private WebElement EnterCustomerName1;
	
	@FindBy(xpath="(//input[@aria-label='Mobile Number'])[1]")
	private WebElement EnterMobileNumber1;
	
	@FindBy(xpath="(//input[@placeholder='Enter Email'])[1]")
	private WebElement EnterEmail1;
	
	@FindBy(xpath="//input[@placeholder='Select City']")
	private WebElement EnteryourCity1; 
	
	@FindBy(xpath="(//i[@class='h-icon close-icon'])[3]")
	private WebElement CloseThankYouPopUp1;
	//================================================================================================
	@FindBy(xpath="//div[@class='requestcallback']//i[@class='h-icon close-icon']")
	private WebElement CloseThankYouPopUp;
	
	@FindBy(xpath="//div[@class='largeheading text-uppercase mb-4']")
	private WebElement MarketingText1stline;
	
	@FindBy(xpath="//div[@class='section-sub-text']")
	private WebElement MarketingText2ndline;
	
	@FindBy(xpath="//div[normalize-space()='PRODUCTS']")
	private WebElement FooterProducts;
	
	@FindBy(xpath="//a[normalize-space()='Moto Taxi']")
	private WebElement FooterMotoTaxi;
	
	@FindBy(xpath="//a[normalize-space()='Personal']")
	private WebElement FooterPersonal;
	
	@FindBy(xpath="//a[normalize-space()='Scooter']")
	private WebElement FooterScooter;
	
	@FindBy(xpath="//a[normalize-space()='Reach us']")
	private WebElement FooterReachUs;
	
	@FindBy(xpath="//a[normalize-space()='Request a Call Back']")
	private WebElement FooterRequestACallBack;
	
	@FindBy(xpath="//a[@aria-label='Become a Dealer']")
	private WebElement FooterBeacomeADealer;
	
	@FindBy(xpath="//a[normalize-space()='Contact Us']")
	private WebElement ContactUs;
	
	@FindBy(xpath="//h2[normalize-space()='Become a Dealer']")
	private WebElement BecomeaDealer;
	
	@FindBy(xpath="//img[@aria-label='facebook']")
	private WebElement FacebookLogo;
	
	@FindBy(xpath="//img[@aria-label='insta']")
	private WebElement InstagramLogo;
	
	@FindBy(xpath="//span[text()='Request a Call back']//parent::a")
	private WebElement RequestACallBack;
	
	@FindBy(xpath="//span[text()='Find a Dealer']//parent::a")
	private WebElement FindADealerIcon;
	
	@FindBy(xpath="//h2[normalize-space()='LOCATE A DEALER']")
	private WebElement LocateADealerPageText;
			
//=======================================================================================================		
//=======================================================================================================		
			

	
	@FindBy(xpath="(//div//span[contains(text(),'Philippines')])[2]")
	private WebElement Philippines;
	
	@FindBy(xpath="//a[normalize-space()='Philippines']")
	private WebElement SelectPhilippines;
	
	@FindBy(xpath="(//span[normalize-space()='PREMIUM'])[2]")
	private WebElement HomePagePremium;
	
	@FindBy(xpath="(//div[normalize-space()='XPULSE 200 4V'])[2]")
	private WebElement HomePageXpulse2004V;
	
	@FindBy(xpath="(//div[contains(text(),'HUNK 160R 4V')])[1]")
	private WebElement HomePageHunk160R4V;
		
	@FindBy(xpath="//div[@class='bike-name'][normalize-space()='XOOM 110']")
	private WebElement HomePageXoom110;
	
	@FindBy(xpath="(//img[contains(@alt,'XPULSE 200 4V')])[2]")
	private WebElement Xpulse2004VBikeImage;
	
	@FindBy(xpath="//div[normalize-space()='BORN FOR THE TOUGHEST TERRAINS']")
	private WebElement Xpulse2004VBikeTagline;
	
	@FindBy(xpath="//div[contains(@class,'bike-logo')]//img[contains(@alt,'XPULSE 200 4V')]")
	private WebElement Xpulse2004VBikeLogo;
	
	@FindBy(xpath="//blockquote[contains(text(),'Be it city streets or the great outdoors, get read')]")
	private WebElement Xpulse2004VBikeContaint;
	
	@FindBy(xpath="(//ul[contains(@class,'bike-specification d-flex')])[1]")
	private WebElement Xpulse2004VBikeSpecification;
	
	@FindBy(xpath="(//img[contains(@alt,'HUNK 160R 4V')])[1]")
	private WebElement Hunk160R4VBikeImage;
	
	@FindBy(xpath="//div[@class='bike-logo']//img[@alt='HUNK 160R 4V']")
	private WebElement Hunk160R4VBikeLogo;
	
	@FindBy(xpath="//blockquote[contains(text(),'Get ready to set hearts racing and turn heads your')]")
	private WebElement Hunk160R4VBikeContaint;
	
	@FindBy(xpath="(//ul[contains(@class,'bike-specification d-flex')])[2]")
	private WebElement Hunk160R4VBikeSpecification;
	
	@FindBy(xpath="(//img[@alt='XOOM 110'])[2]")
	private WebElement Xoom110ScooterImage;
	
	@FindBy(xpath="(//div[normalize-space()='EXCITING EXPLORATIONS'])[1]")
	private WebElement Xoom110ScooterTagline;
	
	@FindBy(xpath="(//img[@alt='XOOM 110'])[3]")
	private WebElement Xoom110ScooterLogo;
	
	@FindBy(xpath="//b[contains(text(),'Experience the new Dimension in Urban Riding with ')]")
	private WebElement Xoom110ScooterContent;
	
	@FindBy(xpath="(//ul[contains(@class,'bike-specification d-flex')])[3]")
	private WebElement Xoom110ScooterSpecification;
	
	@FindBy(xpath="(//span[@class='price-val'])[1]")
	private WebElement BikePrice1st;
	
	@FindBy(xpath="(//span[@class='price-val'])[2]")
	private WebElement BikePrice2nd;
	
	@FindBy(xpath="(//span[@class='price-val'])[3]")
	private WebElement BikePrice3rd;
	
	@FindBy(xpath="(//a[text()='Variant Wise Price'])[1]")
	private WebElement VariantWisePrice1;
	
	@FindBy(xpath="(//a[text()='Variant Wise Price'])[2]")
	private WebElement VariantWisePrice2;
	
	@FindBy(xpath="(//a[text()='Variant Wise Price'])[3]")
	private WebElement VariantWisePrice3;
	
	@FindBy(xpath="(//ul[@id='variantTypes'])[1]//parent::div//following-sibling::div//ul//li[1]")
	private WebElement VerifyAllBikeVariantPrice;
	
	@FindBy(xpath="(//div[text()='Enter City Name'])[2]")
	private WebElement city;
	
	@FindBy(xpath="(//div[text()='Enter City Name'])[1]")
	private WebElement city1;
	
	@FindBy(xpath="(//span[normalize-space()='ALBAY'])[1]")
	private WebElement Select1stCity;
	
	@FindBy(xpath="//a[normalize-space()='Premium']")
	private WebElement FooterPremium;
	
	@FindBy(xpath="//a[normalize-space()='Contact us']")
	private WebElement FooterContactUs;
	
	@FindBy(xpath="//a[normalize-space()='Contact Us']")
	private WebElement ContactUsPageText;
	
	@FindBy(xpath="//a[contains(text(),'Owner’s Manual')]")
	private WebElement FooterOwnersManual;
	
	@FindBy(xpath="//a[@role='tab'][contains(text(),'Owner’s Manual')]")
	private WebElement OwnersManualPageText;
	
	
	
	
	
	
	
	
	
//=======================================================================================================	
	public void user_open_zambia_website_link() {
//		driver.get(hero_Gb_Zambia_ProdUrl);
		Library.open_new_Window_and_close_previous_Window(driver, hero_Gb_Zambia_ProdUrl);
		Library.passmsg("Zambia website link successfully opened  ");
	}
	public void verify_country_name_should_be_displayed() {
		Library.visible_link(driver, ZambiaCountryName, "Zambia country name");
	}
	public void click_on_country_icon() {
		Library.click(driver, ZambiaCountryName, "Zambia country name");
		Library.click(driver, SelectZambiaCountry, "Zambia");
		Library.close_new_Window(driver);
		Library.click(driver, CloseCountryButton, "Close country button");
		Library.click(driver, loginPg.getHeroLogo(), "Hero logo");	
	}
//=======================================================================================================		
	public void verify_home_page_text_should_be_displayed() {
		Library.visible_link(driver, HomePageText, "Be the future of Mobility");
		Library.visible_link(driver, HomePageText1, "ALL text description");
	}
//=======================================================================================================		
	public void verify_home_page_moto_taxi_all_bikes_should_be_displayed() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, MotoTaxi, "MotoTaxi");
		Library.visible_link(driver, Hunter100, "Hunter100");
		Library.visible_link(driver, Hunter125, "Hunter125");
		Library.visible_link(driver, Hunter150, "Hunter150");
		Library.visible_link(driver, Hunter150TR, "Hunter150TR");		
	}
	public void verify_home_page_personal_all_bikes_should_be_displayed() {
		Library.click(driver, Personal, "Personal");
		Library.visible_link(driver, XPULSE200, "XPULSE200");
	}
	public void verify_home_page_all_scooter_should_be_displayed() {
		Library.click(driver, SCOOTER, "SCOOTER");
		Library.visible_link(driver, Destini125, "Destini125");
	}
	public void Click_on_mototaxi() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, MotoTaxi, "MotoTaxi");
	}
	public void Click_on_personal() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, Personal, "Personal");
	}
	public void Click_on_scooter() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, SCOOTER, "SCOOTER");
	}
	public void verifyHunter100Bike() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, Hunter100, "Hunter100");
		Library.visible_link(driver, Hunter100BikeImage, "Hunter 100 Bike Image");
		Library.visible_link(driver, Hunter100BikeTagline, "Hunter 100 Bike Tagline");
		Library.visible_link(driver, Hunter100BikeLogo, "Hunter 100 Bike Logo");
		Library.visible_link(driver, Hunter100Bikecontent, "Hunter 100 Bike content");
		Library.visible_link_gettext(driver, Hunter100BikeSpecification, "Hunter 100 Bike Specification");
		Library.visible_link(driver, Hunter100BikeRequestACallBack, "Hunter 100 Bike Request A CallBack");
		Library.visible_link(driver, Hunter100BikeViewSpecification, "Hunter 100 Bike View Specification");		
		Library.click(driver, Hunter100BikeRequestACallBack, "Hunter 100 Bike Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");
		Library.click(driver, Hunter100BikeViewSpecification, "Hunter 100 Bike View Specification");
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText, "bike Specifications Page");
		driver.get(hero_Gb_Zambia_ProdUrl);
	}
	public void verifyHunter125Bike() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, Hunter125, "Hunter125");
		Library.visible_link(driver, Hunter125BikeImage, "Hunter 125 Bike Image");
		Library.visible_link(driver, Hunter125BikeTagline, "Hunter 125 BikeTagline");
		Library.visible_link(driver, Hunter125BikeLogo, "Hunter 125 Bike Logo");
		Library.visible_link(driver, Hunter125Bikecontent, "Hunter 125 Bike content");
		Library.visible_link_gettext(driver, Hunter125BikeSpecification, "Hunter 125 Bike Specification");
		Library.visible_link(driver, Hunter125BikeRequestACallBack, "Hunter 125 Bike Request A CallBack");
		Library.visible_link(driver, Hunter125BikeViewSpecification, "Hunter 125 Bike View Specification");		
		Library.click(driver, Hunter125BikeRequestACallBack, "Hunter 125 Bike Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");
		Library.click(driver, Hunter125BikeViewSpecification, "Hunter 125 Bike View Specification");
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText, "bike Specifications Page");
		driver.get(hero_Gb_Zambia_ProdUrl);	
	}
	public void verifyHunter150Bike() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, Hunter150, "Hunter150");
		Library.visible_link(driver, Hunter150BikeImage, "Hunter 150 Bike Image");
		Library.visible_link(driver, Hunter150BikeTagline, "Hunter 150 BikeTagline");
		Library.visible_link(driver, Hunter150BikeLogo, "Hunter 150 Bike Logo");
		Library.visible_link(driver, Hunter150Bikecontent, "Hunter 150 Bike content");
		Library.visible_link_gettext(driver, Hunter150BikeSpecification, "Hunter 150 Bike Specification");
		Library.visible_link(driver, Hunter150BikeRequestACallBack, "Hunter 150 Bike Request A CallBack");
		Library.visible_link(driver, Hunter150BikeViewSpecification, "Hunter 150 Bike View Specification");		
		Library.click(driver, Hunter150BikeRequestACallBack, "Hunter 150 Bike Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");
		Library.click(driver, Hunter150BikeViewSpecification, "Hunter 150 Bike View Specification");
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText, "bike Specifications Page");
		driver.get(hero_Gb_Zambia_ProdUrl);	
	}
	public void verifyHunter150TRBike() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, Hunter150TR, "Hunter150TR");
		Library.visible_link(driver, Hunter150TRBikeImage, "Hunter 150TR Bike Image");
		Library.visible_link(driver, Hunter150TRBikeTagline, "Hunter 150TR BikeTagline");
		Library.visible_link(driver, Hunter150TRBikeLogo, "Hunter 150TR Bike Logo");
		Library.visible_link(driver, Hunter150TRBikecontent, "Hunter 150TR Bike content");
		Library.visible_link_gettext(driver, Hunter150TRBikeSpecification, "Hunter 150TR Bike Specification");
		Library.visible_link(driver, Hunter150TRBikeRequestACallBack, "Hunter 150TR Bike Request A CallBack");
		Library.visible_link(driver, Hunter150TRBikeViewSpecification, "Hunter 150TR Bike View Specification");		
		Library.click(driver, Hunter150TRBikeRequestACallBack, "Hunter 150TR Bike Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");
		Library.click(driver, Hunter150TRBikeViewSpecification, "Hunter 150TR Bike View Specification");
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText, "bike Specifications Page");
		driver.get(hero_Gb_Zambia_ProdUrl);		
	}
	public void verifyXpulse200Bike() {
		Library.moveToElement(driver, Hunter100);
		Library.click(driver, XPULSE200, "XPULSE200");
		Library.visible_link(driver, XPULSE200BikeImage, "XPULSE200 Bike Image");
		Library.visible_link(driver, XPULSE200BikeTagline, "XPULSE200 BikeTagline");
		Library.visible_link(driver, XPULSE200BikeLogo, "XPULSE200 Bike Logo");
		Library.visible_link(driver, XPULSE200Bikecontent, "XPULSE200 Bike content");
		Library.visible_link_gettext(driver, XPULSE200BikeSpecification, "XPULSE200 Bike Specification");
		Library.visible_link(driver, XPULSE200BikeRequestACallBack, "XPULSE200 Bike Request A CallBack");
		Library.visible_link(driver, XPULSE200BikeViewSpecification, "XPULSE200 Bike View Specification");			
		Library.click(driver, XPULSE200BikeRequestACallBack, "XPULSE200 Bike Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");
		Library.click(driver, XPULSE200BikeViewSpecification, "XPULSE200 Bike View Specification");	
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText1, "bike Specifications Page");
		driver.get(hero_Gb_Zambia_ProdUrl);		
	}
	public void verifyDestini125Scooter() {
		Library.moveToElement(driver, Hunter100);
		 Library.click(driver, Destini125, "Destini125");
		 Library.visible_link(driver, Destini125scooterImage, "Destini125 scooter Image");
		 Library.visible_link(driver, Destini125scooterTagline, "Destini125 scooter Tagline");
		 Library.visible_link(driver, Destini125scooterLogo, "Destini125 scooter Logo");
		 Library.visible_link(driver, Destini125scootercontent, "Destini125 scooter content");
		 Library.visible_link_gettext(driver, Destini125scooterSpecification, "Destini125 scooter Specification");
		 Library.visible_link(driver, Destini125scooterRequestACallBack, "Destini125 scooter Request A CallBack");
		 Library.visible_link(driver, Destini125scooterViewSpecification, "Destini125 scooter View Specification");	
		 Library.click(driver, Destini125scooterRequestACallBack, "Destini125 scooter Request A CallBack");
		 Library.visible_link(driver, CLosePopup, "Request a call back page");
		 Library.click(driver, CLosePopup, "CLosePopup");
		 Library.click(driver, Destini125scooterViewSpecification, "Destini125 scooter View Specification");
			Library.threadSleep(500);	
		 Library.click(driver, Specifications, "Specifications");
		 Library.visible_link(driver, SpecificationsPageText1, "Scooter Specifications Page");
		 driver.get(hero_Gb_Zambia_ProdUrl);		
				
	}
	public void verify_promotion_banner_it_should_be_displayed() {
		Library.moveToElement(driver, LetUsCallYouBackText);
		Library.visible_link(driver, OffersBanner, "Offer Banner");
		
	}
	public void click_on_submit_button() {
		Library.moveToElement(driver, SubmitEnquiryButton);
		Library.assertEquals(driver, LetUsCallYouBackText, "LET US CALL YOU BACK   ");
		Library.click(driver, SubmitEnquiryButton, "Submit Enquiry Button");		
	}
	public void verify_all_mandatory_field_should_be_displayed() {
		Library.visible_link(driver, NameRequired, "Name Required");
		Library.visible_link(driver, MobileNumberRequired, "Mobile Number Required");
//		Library.visible_link(driver, CityRequired, "City Required");
	}
	public void user_able_to_enter_customer_name() {
		Library.moveToElement(driver, EnterCustomerName);
		Library.sendKeys(driver, EnterCustomerName, ZambiaCustomerName, "Enter Customer Name");		
	}
	public void user_able_to_enter_mobile_number() {
		Library.sendKeys(driver, EnterMobileNumber, ZambiaMobileNumber, "Enter Mobile Number");		
	}
	public void user_able_to_enter_email_id() {
		Library.sendKeys(driver, EnterEmail, ZambiaEmail, "Enter Email");		
	}
	public void user_able_to_enter_city() {
		Library.sendKeys(driver, EnteryourCity, ZambiaCity, "Enter City");		
	}
	public void click_submit_enquiry_button() {
		Library.click(driver, SubmitEnquiryButton, "Submit Enquiry Button");			
	}
	public void verify_successfully_submit_form() {
		Library.visible_link(driver, CloseThankYouPopUp, "Thank You PopUp");
		Library.click(driver, CloseThankYouPopUp, "Close Thank You PopUp");		
	}
	public void verify_1st_marketing_advertisement_line_text() {
		Library.moveToElement(driver, FooterProducts);
		Library.visible_link(driver, MarketingText1stline, "Marketing Text 1st line");
		Library.assertEquals(driver, MarketingText1stline, "MANUFACTURING HAPPINESS SINCE 1985");		
	}
	public void verify_2nd_marketing_advertisement_line_text() {
		Library.visible_link(driver, MarketingText2ndline, "Marketing Text 2nd line");
		Library.assertEquals(driver, MarketingText2ndline, "Leading with innovation, Hero is at the forefront of providing mobility to the aspirations of millions around the world.");
	}
	public void verify_mototaxi_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterMotoTaxi, "FooterMotoTaxi");
		Library.visible_link(driver, Specifications, "Moto Taxi Page");
	}
	public void verify_personal_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterPersonal, "Footer Personal");
		Library.visible_link(driver, Specifications, "personal Page");
	}
	public void verify_scooter_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterScooter, "Footer Scooter");
		Library.visible_link(driver, Specifications, "Scooter Page");
	}
	public void verify_reach_us_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterReachUs, "FooterReachUs");
		Library.visible_link(driver, ContactUs, "Reach Us Page");
	}
	public void verify_request_a_call_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterRequestACallBack, "FooterRequestACallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");
	}
	public void verify_beacome_a_dealer_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterBeacomeADealer, "FooterBeacomeADealer");
		Library.visible_link(driver, BecomeaDealer, "Become A Dealer Page");		
	}
	public void verify_logo() {
		Library.moveToElement(driver, FacebookLogo);
		Library.visible_link(driver, FacebookLogo, "Facebook Logo");
		Library.visible_link(driver, InstagramLogo, "Instagram Logo");
	}
	public void click_on_submit_button1() {
		Library.moveToElement(driver, RequestACallBack);
		Library.click(driver, RequestACallBack, "Request A Call Back");
		Library.click(driver, SubmitEnquiryButton1, "Submit Enquiry Button");		
	}
	public void verify_all_mandatory_field_should_be_displayed1() {
		Library.visible_link(driver, NameRequired1, "Name Required");
		Library.visible_link(driver, MobileNumberRequired1, "Mobile Number Required");
//		Library.visible_link(driver, CityRequired1, "City Required");		
	}
	public void user_able_to_enter_customer_name1() {
		Library.sendKeys(driver, EnterCustomerName1, ZambiaCustomerName, "Enter Customer Name");
	}
	public void user_able_to_enter_mobile_number1() {
		Library.sendKeys(driver, EnterMobileNumber1, ZambiaMobileNumber, "Enter Mobile Number");		
	}
	public void user_able_to_enter_email_id1() {
		Library.sendKeys(driver, EnterEmail1, ZambiaEmail, "Enter Email");	
	}
	public void user_able_to_enter_city1() {
		Library.sendKeys(driver, EnteryourCity1, ZambiaCity, "Enter City");		
	}
	public void click_submit_enquiry_button1() {
		Library.click(driver, SubmitEnquiryButton1, "Submit Enquiry Button");	
	}
	public void verify_successfully_submit_form1() {
		Library.visible_link(driver, CloseThankYouPopUp1, "Thank You PopUp");
		Library.click(driver, CloseThankYouPopUp1, "Close Thank You PopUp");		
	}
	public void click_on_find_a_dealer_icon() {
		Library.moveToElement(driver, FindADealerIcon);
		Library.click(driver, FindADealerIcon, "FindADealerIcon");
	}
	public void verify_dealer_page() {
		Library.visible_link(driver, LocateADealerPageText, "LocateADealerPageText");	
		Library.click(driver, loginPg.getHeroLogo(), "Hero Logo");			
	}
	
	
	
///=========================// Philippines country start//=========================//		
///=========================// Philippines country start//=========================//	
	
	public void user_open_Philippines_website_link() {
		Library.open_new_Window_and_close_previous_Window(driver, hero_Gb_Philippines_ProdUrl);
		Library.passmsg("Philippines website link successfully opened  ");		
	}
	public void verify_philippines_country_name_should_be_displayed() {
		Library.visible_link(driver, Philippines, "Philippines country name");		
	}
	public void click_on_philippines_country_icon() {
		Library.click(driver, Philippines, "Philippines country name");
		Library.click(driver, SelectPhilippines, "Philippines");
		Library.close_new_Window(driver);
		Library.click(driver, CloseCountryButton, "Close country button");
		Library.click(driver, loginPg.getHeroLogo(), "Hero logo");	
	}
	public void verify_home_page_premium_all_bikes_should_be_displayed() {
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, HomePagePremium, "HomePage Premium bike ");
		Library.visible_link(driver, HomePageXpulse2004V, "HomePage Xpulse 200 4V");
		Library.visible_link(driver, HomePageHunk160R4V, "HomePage Hunk 160 R 4V");		
	}

	public void verify_Philippines_home_page_all_scooter_should_be_displayed() {
		Library.click(driver, SCOOTER, "SCOOTER");
		Library.visible_link(driver, HomePageXoom110, "HomePage Xoom 110");
	}
	public void Click_on_premium() {
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, HomePagePremium, "Home Page Premium");
	}
	public void Click_on_scooter1() {
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, SCOOTER, "SCOOTER");
	}
	public void verifyxpulse2004vBike() {
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, HomePageXpulse2004V, "HomePage Xpulse 200 4V");		
		Library.visible_link(driver, Xpulse2004VBikeImage, "Xpulse 200 4V Bike Image");
		Library.visible_link(driver, Xpulse2004VBikeTagline, "Xpulse 200 4V Bike Tagline");		
		Library.visible_link(driver, Xpulse2004VBikeLogo, "Xpulse 200 4V Bike Logo");
		Library.visible_link(driver, Xpulse2004VBikeContaint, "Xpulse 200 4V Bike content");		
		Library.visible_link_gettext(driver, Xpulse2004VBikeSpecification, "Xpulse 200 4V Bike Specification");		
		Library.visible_link(driver, Hunter100BikeRequestACallBack, "Xpulse 200 4V Bike Request A CallBack");
		Library.visible_link(driver, Hunter100BikeViewSpecification, "Xpulse 200 4V Bike View Specification");
		Library.visible_link_gettext(driver, BikePrice1st, "Xpulse 200 4V Bike price");
		String BikeCardPrice =BikePrice1st.getText();
		Library.click(driver, Hunter100BikeRequestACallBack, "Xpulse 200 4V Bike Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");		
		Library.click(driver, VariantWisePrice1, "Variant Wise Price");
		Library.moveToElement(driver, VerifyAllBikeVariantPrice);
		String AllBikeVariantPrice =VerifyAllBikeVariantPrice.getText();
		Library.passmsg("Bike card Price : "+BikeCardPrice);
		Library.passmsg("Bike Main page Price : "+AllBikeVariantPrice);
		Library.assertEquals(driver, BikeCardPrice, AllBikeVariantPrice);
		driver.get(hero_Gb_Philippines_ProdUrl);
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, HomePageXpulse2004V, "HomePage Xpulse 200 4V");		
		Library.click(driver, Hunter100BikeViewSpecification, "Xpulse 200 4V Bike View Specification");
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText1, "bike Specifications Page");
		
	}
	public void verifyHunk160R4vBike() {
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, HomePageHunk160R4V, "HomePage Hunk 160 R 4V");
		Library.visible_link(driver, Hunk160R4VBikeImage, "Hunk 160 R 4V Bike Image");
		Library.visible_link(driver, Hunk160R4VBikeLogo, "Hunk 160 R 4V Bike Logo");		
		Library.visible_link(driver, Hunk160R4VBikeContaint, "Hunk 160 R 4V Bike content");
		Library.visible_link_gettext(driver, Hunk160R4VBikeSpecification, "Hunk 160 R 4V Bike Specification");
		Library.visible_link(driver, Hunter125BikeRequestACallBack, "Hunk 160 R 4V Bike Request A CallBack");
		Library.visible_link(driver, Hunter125BikeViewSpecification, "Hunk 160 R 4V Bike View Specification");	
		Library.visible_link_gettext(driver, BikePrice2nd, "Hunk 160 R 4V Bike price");	
		String BikeCardPrice =BikePrice2nd.getText();
		Library.click(driver, Hunter125BikeRequestACallBack, "Hunk 160 R 4V Bike Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");		
		Library.click(driver, VariantWisePrice2, "Variant Wise Price");
		Library.moveToElement(driver, VerifyAllBikeVariantPrice);
		String AllBikeVariantPrice =VerifyAllBikeVariantPrice.getText();
		Library.passmsg("Bike card Price : "+BikeCardPrice);
		Library.passmsg("Bike Main page Price : "+AllBikeVariantPrice);
		Library.assertEquals(driver, BikeCardPrice, AllBikeVariantPrice);
		driver.get(hero_Gb_Philippines_ProdUrl);
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, HomePageHunk160R4V, "HomePage Hunk 160 R 4V");		
		Library.click(driver, Hunter125BikeViewSpecification, "Hunk 160 R 4V Bike View Specification");
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText1, "bike Specifications Page");
		driver.get(hero_Gb_Philippines_ProdUrl);	
		
	}
	public void verifyXoom110Scooter() {

		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, HomePageXoom110, "HomePage Xoom 110");
		Library.visible_link(driver, Xoom110ScooterImage, "Xoom 110 Scooter Image");
		Library.visible_link(driver, Xoom110ScooterTagline, "Xoom 110 Scooter Tagline");
		Library.visible_link(driver, Xoom110ScooterLogo, "Xoom 110 Scooter Logo");
		Library.visible_link(driver, Xoom110ScooterContent, "Xoom 110 Scooter content");
		Library.visible_link_gettext(driver, Xoom110ScooterSpecification, "Xoom 110 Scooter Specification");
		Library.visible_link(driver, Hunter150BikeRequestACallBack, "Xoom 110 Scooter Request A CallBack");
		Library.visible_link(driver, Hunter150BikeViewSpecification, "Xoom 110 Scooter View Specification");
		Library.visible_link_gettext(driver, BikePrice3rd, "Xoom 110 Scooter price");			
		String BikeCardPrice =BikePrice3rd.getText();
		Library.click(driver, Hunter150BikeRequestACallBack, "Xoom 110 Scooter Request A CallBack");
		Library.visible_link(driver, CLosePopup, "Request a call back page");
		Library.click(driver, CLosePopup, "CLosePopup");		
		Library.click(driver, VariantWisePrice3, "Variant Wise Price");
		Library.moveToElement(driver, VerifyAllBikeVariantPrice);
		String AllBikeVariantPrice =VerifyAllBikeVariantPrice.getText();
		Library.passmsg("Bike card Price : "+BikeCardPrice);
		Library.passmsg("Bike Main page Price : "+AllBikeVariantPrice);
		Library.assertEquals(driver, BikeCardPrice, AllBikeVariantPrice);
		driver.get(hero_Gb_Philippines_ProdUrl);
		Library.moveToElement(driver, HomePageXpulse2004V);
		Library.click(driver, SCOOTER, "SCOOTER");
		Library.click(driver, HomePageXoom110, "HomePage Xoom 110");
		Library.threadSleep(500);
		Library.moveToElement(driver, Hunter150BikeViewSpecification);
		Library.click(driver, Hunter150BikeViewSpecification, "Xoom 110 Scooter View Specification");
		Library.threadSleep(500);
		Library.click(driver, Specifications, "Specifications");
		Library.visible_link(driver, SpecificationsPageText1, "bike Specifications Page");
		driver.get(hero_Gb_Philippines_ProdUrl);
		
	}
	public void select_city() {
		Library.click(driver, city, "City");
		Library.click(driver, Select1stCity, "Select city");
	}
	public void select_city1() {
		Library.click(driver, city1, "City");
		Library.click(driver, Select1stCity, "Select city");		
	}
	public void verify_premium_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterPremium, "Footer Premium");
		Library.visible_link(driver, Specifications, "Premium Page");
	}
	public void verify_contactus_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterContactUs, "Footer Contact Us");
		Library.visible_link(driver, ContactUsPageText, "Contact Us Page");
	}
	public void verify_OwnersManual_icon_redirection() {
		Library.moveToElement(driver, FooterScooter);
		Library.click(driver, FooterOwnersManual, "Footer Owners Manual");
		Library.visible_link(driver, OwnersManualPageText, "Owners Manual Page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
