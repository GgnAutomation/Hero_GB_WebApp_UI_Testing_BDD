package GB_Webapp.StepDefinition;

import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceTest extends BaseTest{

//===========================================================================================	
	@When("Click on dealers icon")
	public void click_on_dealers_icon() {
	    sp.click_on_dealers_icon();
	}
	@Then("Verify locate a dealer page text")
	public void verify_locate_a_dealer_page_text() {
	    sp.verify_locate_a_dealer_page_text();
	}
	@Then("Verify category dropdown")
	public void verify_category_dropdown() {
	    sp.verify_category_dropdown();
	}
	@Then("Verify district dropdown")
	public void verify_district_dropdown() {
	   sp.verify_district_dropdown();
	}
	@Then("Verify Search button")
	public void verify_search_button() {
	    sp.verify_search_button();
	}
//===========================================================================================
	@When("Click on service icon")
	public void click_on_service_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
	}
	@Then("Click on Maintenance Tips icon")
	public void click_on_maintenance_tips_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
		Library.click(driver, sp.getMaintenanceTips(), "Maintenance Tips");
	}
	@Then("Click on warranty icon")
	public void click_on_warranty_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
		Library.click(driver, sp.getWarranty(), "Warranty");
	}
	@Then("Click on two wheeler tips icon")
	public void click_on_two_wheeler_tips_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
		Library.click(driver, sp.getTwoWheelerTips(), "Two Wheeler Tips");
	}
	@Then("Click on owners manual icon")
	public void click_on_owners_manual_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
		Library.click(driver, sp.getOwnersManual(), "Owners Manual");
	}
	@Then("Click on hero joy ride icon")
	public void click_on_hero_joy_ride_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
		Library.click(driver, sp.getHeroJoyride(), "Hero Joy ride");
	}
	@Then("Click on Diy videos icon")
	public void click_on_diy_videos_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
		Library.click(driver, sp.getDiyVideos(), "Diy Videos");
	}
	@Then("Click on Hero genuine parts icon")
	public void click_on_hero_genuine_parts_icon() {
		Library.click(driver, loginPg.getService(), "service icon");
		Library.click(driver, sp.getHeroGenuineParts(), "Hero Genuine Parts");
	}
//===========================================================================================
	// zambia country methods
	
	@Then("Click on close icon")
	public void click_on_close_icon() {
	   sp.click_On_Close_Service_icon();
	}
//===========================================================================================	
	@When("Click on service and maintenance tips")
	public void click_on_service_and_maintenance_tips() {
	    sp.click_on_service_and_maintenance_tips();
	}
	@Then("Verify header line three icons")
	public void verify_header_line_three_icons() {
	    sp.verify_header_line_three_icons();
	}
	@Then("Verify service schedule and dropdown five bikes")
	public void verify_service_schedule_and_dropdown_bikes() {
	    sp.verify_service_schedule_and_dropdown_bikes();
	}
	@Then("select any bikes and verify bikes servicing information it should be displayed")
	public void select_any_bikes_and_verify_bikes_servicing_information_it_should_be_displayed() {
	    sp.select_any_bikes_and_verify_bikes_servicing_information_it_should_be_displayed();
	}
//===========================================================================================
	@Given("Click on header two wheeler tips icon")
	public void click_on_header_two_wheeler_tips_icon() {
	   sp.click_on_header_two_wheeler_tips_icon();
	}
	@When("Click on pre ride inspection guide")
	public void click_on_pre_ride_inspection_guide() {
	   sp.click_on_pre_ride_inspection_guide();
	}
	@Then("Verify all inspection guide")
	public void verify_all_inspection_guide() {
	    sp.verify_all_inspection_guide();
	}
//===========================================================================================
	@When("Click on care and maintenance")
	public void click_on_care_and_maintenance() {
	    sp.click_on_care_and_maintenance();
	}
	@When("Click on fuel saving tips")
	public void click_on_fuel_saving_tips() {
	    sp.click_on_fuel_saving_tips();
	}
	@Then("Verify all fuel saving tips")
	public void verify_all_fuel_saving_tips() {
	    sp.verify_all_fuel_saving_tips();
	}
//===========================================================================================
	@Given("Click on hero genuine parts")
	public void click_on_hero_genuine_parts() {
	    sp.click_on_hero_genuine_parts();
	}
	@When("Verify hero genuine parts page information")
	public void verify_hero_genuine_parts_page_information() {
	    sp.verify_hero_genuine_parts_page_information();
	}
//===========================================================================================
	
	
//======================================= Philippines Country code =======================================	
	
	@When("Click on maintenance tips")
	public void click_on_maintenance_tips() {
	    sp.click_on_maintenance_tips();
	}
	@Then("Verify header line four icons")
	public void verify_header_line_four_icons() {
	    sp.verify_header_line_four_icons();
	}
	@Then("Verify service schedule and dropdown three bikes")
	public void verify_service_schedule_and_dropdown_three_bikes() {
	    sp.verify_service_schedule_and_dropdown_three_bikes();
	}

	@Then("Verify all care and maintenance")
	public void verify_all_care_and_maintenance() {
	    sp.verify_all_care_and_maintenance();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
