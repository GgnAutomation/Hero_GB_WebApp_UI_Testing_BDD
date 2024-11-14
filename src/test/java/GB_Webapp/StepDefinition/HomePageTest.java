package GB_Webapp.StepDefinition;

import GB_Webapp.Utility.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest extends BaseTest{
	
	
//=======================================================================================================
	@Given("User open {string} website link")
	public void user_open_website_link(String string) {
		switch (string) {
	    case "Bangladesh":
	    	loginPg.user_open_website_link();
	        break;
	    case "Zambia":
	    	 hp.user_open_zambia_website_link();
	        break;
	    case "Philippines":
	    	hp.user_open_Philippines_website_link();
	        break;
	    default:
	        // code block if no case matches
	    	break;
	   }   
	}
	@When("Verify country name should be displayed")
	public void verify_country_name_should_be_displayed() {
	    hp.verify_country_name_should_be_displayed();
	}
//=======================================================================================================	
	@Given("Verify home page text should be displayed")
	public void verify_home_page_text_should_be_displayed() {
	    hp.verify_home_page_text_should_be_displayed();
	}
//=======================================================================================================		
	@Given("Verify home page moto taxi All bikes should be displayed")
	public void verify_home_page_moto_taxi_all_bikes_should_be_displayed() {
	   hp.verify_home_page_moto_taxi_all_bikes_should_be_displayed();
	}
	@When("Verify home page personal All bikes should be displayed")
	public void verify_home_page_personal_all_bikes_should_be_displayed() {
	    hp.verify_home_page_personal_all_bikes_should_be_displayed();
	}
	@Then("Verify home page All scooter should be displayed")
	public void verify_home_page_all_scooter_should_be_displayed() {
	    hp.verify_home_page_all_scooter_should_be_displayed();
	}
//=======================================================================================================		
	@When("Click on homepage {string} icons")
	public void should_be_displayed(String string) {
		switch (string) {
	    case "moto_taxi":
	    		hp.Click_on_mototaxi();
	        break;
	    case "personal":
	    	    hp.Click_on_personal();
	        break;
	    case "scooter":
	    	    hp.Click_on_scooter();
	        break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}

	@Then("Click on {string} bike name and verify expanded card info")
	public void click_on_bike_name_and_verify_expanded_card_info(String string) {
		switch (string) {
	    case "Hunter100":
	    		hp.verifyHunter100Bike();
	        break;
	    case "Hunter125":
	    		hp.verifyHunter125Bike();
	        break;
	    case "Hunter150":
	    		hp.verifyHunter150Bike();
	        break;
	    case "Hunter150TR":
	    		hp.verifyHunter150TRBike();
	        break;
	    case "XPULSE200":
	    		hp.verifyXpulse200Bike();
	        break;
	    case "Destini125":
	    		hp.verifyDestini125Scooter();
	        break;
	    default:
	        // code block if no case matches
	    	break;
		}
	}
//=======================================================================================================	
	@When("Verify promotion banner it should be displayed")
	public void verify_promotion_banner_it_should_be_displayed() {
		hp.verify_promotion_banner_it_should_be_displayed();
	}
//=======================================================================================================	
	@Given("Click on submit button")
	public void click_on_submit_button() {
		hp.click_on_submit_button();
	}
	@When("Verify all mandatory field should be displayed")
	public void verify_all_mandatory_field_should_be_displayed() {
		hp.verify_all_mandatory_field_should_be_displayed();
	}
//=======================================================================================================	
	@Given("Click on submit button1")
	public void click_on_submit_button1() {
		hp.click_on_submit_button1();
	}
	@When("Verify all mandatory field should be displayed1")
	public void verify_all_mandatory_field_should_be_displayed1() {
		hp.verify_all_mandatory_field_should_be_displayed1();
	}	
//=======================================================================================================
	@Given("User able to enter {string}")
	public void user_able_to_enter(String string) {
		switch (string) {
	    case "customer_name":
			hp.user_able_to_enter_customer_name();
			break;
	    case "mobile_number":
			hp.user_able_to_enter_mobile_number();
	        break;
	    case "email_id":
			hp.user_able_to_enter_email_id();
	        break;
	    case "city":
			hp.user_able_to_enter_city();
			break;
	    case "customer_name1":
	    	hp.user_able_to_enter_customer_name1();
			break;
	    case "mobile_number1":
	    	hp.user_able_to_enter_mobile_number1();
	        break;
	    case "email_id1":
	    	hp.user_able_to_enter_email_id1();
	        break;
	    case "city1":
	    	hp.user_able_to_enter_city1();
			break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}
	@Then("Click submit enquiry button")
	public void click_submit_enquiry_button() {
		hp.click_submit_enquiry_button();
	}
	@Then("Verify successfully submit form")
	public void verify_successfully_submit_form() {
		hp.verify_successfully_submit_form();
	}
	@Then("Click submit enquiry button1")
	public void click_submit_enquiry_button1() {
		hp.click_submit_enquiry_button1();
	}
	@Then("Verify successfully submit form1")
	public void verify_successfully_submit_form1() {
		hp.verify_successfully_submit_form1();
	}
//=======================================================================================================	
	@Given("Verify {string} marketing advertisement line text")
	public void verify_1st_marketing_advertisement_line_text(String string) {
		switch (string) {
	    case "1st":
	    	hp.verify_1st_marketing_advertisement_line_text();
	        break;
	    case "2nd":
	    	hp.verify_2nd_marketing_advertisement_line_text();
	        break;
	    default:
	        // code block if no case matches
	    	break;
	   }	    
	}
//=======================================================================================================		
	@Given("Verify {string} icon redirection")
	public void verify_icon_redirection(String string) {
		switch (string) {
	    case "moto_taxi":
		    hp.verify_mototaxi_icon_redirection();
	        break;
	    case "personal":
		    hp.verify_personal_icon_redirection();
	        break;
	    case "scooter":
	 	   hp.verify_scooter_icon_redirection();
	        break;
	    case "reach_us":
	    	hp.verify_reach_us_icon_redirection();
	        break;
	    case "request_a_call":
	    	hp.verify_request_a_call_icon_redirection();
	        break;
	    case "become_a_dealer":
	    	hp.verify_beacome_a_dealer_icon_redirection();
	        break;
	    case "premium":
	    	hp.verify_premium_icon_redirection();
	        break;
	    case "contact_us":
	    	hp.verify_contactus_icon_redirection();
	        break;
	    case "owners_manual":
	    	hp.verify_OwnersManual_icon_redirection();
	        break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}
//=======================================================================================================		
	@When("Verify logo")
	public void verify_logo() {
	    hp.verify_logo();
	}
//=======================================================================================================		
	@When("Click on find a dealer icon")
	public void click_on_find_a_dealer_icon() {
	   hp.click_on_find_a_dealer_icon();
	}
	@Then("Verify dealer page")
	public void verify_dealer_page() {
	    hp.verify_dealer_page();
	}
//=======================================================================================================		
//=======================================================================================================	
//=======================================================================================================		
//=======================================================================================================		
//=======================================================================================================		
//=======================================================================================================		
///=========================// Philippines country start//=========================//	
	
	@When("Verify philippines country name should be displayed")
	public void verify_philippines_country_name_should_be_displayed() {
	    hp.verify_philippines_country_name_should_be_displayed();
	}
//=======================================================================================================	
	@When("Verify home page premium All bikes should be displayed")
	public void verify_home_page_premium_all_bikes_should_be_displayed() {
	    hp.verify_home_page_premium_all_bikes_should_be_displayed();
	}
	@Then("Verify Philippines home page All scooter should be displayed")
	public void verify_Philippines_home_page_all_scooter_should_be_displayed() {
	    hp.verify_Philippines_home_page_all_scooter_should_be_displayed();
	}
//=======================================================================================================	
	@When("Click on Philippines homepage {string} icons")
	public void click_on_Philippines_homepage_icons(String string) {
		switch (string) {
	    case "premium":
	    		hp.Click_on_premium();
	        break;
	    case "scooter":
	    	    hp.Click_on_scooter1();
	        break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}
	@Then("Click on Philippines {string} bike name and verify expanded card info")
	public void click_on_Philippines_bike_name_and_verify_expanded_card_info(String string) {
		switch (string) {
	    case "Xpulse2004V":
	    		hp.verifyxpulse2004vBike();
	        break;
	    case "Hunk160R4V":
	    		hp.verifyHunk160R4vBike();
	        break;
	    case "Xoom110":
	    		hp.verifyXoom110Scooter();
	        break;
	    default:
	        // code block if no case matches
	    	break;
		}
	}
	@Then("select city in dropdown {string}")
	public void select_city_in_dropdown(String string) {
		switch (string) {
	    case "city":
	    		hp.select_city();
	        break;
	    case "city1":
	    		hp.select_city1();
	        break;
	    default:
	        // code block if no case matches
	    	break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
