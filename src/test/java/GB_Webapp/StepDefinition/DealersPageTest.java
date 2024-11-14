package GB_Webapp.StepDefinition;

import GB_Webapp.Utility.BaseTest;
import io.cucumber.java.en.Then;

public class DealersPageTest extends BaseTest {


//=====================================================================================================
	@Then("{string} should be displayed")
	public void should_be_displayed(String string) {
		switch (string) {
	    case "Dealers_name":
	    	dp.delears_name_should_be_displayed();
	        break;
	    case "Dealers_address":
	    	 dp.delears_address_should_be_displayed();
	        break;
	    case "Dealers_time":
	    	  dp.delears_time_should_be_displayed();
	        break;
	    case "Dealers_contact_number":
	    	 dp.delears_contact_number_should_be_displayed();
	        break;
	    case "Dealers_name , Dealers_address , Dealers_time , Dealers_contact_number":
	    	 dp.verifyAllDealerInfoSequentially();
	        break;
	    default:
	        // code block if no case matches
		}			
	}
//=====================================================================================================
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
