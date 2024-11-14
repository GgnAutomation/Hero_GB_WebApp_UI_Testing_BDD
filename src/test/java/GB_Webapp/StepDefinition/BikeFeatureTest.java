package GB_Webapp.StepDefinition;



import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BikeFeatureTest extends BaseTest {


//=====================================================================================================
	@Then("Click on HF Deluxe bike name")
	public void click_on_hf_deluxe_bike_name() {
		bf.click_on_hf_deluxe_bike_name();
	}
	@Then("Click on highlights icon")
	public void click_on_highlights_icon() {
		bf.click_on_highlights_icon();
	}
	@Then("Verify technology button")
	public void verify_technology_button() {
	    bf.verify_technology_button();
	}
	@Then("Verify features button")
	public void verify_features_button() {
	    bf.verify_features_button();
	}
	@Then("Verify safety button")
	public void verify_safety_button() {
	   bf.verify_safety_button();
	}
	@Then("Verify trust button")
	public void verify_trust_button() {
	  bf.verify_trust_button();
	}
	@Then("Click on Colours icon")
	public void click_on_colours_icon() {
	    bf.click_on_colours_icon();
	}
	@Then("Verify bike multiple colours")
	public void verify_bike_multiple_colours() {
		bf.verify_bike_multiple_colours();
	}
	@Then("Click on price icon")
	public void click_on_price_icon() {
	    bf.click_on_price_icon();
	}
	@Then("Verify bike price")
	public void verify_bike_price() {
		bf.verify_bike_price();
	}
	@Then("Click on specifications icon")
	public void click_on_specifications_icon() {
	    bf.click_on_specifications_icon();
	}
	@Then("Verify multiple specificatios")
	public void verify_multiple_specificatios() {
		bf.verify_multiple_specificatios();
	}
	@Then("Click on EMI icon")
	public void click_on_emi_icon() {
	   bf.click_on_emi_icon();
	}
	@Then("Verify all EMI option")
	public void verify_all_emi_option() {
	    bf.verify_all_emi_option();
	}
	@Then("Click on Gallery icon")
	public void click_on_gallery_icon() {
	   bf.click_on_gallery_icon();
	}
//=====================================================================================================		
	@Given("User navigate to back on current page")
	public void user_navigate_to_back_on_current_page() {
		loginPg.user_navigate_to_back_on_current_page();
	}
	@Then("Click on Splender+SE bike name")
	public void click_on_splender_se_bike_name() {
	    bf.click_on_splendor_se_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Splender+ XTEC bike name")
	public void click_on_splender_xtec_bike_name() {
	    bf.click_on_splender_xtec_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Passion XPRO bike name")
	public void click_on_passion_xpro_bike_name() {
	    bf.click_on_passion_xpro_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Passion XPRO XTEC bike name")
	public void click_on_passion_xpro_xtec_bike_name() {
	    bf.click_on_passion_xpro_xtec_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Glamour bike name")
	public void click_on_glamour_bike_name() {
	   bf.click_on_glamour_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Ignitor techno bike name")
	public void click_on_ignitor_techno_bike_name() {
	   bf.click_on_ignitor_techno_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Ignitor XTEC bike name")
	public void click_on_ignitor_xtec_bike_name() {
	    bf.click_on_ignitor_xtec_bike_name();
	}
//=====================================================================================================	
///////// for premium bikes
	@Then("Verify technology button1")
	public void verify_technology_button1() {
	    bf.verify_technology_button1();
	}
	@Then("Verify features button1")
	public void verify_features_button1() {
	    bf.verify_features_button1();
	}
	@Then("Verify safety button1")
	public void verify_safety_button1() {
	   bf.verify_safety_button1();
	}
	@Then("Verify trust button1")
	public void verify_trust_button1() {
	  bf.verify_trust_button1();
	}
	
	
	@Then("Click on Thriller 160R 4V bike name")
	public void click_on_thriller_160r_4v_bike_name() {
	   bf.click_on_thriller_160r_4v_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Hunk {int} bike name")
	public void click_on_hunk_bike_name(Integer int1) {
	    bf.click_on_hunk_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Hunk 150R bike name")
	public void click_on_hunk_150r_bike_name() {
	    bf.click_on_hunk_150r_bike_name();
	}
//=====================================================================================================	
	@Then("Click on Thriller 160R bike name")
	public void click_on_thriller_160r_bike_name() {
	    bf.click_on_thriller_160r_bike_name();
	}
//=============================== Scooter =====================================================================		
	@Then("Click on verify Pleasure Scooter name")
	public void click_on_verify_pleasure_scooter_name() {
	    bf.click_on_verify_pleasure_scooter_name();
	}
//=============================== Scooter =====================================================================		
	@Then("Click on MAESTRO EDGE XTEC Scooter name")
	public void click_on_maestro_edge_xtec_scooter_name() {
	    bf.click_on_maestro_edge_xtec_scooter_name();
	}
//====================================================================================================			
//====================================================================================================	
//====================================================================================================	
//====================================================================================================	
	@Then("Click on {string} icons")
	public void click_on_icons(String string) {
		handlePopup();
		switch (string) {
	    case "commuter":
	    	loginPg.click_on_commuter_icons();
	        break;
	    case "executive":
	    	loginPg.click_on_executive_icons();
	        break;
	    case "Premium":
	    	loginPg.click_on_premium_icons();
	        break;
	    case "Scooter":
	    	loginPg.click_on_scooter_icons();
	        break;
	    default:
	        // code block if no case matches
	}
	}

	@Then("Click on {string} bike name")
	public void click_on_bike_name(String string) {
		Library.threadSleep(3000);
		switch (string) {
	    case "Hf_Deluxe":
	    	Library.waitForVisibilityOf(driver, loginPg.getHfDeluxeBikeName());
			Library.click(driver, loginPg.getHfDeluxeBikeName(), "HF Deluxe");
	        break;
	    case "Splendor+SE":
	    	bf.click_on_splendor_se_bike_name();
	        break;
	    case "Splender+_XTEC":
	    	bf.click_on_splender_xtec_bike_name();
	        break;
	    case "Passion_XPRO":
	    	 bf.click_on_passion_xpro_bike_name();
	        break;
	    case "Passion_XPRO_XTEC":
	    	 bf.click_on_passion_xpro_xtec_bike_name();
	        break;
	    case "Glamour":
	    	 bf.click_on_glamour_bike_name();
	        break;
	    case "Ignitor_techno":
	    	 bf.click_on_ignitor_techno_bike_name();
	        break;
	    case "Ignitor_XTEC":
	    	bf.click_on_ignitor_xtec_bike_name();
	        break;
	    case "Thriller_160R_4V":
	    	bf.click_on_thriller_160r_4v_bike_name();
	        break;
	    case "Hunk_150":
	    	bf.click_on_hunk_bike_name();
	        break;
	    case "Hunk_150R":
	    	bf.click_on_hunk_150r_bike_name();
	        break;
	    case "Thriller_160R":
	    	bf.click_on_thriller_160r_bike_name();
	        break;
	    case "Pleasure":
	    	 bf.click_on_verify_pleasure_scooter_name();
	        break;
	    case "MAESTRO_EDGE_XTEC":
	    	 bf.click_on_maestro_edge_xtec_scooter_name();
	        break;
	    default:
	        // code block if no case matches
	    	break;
	}
	}
	@Then("Click on highlights {string} icon")
	public void click_on_highlights_icon(String string) {
		
		switch (string) {
	    case "Premium":
	    	bf.click_on_highlights_icon();
	    	bf.verify_technology_button1();
	        bf.verify_features_button1();
	        bf.verify_safety_button1();
	        bf.verify_trust_button1();
	        break;
	    case "commuter":
	    	bf.click_on_highlights_icon();
	    	bf.verify_technology_button();
	    	bf.verify_features_button();
	        bf.verify_safety_button();
	    	bf.verify_trust_button();
	        break;
	    default:
	    	bf.click_on_highlights_icon();
	    	bf.verify_technology_button();
	    	bf.verify_features_button();
	        bf.verify_safety_button();
	    	bf.verify_trust_button();
	        break;
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
