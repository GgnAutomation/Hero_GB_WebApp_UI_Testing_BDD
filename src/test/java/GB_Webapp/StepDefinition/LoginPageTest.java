package GB_Webapp.StepDefinition;

import GB_Webapp.Utility.BaseTest;import GB_Webapp.Utility.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginPageTest extends BaseTest{
	
	
//    @AdminLogin

	@When("country name should be displayed")
	public void country_name_should_be_displayed() {
		loginPg.country_name_should_be_displayed();
	}
	@Then("Close browser")
	public void close_browser() {
		loginPg.close_browser();
	}
	@When("Verify all country should be displayed")
	public void verify_all_country_should_be_displayed() {
		loginPg.verify_all_country_should_be_displayed();
	}
//============================== Test 3 ==========================================================	
	@When("Click on banner {string}")
	public void click_on_banner(String string) {
		switch (string) {
	    case "All_banner_icon":
	    	loginPg.verify_all_banner_icon_and_images();
	    	break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}
	@Then("Verify {string} should be displayed")
	public void verify_should_be_displayed(String string) {
		switch (string) {
	    case "Bike_name":
	    	Library.visible_link_gettext(driver, loginPg.getFirstBikeName(), "Bike name");
	    	break;
	    case "Bike_Price":
	    	Library.visible_link_gettext(driver, loginPg.getFirstBikePrice(), "Bike Price");
	    	break;
	    case "HF_Deluxe_bike_name":
	    	Library.visible_link_gettext(driver, loginPg.getHfDeluxeBikeName(), "Bike Name");
	    	break;
	    case "HF_Deluxe_bike_price":
	    	Library.visible_link_gettext(driver, loginPg.getHfDeluxeBikePrice(), "Bike Price");
	    	break;
	    case "Splender+SE_bike_name":
			Library.visible_link_gettext(driver, loginPg.getSplenderPlusSEBikeName(), "Bike Name");
	    	break;
	    case "Splender+SE_bike_price":
			Library.visible_link_gettext(driver, loginPg.getSplenderPlusSEBikePrice(), "Bike Price");
	    	break;
	    case "Splender+XTEC_bike_name":
	    	Library.visible_link_gettext(driver, loginPg.getSplenderPlusXtecBikeName(), "Bike Name");
	    	break;
	    case "Splender+XTEC_bike_price":
			Library.visible_link_gettext(driver, loginPg.getSplenderPlusXtecBikePrice(), "Bike Price");
	    	break;
	    case "Passion_XPRO_bike_name":
	    	Library.visible_link_gettext(driver, loginPg.getPassionXproBikeName(), "Bike Name");
	    	break;
	    case "Passion_XPRO_price":
	    	Library.visible_link_gettext(driver, loginPg.getPassionXproBikePrice(), "Bike Price");
	    	break;
	    case "Passion_XPRO_XTEC_bike_name":
	    	Library.visible_link_gettext(driver, loginPg.getPassionXproXtecBikeName(), "Bike Name");
	    	break;
	    case "Passion_XPRO_XTEC_bike_price":
	    	Library.visible_link_gettext(driver, loginPg.getPassionXproXtecBikePrice(), "Bike Price");
	    	break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}

//============================== Test 3 ==========================================================	
	@Given("{string} icon name should be displayed")
	public void click_on_icons(String string) {
		switch (string) {
	    case "Company_logo":
			Library.visible_link(driver, loginPg.getHeroLogo(), "Hero logo");
			break;
	    case "Product":
	    	Library.visible_link(driver, loginPg.getProducts(), "Product icon");
	        break;
	    case "Dealers":
	    	Library.visible_link(driver, loginPg.getDealers(), "Delears icon");
	        break;
	    case "Service":
	    	Library.visible_link(driver, loginPg.getService(), "service icon");
	    	break;
	    case "Hero_world":
	    	Library.visible_link(driver, loginPg.getHeroWorld(), "Hero world icon");
	    	break;
	    case "About_hero":
	    	Library.visible_link(driver, loginPg.getAboutHero(), "About hero icon");
	    	break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}
//============================== Test 4 ==========================================================	
	@Given("Click on {string}")
	public void click_on(String string) {
		switch (string) {
	    case "Company_logo":
			Library.click(driver, loginPg.getHeroLogo(), "Hero logo");
			break;
	    case "Product":
	    	Library.waitForVisibilityOf(driver, loginPg.getProducts());
			Library.click(driver, loginPg.getProducts(), "Product icon");
			Library.threadSleep(100);
	        break;
	    case "Dealers":
	    	Library.click(driver, loginPg.getDealers(), "Delears icon");
	        break;
	    case "Service":
			Library.click(driver, loginPg.getService(), "service icon");
			break;
	    case "Hero_world":
	    	Library.click(driver, loginPg.getHeroWorld(), "Hero world icon");
	    	break;
	    case "About_hero":
	    	Library.threadSleep(300);
			Library.click(driver, loginPg.getAboutHero(), "About hero icon");
			break;
	    case "New_launch_icons":
	    	Library.click(driver, loginPg.getNewLaunch(), "New Launch icon");
			break;
	    case "commuter_icons":
	    	loginPg.click_on_commuter_icons();
			break;
	    case "executive_icons":
	    	loginPg.click_on_executive_icons();
			break;
	    case "Premium_icons":
	    	loginPg.click_on_premium_icons();
			break;
	    case "Scooter_icons":
	    	loginPg.click_on_scooter_icons();
			break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}
	@When("{string} icon name it should be displayed")
	public void icon_name_it_should_be_displayed(String string) {
		switch (string) {
	    case "New_launch":
			Library.visible_link(driver, loginPg.getNewLaunch(), "New Launch icon");
			break;
	    case "Commuter":
			Library.visible_link(driver, loginPg.getCommuter(), "Commuter icon");
	        break;
	    case "Excutive":
			Library.visible_link(driver, loginPg.getExecutive(), "Executive icon");
	        break;
	    case "premium_world":
			Library.visible_link(driver, loginPg.getPremium(), "Premium icon");
	    	break;
	    case "Scooter":
			Library.visible_link(driver, loginPg.getScooter(), "Scooter icon");
	    	break;
	    case "Find_a_dealer":
			Library.visible_link(driver, loginPg.getFindDealerButton(), "Find a delear Button");
	    	break;
	    case "Find_a_service_center":
			Library.visible_link(driver, loginPg.getFindServiceCentreButton(), "Find a service center Button");
	    	break;
	    default:
	        // code block if no case matches
	    	break;
	   }
	}
//============================== Test 6 ==========================================================			

	@Then("Verify Glamour bike name should be displayed")
	public void verify_glamour_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getGlamourBikeName(), "Bike Name");
	}
	@Then("Verify Glamour bike price should be displayed")
	public void verify_glamour_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getGlamourBikePrice(), "Bike Price");
	}
	@Then("Verify Ignitor techno bike name should be displayed")
	public void verify_ignitor_techno_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getIgnitorTechnoBikeName(), "Bike Name");
	}
	@Then("Verify Ignitor techno bike price should be displayed")
	public void verify_ignitor_techno_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getIgnitorTechnoBikePrice(), "Bike Price");
	}
	@Then("Verify Ignitor Xtec bike name should be displayed")
	public void verify_ignitor_xtec_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getIgnitorXtecBikeName(), "Bike Name");
	}
	@Then("Verify Ignitor Xtec bike price should be displayed")
	public void verify_ignitor_xtec_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getIgnitorXtecBikePrice(), "Bike Price");
	}
