package GB_Webapp.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GB_Webapp.Utility.Log;
import GB_Webapp.Utility.PageClassObject;

/**
 * @author Prathmesh.Mahure
 *
 */

public abstract class BasePage extends PageClassObject {

	public static WebDriver driver;
	

	@SuppressWarnings("static-access")
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
