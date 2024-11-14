package GB_Webapp.Page;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GB_Webapp.Utility.Library;

public class ZambiaBikeFeaturePage extends BasePage{

	public ZambiaBikeFeaturePage(WebDriver driver) {
		super(driver);
	}	
	
//=================================================================================================================	
	@FindBy(xpath="(//span[normalize-space()='MOTO TAXI'])[1]")
	private WebElement MotoTaxi;
	
		@FindBy(xpath="//div[normalize-space()='HUNTER 100']")
		private WebElement Hunter100;
		
		@FindBy(xpath="//div[normalize-space()='HUNTER 125']")
		private WebElement Hunter125;
		
		@FindBy(xpath="//div[normalize-space()='HUNTER 150']")
		private WebElement Hunter150;
		
		@FindBy(xpath="//div[normalize-space()='HUNTER 150 TR']")
		private WebElement Hunter150TR;
	
	@FindBy(xpath="(//span[normalize-space()='PERSONAL'])[1]")
	private WebElement Personal;
	
		@FindBy(xpath="//div[contains(text(),'Xpulse 200')]")
		private WebElement Xpulse200;
	
	@FindBy(xpath="(//span[normalize-space()='SCOOTER'])[1]")
	private WebElement Scooter;
	
		@FindBy(xpath="(//div[contains(text(),'Destini 125')])[1]")
		private WebElement Destini125;
	
	@FindBy(xpath="//span[normalize-space()='HIGHLIGHTS']")
	private WebElement Highlights;
	
		@FindBy(xpath="//h2[normalize-space()='TECHNOLOGY']")
		private WebElement Technology;
	
		@FindBy(xpath="//h2[normalize-space()='STYLE']")
		private WebElement Style;
	
		@FindBy(xpath="//h2[normalize-space()='FEATURES']")
		private WebElement Features;
	
		@FindBy(xpath="//h2[normalize-space()='COMFORT']")
		private WebElement Comfort;
	
		@FindBy(xpath="//h2[normalize-space()='SAFETY']")
		private WebElement Safety;
		
		@FindBy(xpath="//h3[normalize-space()='FEATURES']")
		private WebElement Xpulse200Features;
		
		@FindBy(xpath="//h3[normalize-space()='PERFORMANCE']")
		private WebElement Xpulse200Performance;
		
		@FindBy(xpath="//h3[normalize-space()='TECHNOLOGY']")
		private WebElement Xpulse200Technology;
		
		@FindBy(xpath="//h3[normalize-space()='SAFETY']")
		private WebElement Xpulse200Safety;
		
		@FindBy(xpath="//h3[normalize-space()='STYLE']")
		private WebElement Destini125Style;
		
		@FindBy(xpath="//h3[normalize-space()='CONVENIENCE']")
		private WebElement Xoom110Convinience;
		
		@FindBy(xpath="//h3[normalize-space()='SAFETY']")
		private WebElement Destini125Safety;
		
		@FindBy(xpath="//h3[normalize-space()='TECHNOLOGY']")
		private WebElement Destini125Technology;
		
		@FindBy(xpath="//h3[normalize-space()='FEATURES']")
		private WebElement Destini125Features;
	
	@FindBy(xpath="//span[normalize-space()='COLOURS']")
	private WebElement Colours;
		//Colors
		@FindBy(xpath="//span[@class='thumb-text mob-hide' or @class='thumb-text']")
		private List<WebElement> BikeColours;
		
		@FindBy(xpath="//img[@alt='rotate 360 left arrow']")
		private WebElement LeftArrow;
		
		@FindBy(xpath="//img[@alt='rotate 360 right arrow']")
		private WebElement RightArrow;
	
	@FindBy(xpath="//span[normalize-space()='SPECIFICATIONS']")
	private WebElement Specifications;
		//Specifications
		@FindBy(xpath="//div[@id='v-pills-tab']//child::a | //span[@class='mob-hide']")
		private List<WebElement> AllSpecificationTab;
	