//============================== Test 8 ==========================================================		

	@Then("Verify Thriller 160R 4v bike name should be displayed")
	public void verify_thriller_160r_4v_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getThriller160R4VBikeName(), "Bike Name");
	}
	@Then("Verify Thriller 160R 4v bike price should be displayed")
	public void verify_thriller_160r_4v_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getThriller160R4VBikePrice(), "Bike Price");
	}
	@Then("Verify Hunk {int} bike name should be displayed")
	public void verify_hunk_bike_name_should_be_displayed(Integer int1) {
		Library.visible_link_gettext(driver, loginPg.getHUNK150BikeName(), "Bike Name");
	}
	@Then("Verify Hunk {int} bike price should be displayed")
	public void verify_hunk_bike_price_should_be_displayed(Integer int1) {
		Library.visible_link_gettext(driver, loginPg.getHUNK150BikePrice(), "Bike Price");
	}
	@Then("Verify Hunk 150R bike name should be displayed")
	public void verify_hunk_150r_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getHunk150RBikeName(), "Bike Name");
	}
	@Then("Verify Hunk 150R bike price should be displayed")
	public void verify_hunk_150r_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getHunk150RBikePrice(), "Bike Price");
	}
	@Then("Verify Thriller 160R bike name should be displayed")
	public void verify_thriller_160r_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getThriller160RBikeName(), "Bike Name");
	}
	@Then("Verify Thriller 160R bike price should be displayed")
	public void verify_thriller_160r_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getThriller160RBikePrice(), "Bike Price");
	}
