package GB_Webapp.StepDefinition;

import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.Library;
import io.cucumber.java.en.Then;

public class ZambiaBikeFeatureTest extends BaseTest {

	
//=====================================================================================================	
	
	@Then("Click on header {string} icons and verify bike image")
	public void click_on_icons(String string) {
		switch (string) {
		    case "moto_taxi":
		    	zbf.zambia_click_on_moto_taxi();
		    	zbf.zambia_verify_moto_taxi_right_side_image();
		        break;
		    case "personal":
		    	zbf.zambia_click_on_personal();
		    	zbf.zambia_verify_personal_right_side_image();
		        break;
		    case "scooter":
		    	zbf.zambia_click_on_scooter();
		    	zbf.zambia_verify_scooter_right_side_image();
		        break;
		    case "P_scooter":
		    	zbf.zambia_click_on_scooter();
		    	zbf.PhilippinesScooterRightSideImage();
		        break;
		    case "premium":
		    	zbf.Click_on_Header_premium1();
		    	zbf.PhilippinesPremiumRightSideImage();
	        break;
		    default:
		        // code block if no case matches
		    	break;
		}	
	}
	
	@Then("Click on header {string} bike name")
	public void click_on_bike_name(String string) {
		switch (string) {
		    case "Hunter_100":
		    		zbf.zambia_click_on_hunter_100();
		        break;
		    case "Hunter_125":
		    		zbf.zambia_click_on_hunter_125();
		        break;
		    case "Hunter_150":
		    		zbf.zambia_click_on_hunter_150();
		        break;
		    case "Hunter_150TR":
		    		zbf.zambia_click_on_hunter_150_tr();
		        break;
		    case "XPULSE_200":
		    		zbf.zambia_click_on_xpulse_200();
		        break;
		    case "Destini_125":
		    		zbf.zambia_click_on_destini_125();
		        break;
		    case "Xpulse2004V":
		    		zbf.Click_on_HeaderXpulse2004V_bike();
	    		break;
		    case "Hunk160R4V":
		    		zbf.Click_on_HeaderHunk160R4V_bike();
	    		break;
		    case "Xoom110":
		    		zbf.Click_on_HeaderXoom110_bike();
	    		break;
		    default:
		        // code block if no case matches
		    	break;
		}
	}
	@Then("Verify header bike banner {string}")
	public void Verify_header_bike_banner(String string) {
		switch (string) {
		    case "Hunter_100":
		    		zbf.zambia_verify_Hunter100_BikeBanner();
		        break;
		    case "Hunter_125":
		    		zbf.zambia_verify_Hunter125_BikeBanner();
		        break;
		    case "Hunter_150":
		    		zbf.zambia_verify_Hunter150_BikeBanner();  
		        break;
		    case "Hunter_150TR":
		    		zbf.zambia_verify_Hunter150TR_BikeBanner();   
		        break;
		    case "XPULSE_200":
		    		zbf.zambia_verify_Xpulse200_BikeBanner();
		        break;
		    case "Destini_125":
		    		zbf.zambia_verify_Destini125_BikeBanner();
		        break;
		    case "Xpulse2004V":
	    			zbf.verify_Xpulse2004V_BikeBanner();
	    		break;
		    case "Hunk160R4V":
		    		zbf.verify_Hunk150_BikeBanner();
	    		break;
	    	case "Xoom110":
	    			zbf.verify_Xoom110_ScooterBanner();
	    		break;
		    default:
		        // code block if no case matches
		    	break;
		}
	}
	@Then("Click on header highlights {string} icon")
	public void click_on_highlights_icon(String string) {
			zbf.zambia_click_on_highlights();
		switch (string) {
		    case "Hunter_100":
		    		zbf.zambia_verify_Hunter100_highlights_features();
		        break;
		    case "Hunter_125":
		    		zbf.zambia_verify_Hunter125_highlights_features();
		        break;
		    case "Hunter_150":
		    		zbf.zambia_verify_Hunter125_highlights_features();  // same like Hunter_125
		        break;
		    case "Hunter_150TR":
		    		zbf.zambia_verify_Hunter100_highlights_features();   // same like Hunter_100
		        break;
		    case "XPULSE_200":
		    		zbf.zambia_verify_Xpulse200_highlights_features();
		        break;
		    case "Destini_125":
		    		zbf.zambia_verify_Destini125_highlights_features();
		        break;
		    case "Xpulse2004V":
	    		zbf.verify_Xpulse2004v_highlights_features();
	    		break;
		    case "Hunk160R4V":
	    		zbf.verify_Xpulse2004v_highlights_features();
	    		break;
	    	case "Xoom110":
	    		zbf.verify_Xoom110_highlights_features();
	    		break;
		    default:
		        // code block if no case matches
		    	break;
		}
	}

	@Then("Click on header Colours icon")
	public void click_on_colours_icon() {
	    zbf.zambia_click_on_colours_icon();
	}

	@Then("Verify header bike multiple colours")
	public void verify_bike_multiple_colours() {
		zbf.zambia_verify_bike_multiple_colours();
	}

	@Then("Click on download broucher button")
	public void click_on_download_broucher_button() {
		zbf.zambia_click_on_download_broucher_button();
	}
	@Then("Click on download broucher button1 {string}")
	public void click_on_download_broucher_button1(String string) {
		switch (string) {
	    case "Xoom110":
                 // i want skip only this scooter 
	    	Library.passmsg("Not available download broucher button for our scooter");
	        break;
	    default:
	    	zbf.click_on_download_broucher_button1();
	    	break;
		}		
	}
	
	@Then("Click on header specifications icon")
	public void click_on_specifications_icon() {
	    zbf.zambia_click_on_specifications_icon();
	}
	@Then("Verify header multiple specificatios")
	public void verify_multiple_specificatios() {
		zbf.zambia_verify_multiple_specificatios();
	}
	@Then("Click on find a dealer button")
	public void click_on_find_a_dealer_button() {
		zbf.zambia_click_on_find_a_dealer_button();
	}
	@Then("Click on compare variant button {string}")
	public void click_on_compare_variant_button(String string) {
		switch (string) {
	    case "Hunter_100":
	    		zbf.zambia_click_on_hunter_100_compare_variant_button();
	        break;
	    case "Hunter_125":
	    		zbf.zambia_click_on_hunter_125_compare_variant_button();
	        break;
	    case "Hunter_150":
	    		zbf.zambia_click_on_hunter_150_compare_variant_button();  
	        break;
	    case "Hunter_150TR":
	    		zbf.zambia_click_on_hunter_150_tr_compare_variant_button();   
	        break;
	    case "XPULSE_200":
	    		zbf.zambia_click_on_xpulse_200_compare_variant_button();
	        break;
	    case "Destini_125":
	    		zbf.zambia_click_on_destini_125_compare_variant_button();
	        break;
	    default:
	        // code block if no case matches
	    	break;
		}
		zbf.zambia_handle2ndAnd3rdDropdown();     //  after switch case excute some test case script it is common for all
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