	@FindBy(xpath="(//img[@alt='mm right bike'])[1]")
	private WebElement MotoTaxiRightSideImage;
	
	@FindBy(xpath="(//img[@alt='mm right bike'])[2]")
	private WebElement PersonalRightSideImage;
	
	@FindBy(xpath="(//img[@alt='mm right bike'])[3]")
	private WebElement ScooterRightSideImage;
	
	@FindBy(xpath="//a[normalize-space()='DOWNLOAD BROCHURE']")
	private WebElement DownloadBrochureButton;
	
	@FindBy(xpath="//a[normalize-space()='FIND A DEALER']")
	private WebElement FindADealerButton;
	
	@FindBy(xpath="//h2[normalize-space()='LOCATE A DEALER']")
	private WebElement LocateADealerText;
	
	@FindBy(xpath="(//img[@alt='Hunter 100'])[1]")
	private WebElement Hunter100BikeBanner;
	
	@FindBy(xpath="(//img[contains(@alt,'Hunter 125')])[1]")
	private WebElement Hunter125BikeBanner;
	
	@FindBy(xpath="(//img[contains(@alt,'Hunter 150')])[1]")
	private WebElement Hunter150BikeBanner;
	
	@FindBy(xpath="(//img[contains(@alt,'Hunter 150 TR')])[1]")
	private WebElement Hunter150TRBikeBanner;
	
	@FindBy(xpath="(//img[@alt='Hero Xpulse 200 Carb'])[1]")
	private WebElement Xpulse200BikeBanner;
	
	@FindBy(xpath="(//img[@alt='Hero Maestro Edge Xtec'])[1]")
	private WebElement Destini125ScooterBanner;
	
	@FindBy(xpath="(//img[@alt='Hero Xpulse 200 4V'])[1]")
	private WebElement Xpulse2004VBikeBanner;
	
	@FindBy(xpath="(//img[@alt='Hero Hunk 150'])[1]")
	private WebElement Hunk150BikeBanner;
	
	@FindBy(xpath="(//img[@alt='Xoom 110'])[1]")
	private WebElement Xoom110ScooterBanner;
	
	@FindBy(xpath="//a[normalize-space()='COMPARE VARIANTS']")
	private WebElement CompareVariants;
	
	@FindBy(xpath="(//a[@type='button'][normalize-space()='COMPARE VARIANTS'])[7]")
	private WebElement CompareVariants1;
	
	@FindBy(xpath="(//a[@type='button'][normalize-space()='COMPARE VARIANTS'])[6]")
	private WebElement CompareVariants2;
	
	@FindBy(xpath="//div[contains(text(),'Hunter 100')]")
	private WebElement Hunter100Dropdown;
	
	@FindBy(xpath="//div[contains(text(),'Hunter 125')]")
	private WebElement Hunter125Dropdown;
	
	@FindBy(xpath="//div[contains(text(),'Hunter 150')]")
	private WebElement Hunter150Dropdown;
	
	@FindBy(xpath="//div[contains(text(),'Hunter 150 TR')]")
	private WebElement Hunter150TRDropdown;
	
	@FindBy(xpath="//div[contains(text(),'XPulse 200')]")
	private WebElement Xpulse200Dropdown;
	
	@FindBy(xpath="//div[contains(text(),'XPulse 200 CARB')]")
	private WebElement Xpulse200CarbDropdown;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner'][normalize-space()='Destini 125']")
	private WebElement Destini125Dropdown;
	
	@FindBy(xpath="(//div[text()='Add Vehicle'])[1]")
	private WebElement secondDropdown;
	
	@FindBy(xpath="//div[@id='bs-select-2']//ul[@role='presentation']//li[1]")
	private WebElement AutoSelect2ndDropdown;
	