//============================== Test 9 ==========================================================		

	@Then("Verify Pleasure bike name should be displayed")
	public void verify_pleasure_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getPleasureBikeName(), "Bike Name");
	}
	@Then("Verify Pleasure bike price should be displayed")
	public void verify_pleasure_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getPleasureBikePrice(), "Bike Price");
	}
	@Then("Verify Maestro edge XTEC bike name should be displayed")
	public void verify_maestro_edge_xtec_bike_name_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getMaestroEdgeXtecBikeName(), "Bike Name");
	}
	@Then("Verify Maestro edge XTEC bike price should be displayed")
	public void verify_maestro_edge_xtec_bike_price_should_be_displayed() {
		Library.visible_link_gettext(driver, loginPg.getMaestroEdgeXtecBikePrice(), "Bike Price");
		Library.click(driver, loginPg.getCloseScootericon(), "Close icon");
	}
//============================== Test 10 ==========================================================			
	@Given("Click on New launch2 icons")
	public void click_on_new_launch2_icons() {
		loginPg.click_on_new_launch2_icons();
	}
	@When("Click on Karizma XMR bike")
	public void click_on_karizma_xmr_bike() {
		Library.scrollwebpage(driver, loginPg.getKarizmaXMR2(), "About Hero");
		Library.click(driver, loginPg.getKarizmaXMR2(), "Karizma XMR bike");
	}
	@Then("Verify request a call back button")
	public void verify_request_a_call_back_button() {
		Library.visible_link(driver, loginPg.getRequestACallBackButton(), "Request A Call Back Button");
	}
	@Then("Verify view specification button")
	public void verify_view_specification_button() {
		Library.visible_link(driver, loginPg.getViewSpecifications(), "View Specification Button");
	}
	@Then("Click on request a call back button")
	public void click_on_request_a_call_back_button() {
		Library.click(driver, loginPg.getRequestACallBackButton(), "Request A Call Back Button");
	}
	@Then("Verify request a call back page and close")
	public void verify_request_a_call_back_page_and_close() {
		Library.visible_link(driver, loginPg.getRequestACallBackText(), "Request A Call Back Text");
	}
	@Then("Click on View specification button")
	public void click_on_view_specification_button() {
		Library.click(driver, loginPg.getViewSpecifications(), "View Specification Button");
	}
	@When("Click on country icon")
	public void click_on_country_icon() {
		hp.click_on_country_icon();
	}

	
	
//======================================= start Philippines country =====================================================================================================	
	@When("Click on Philippines country icon")
	public void click_on_philippines_country_icon() {
		hp.click_on_philippines_country_icon();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
