package GB_Webapp.StepDefinition;


import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.Library;
import io.cucumber.java.en.Then;
//@Listeners(GB_Webapp.Utility.TestAllureListener.class)
public class AboutHeroTest extends BaseTest{

// @AboutHero
//============================================================================================
	
//	@When("Click on About Hero icon")
//	public void click_on_about_hero_icon() {
//		Library.threadSleep(500);
//		Library.click(driver, loginPg.getAboutHero(), "About hero icon");
//	}
	@Then("Click on About Hero page")
	public void click_on_about_hero_page() {
	   Library.click(driver, ah.getAboutHeroPage(), "About Hero page");
	}
	@Then("Verify About Hero page in new window and close")
	public void verify_about_hero_page_in_new_window_and_close() {
	   ah.verify_about_hero_page_in_new_window_and_close();
	}
	@Then("Click on About Niloy Bangladesh Ltd icon")
	public void click_on_about_niloy_bangladesh_ltd_icon() {
		Library.click(driver, loginPg.getAboutHero(), "About hero icon");
	   Library.click(driver, ah.getAboutNiloyBangladeshLtd(), "About Niloy Bangladesh Ltd icon");
	}
	@Then("Verify About Niloy Bangladesh Ltd page")
	public void verify_about_niloy_bangladesh_ltd_page() {
	    Library.visible_link(driver, ah.getAboutHnblPageText(), "About Niloy Bangladesh Ltd Page text");
	}
	@Then("Click on Reach us icon")
	public void click_on_reach_us_icon() {
		Library.click(driver, loginPg.getAboutHero(), "About hero icon");
		Library.click(driver, ah.getReachUs(), "Reach us icon");
	}
	@Then("Verify Reach us page")
	public void verify_reach_us_page() {
		Library.visible_link(driver, ah.getReachUsPageText(), "Reach Us Page Text");
	}
	@Then("Click on Become a delear icon")
	public void click_on_become_a_delear_icon() {
		Library.click(driver, loginPg.getAboutHero(), "About hero icon");
		Library.click(driver, ah.getBecomeADealer(), "Become a delear icon");
	}
	@Then("Verify Become a delear page")
	public void verify_become_a_delear_page() {
		Library.visible_link(driver, ah.getBecomeADealerPageText(), "Become A Dealer Page Text");
	}
	@Then("Click on investor icon")
	public void click_on_investor_icon() {
		Library.click(driver, loginPg.getAboutHero(), "About hero icon");
		Library.click(driver, ah.getInvestors(), "Investor icon");
	}
	@Then("Verify investor page")
	public void verify_investor_page() {
	   ah.verify_investor_page();
	}
//=====================================================================================================	
	@Then("Verify right side static image")
	public void verify_right_side_static_image() {
	    ah.Verify_About_hero_right_side_static_image();
	}
	@Then("Click on find a delear")
	public void click_on_find_a_delear() {
	   ah.click_on_find_a_dealer();
	}
	@Then("Click on about hero close icon")
	public void click_on_about_hero_close_icon() {
	   ah.click_on_about_hero_close_icon();
	}
//=====================================================================================================	
	@Then("Fill personal details {string}")
	public void fill_personal_details(String CountryName) {
	    ah.fill_become_a_dealer_page_information(CountryName);
	}
	@Then("Fill contact details {string}")
	public void fill_contact_details(String countryName) {
	    ah.fill_contact_details(countryName);
	}
	@Then("Click on Submit button and verify Thank you pop up")
	public void click_on_submit_button_and_verify_thank_you_pop_up() {
		 ah.click_on_submit_button_and_verify_thank_you_pop_up();
	}

	@Then("Fill existing business details")
	public void fill_existing_business_details() {
		ah.fill_existing_business_details();
	}
	@Then("Fill share holder details")
	public void fill_share_holder_details() {
		ah.fill_share_holder_details();
	}
	
	
//===========================  Philippines code start ================

	@Then("Click on About Terrafirma Motors Corporation icon and verify page")
	public void click_on_AboutTerrafirmaMotorsCorporation_icon() {
		ah.AboutTerrafirmaMotorsCorporation();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
