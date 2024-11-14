package GB_Webapp.StepDefinition;

import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.Library;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeroWorldTest extends BaseTest{

// @HeroWorld
//============================================================================================
	@When("Click on Hero world icon")
	public void click_on_hero_world_icon() {
		Library.click(driver, loginPg.getHeroWorld(), "Hero world icon");
	}
	@Then("Click on Hero News icon")
	public void click_on_hero_news_icon() {
		Library.click(driver, hw.getHeroNews(), "Hero News icon");
	}
	@Then("Verify news")
	public void verify_news() {
	   Library.visible_link(driver, hw.getOtherNewsPageText(), "Verify Hero news page text");
	}
	@Then("Click on Amaar hero icon")
	public void click_on_amaar_hero_icon() {
		hw.click_on_amaar_hero_icon();
	}
	@Then("Verify new window and close")
	public void verify_new_window_and_close() {
	   hw.verify_new_window_and_close();
	}
	@Then("Click on Hero Joyride icon")
	public void click_on_hero_joyride_icon() {
		Library.click(driver, hw.getHeroJoyride(), "Hero Joyride icon");
	}
	@Then("Verify hero joyride page")
	public void verify_hero_joyride_page() {
		 Library.visible_link(driver, hw.getHeroJoyridePageText(), "Verify Hero Joyride page text");
	}
	@Then("CLick on Blogs icon")
	public void c_lick_on_blogs_icon() {
		Library.click(driver, hw.getBlogs(), "Hero News icon");
	}
	@Then("Verify blogs page")
	public void verify_blogs_page() {
		Library.visible_link(driver, hw.getOtherBlogsPageText(), "Verify other blogs page text");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