	@FindBy(xpath="(//div[text()='Add Vehicle'])[1]")
	private WebElement ThirdDropdown;
	
	@FindBy(xpath="(//ul[@role='presentation']//li[1])[2]")
	private WebElement AutoSelect3rdDropdown;
	
	@FindBy(xpath="//div[@id='imageContainer1']")
	private WebElement PhilippinesScooterRightSideImage;
	
	@FindBy(xpath="//div[@id='imageContainer0']")
	private WebElement PhilippinesPremiumRightSideImage;
	
	@FindBy(xpath="(//span[normalize-space()='PREMIUM'])[1]")
	private WebElement HomePagePremium1;
	
	@FindBy(xpath="(//div[normalize-space()='XPULSE 200 4V'])[1]")
	private WebElement HeaderXpulse2004V;
	
	@FindBy(xpath="//div[normalize-space()='Hunk 160R 4V']")
	private WebElement HeaderHunk160R4V;
		
	@FindBy(xpath="(//div[normalize-space()='XOOM 110'])[1]")
	private WebElement HeaderXoom110;
//============================================================================================================
//============================================================================================================
	public void zambia_click_on_moto_taxi() {
		Library.click(driver, MotoTaxi, "Moto Taxi");//zambia_
	}
	public void zambia_click_on_personal() {
		Library.click(driver, Personal, "Personal");
	}
	public void zambia_click_on_scooter() {
		Library.click(driver, Scooter, "Scooter");
	}
	public void zambia_click_on_hunter_100() {
		Library.click(driver, Hunter100, "Hunter 100");
	}
	public void zambia_click_on_hunter_125() {
		Library.click(driver, Hunter125, "Hunter 125");
	}
	public void zambia_click_on_hunter_150() {
		Library.click(driver, Hunter150, "Hunter 150");
	}
	public void zambia_click_on_hunter_150_tr() {
		Library.click(driver, Hunter150TR, "Hunter 150 TR");
	}
	public void zambia_click_on_xpulse_200() {
		Library.click(driver, Xpulse200, "Xpulse 200");
	}
	public void zambia_click_on_destini_125() {
		Library.click(driver, Destini125, "Destini 125");
	}
	public void zambia_click_on_highlights() {
		Library.click(driver, Highlights, "Highlights");
	}
	public void zambia_click_on_colours() {
		Library.click(driver, Colours, "Colours");
	}
	public void zambia_click_on_specifications() {
		Library.click(driver, Specifications, "Specifications");
	}
	public void zambia_verify_moto_taxi_right_side_image() {
		Library.visible_link(driver, MotoTaxiRightSideImage, "Moto Taxi Right Side Image");
	}
	public void zambia_verify_personal_right_side_image() {
		Library.visible_link(driver, PersonalRightSideImage, "Personal Right Side Image");
	}
	public void zambia_verify_scooter_right_side_image() {
		Library.visible_link(driver, ScooterRightSideImage, "Scooter Right Side Image");
	}
	public void zambia_verify_Hunter100_highlights_features() {
		Library.visible_link(driver, Technology, "Technology");
		Library.visible_link(driver, Features, "Features");
		Library.visible_link(driver, Comfort, "Comfort");
		Library.visible_link(driver, Safety, "Safety");
	}
	public void zambia_verify_Hunter125_highlights_features() {
		Library.visible_link(driver, Style, "Style");
		Library.visible_link(driver, Features, "Features");
		Library.visible_link(driver, Comfort, "Comfort");
		Library.visible_link(driver, Safety, "Safety");
	}
	public void zambia_verify_Xpulse200_highlights_features() {
		Library.visible_link(driver, Xpulse200Features, "Features");
		Library.visible_link(driver, Xpulse200Performance, "Performance");
		Library.visible_link(driver, Xpulse200Technology, "Technology");
		Library.visible_link(driver, Xpulse200Safety, "Safety");
	}
	public void zambia_verify_Destini125_highlights_features() {
		Library.visible_link(driver, Destini125Style, "Style");
		Library.visible_link(driver, Destini125Safety, "Safety");
		Library.visible_link(driver, Destini125Technology, "Technology");
		Library.visible_link(driver, Destini125Features, "Features");
	}
	public void zambia_click_on_colours_icon() {
	    Library.click(driver, Colours, "Colours");
	    Library.visible_link(driver, LeftArrow, "360 degree LeftArrow");
	    Library.visible_link(driver, RightArrow, "360 degree RightArrow");
	}
	public void zambia_verify_bike_multiple_colours() {
		Library.threadSleep(1000);
		for (WebElement element : BikeColours) {
			Library.waitForVisibilityOf(driver, element);
			Library.visible_link_gettext(driver, element, "Colours");
		}
	}
	public void zambia_click_on_specifications_icon() {
	    Library.click(driver, Specifications, "Specifications");
	}
	public void zambia_verify_multiple_specificatios() {
		for (WebElement element : AllSpecificationTab) {
			Library.visible_link_gettext(driver, element, "Specification");
		}
		for (WebElement element : AllSpecificationTab) {
			Library.click(driver, element, element.getText());
		}
	}
	public void zambia_click_on_download_broucher_button() {
		Library.click(driver, DownloadBrochureButton, "Download Brochure Button");
		Library.threadSleep(1000);
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    try {
	    	System.out.println("Total number od tabs = "+tabs.size());
	    driver.switchTo().window(tabs.get(1));
	    Library.threadSleep(1000);
	    Library.passmsg(driver.getCurrentUrl());
	    driver.close();
	    Library.passmsg("New tab successfully open and close");
	    }catch(Exception e) {
	    	Library.failmsg("Download broucher is not open in new tab");
	    	 driver.switchTo().window(tabs.get(0));		
	    }
	    driver.switchTo().window(tabs.get(0));		
	}
	public void zambia_click_on_find_a_dealer_button() {
		Library.visible_link(driver, FindADealerButton, "Find A Dealer Button");
//		Library.click(driver, FindADealerButton, "Find A Dealer Button");
//		Library.visible_link(driver, LocateADealerText, "Locate A Dealer Text");
		
	}
	public void zambia_verify_Hunter100_BikeBanner() {
		Library.visible_link(driver, Hunter100BikeBanner, "Hunter 100 Bike Banner");
	}
	public void zambia_verify_Hunter125_BikeBanner() {
		Library.visible_link(driver, Hunter125BikeBanner, "Hunter 125 Bike Banner");
	}
	public void zambia_verify_Hunter150_BikeBanner() {
		Library.visible_link(driver, Hunter150BikeBanner, "Hunter 150 Bike Banner");
	}
	public void zambia_verify_Hunter150TR_BikeBanner() {
		Library.visible_link(driver, Hunter150TRBikeBanner, "Hunter 150 TR Bike Banner");
	}
	public void zambia_verify_Xpulse200_BikeBanner() {
		Library.visible_link(driver, Xpulse200BikeBanner, "Xpulse 200 Bike Banner");
	}
	public void zambia_verify_Destini125_BikeBanner() {
		Library.visible_link(driver, Destini125ScooterBanner, "Destini 125 Scooter Banner");
	}
	public void zambia_click_on_hunter_100_compare_variant_button() {
		Library.click(driver, CompareVariants, "CompareVariants");
		Library.visible_link(driver, Hunter100Dropdown, "Hunter 100 bike 1st Dropdown");
	}
	public void zambia_click_on_hunter_125_compare_variant_button() {
		Library.click(driver, CompareVariants, "CompareVariants");
		Library.visible_link(driver, Hunter125Dropdown, "Hunter 125 bike 1st Dropdown");
	}
	public void zambia_click_on_hunter_150_compare_variant_button() {
		Library.click(driver, CompareVariants, "CompareVariants");
		Library.visible_link(driver, Hunter150Dropdown, "Hunter 150 bike 1st Dropdown");
	}
	public void zambia_click_on_hunter_150_tr_compare_variant_button() {
		Library.click(driver, CompareVariants, "CompareVariants");
		Library.visible_link(driver, Hunter150TRDropdown, "Hunter 150TR bike 1st Dropdown");
	}
	public void zambia_click_on_xpulse_200_compare_variant_button() {
		Library.click(driver, CompareVariants1, "CompareVariants");
		Library.visible_link(driver, Xpulse200Dropdown, "Xpulse 200 bike 1st Dropdown");	
	}
	public void zambia_click_on_destini_125_compare_variant_button() {
		Library.click(driver, CompareVariants2, "CompareVariants");
		Library.visible_link(driver, Destini125Dropdown, "Destini 125 bike 1st Dropdown");
	}
	public void zambia_handle2ndAnd3rdDropdown() {
		Library.click(driver, secondDropdown, "second Dropdown");
		Library.click(driver, AutoSelect2ndDropdown, "Auto Select 2nd Dropdown");
		Library.threadSleep(500);
		Library.click(driver, ThirdDropdown, "Third Dropdown");
		Library.click(driver, AutoSelect3rdDropdown, "Auto Select 3rd Dropdown");
	}
	
//===============    Philippines country start code ==================//	
	public void PhilippinesScooterRightSideImage() {
		Library.visible_link(driver, PhilippinesScooterRightSideImage, "Scooter Right Side Image");
	}
	public void PhilippinesPremiumRightSideImage() {
		Library.visible_link(driver, PhilippinesPremiumRightSideImage, "Premium Right Side Image");
	}
	public void Click_on_Header_premium1() {
		Library.click(driver, HomePagePremium1, "Premium");
	}
	public void Click_on_HeaderXpulse2004V_bike() {
		Library.click(driver, HeaderXpulse2004V, "Xpulse 200 4V");
	}
	public void Click_on_HeaderHunk160R4V_bike() {
		Library.click(driver, HeaderHunk160R4V, "Hunk160 R 4V");
	}
	public void Click_on_HeaderXoom110_bike() {
		Library.click(driver, HeaderXoom110, "Xoom 110");
	}
	public void verify_Xpulse2004V_BikeBanner() {
		Library.visible_link(driver, Xpulse2004VBikeBanner, "Xpulse 200 4V Bike Banner");
	}
	public void verify_Hunk150_BikeBanner() {
		Library.visible_link(driver, Hunk150BikeBanner, "Hunk 150 Bike Banner");
	}
	public void verify_Xoom110_ScooterBanner() {
		Library.visible_link(driver, Xoom110ScooterBanner, "Xoom 110 Scooter Banner");
	}
	public void verify_Xpulse2004v_highlights_features() {
		Library.visible_link(driver, Xpulse200Technology, "Technology");
		Library.visible_link(driver, Xpulse200Safety, "Safety");
		Library.visible_link(driver, Xpulse200Features, "Features");
		Library.visible_link(driver, Xpulse200Performance, "Performance");
	}
	public void verify_Xoom110_highlights_features() {
		Library.visible_link(driver, Destini125Style, "Style");
		Library.visible_link(driver, Xpulse200Technology, "Technology");
		Library.visible_link(driver, Xoom110Convinience, "Convinience");
		Library.visible_link(driver, Xpulse200Performance, "Performance");
	}
	public void click_on_download_broucher_button1() {
		Library.click(driver, DownloadBrochureButton, "Download Brochure Button");
		Library.threadSleep(1000);
	    try {
	    Library.passmsg(driver.getCurrentUrl());
	    driver.navigate().back();
	    Library.passmsg("New tab successfully open and close");
	    }catch(Exception e) {
	    	Library.failmsg("Download broucher is not open in new tab");
	    }
	}
		
	
	
	
	
}
