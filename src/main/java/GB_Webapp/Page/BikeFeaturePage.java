package GB_Webapp.Page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GB_Webapp.Utility.Library;

public class BikeFeaturePage extends BasePage{

	public BikeFeaturePage(WebDriver driver) {
		super(driver);
	}

	
//=================================================================================================================	
	@FindBy(xpath="//span[normalize-space()='HIGHLIGHTS']")
	private WebElement Highlights;
	//Highlights
		@FindBy(xpath="//div[normalize-space()='XTEC' or normalize-space()='TECHNOLOGY' or @id='technology-tab']")
		private WebElement TechnologyTab;
		
		@FindBy(xpath="//div[normalize-space()='FEATURES' or @id='contact-tab']")
		private WebElement FeaturesTab;
		
		@FindBy(xpath="//div[normalize-space()='SAFETY' or @id='safety-tab']")
		private WebElement SafetyTab;
		
		@FindBy(xpath="(//div[normalize-space()='SAFETY' or @id='safety-tab'])[2]")
		private WebElement CommuterSafetyTab;  // commuter All bike need to click on this
		
		@FindBy(xpath="//div[normalize-space()='TRUST' or @id='warranty-tab']")
		private WebElement TrustTab;
		
		@FindBy(xpath="//h3[normalize-space()='TECHNOLOGY']")
		private WebElement TechnologyTab1;
		
		@FindBy(xpath="//h3[normalize-space()='FEATURES']")
		private WebElement FeaturesTab1;
		
		@FindBy(xpath="//h3[normalize-space()='SAFETY']")
		private WebElement SafetyTab1;
		
		@FindBy(xpath="//h3[normalize-space()='PERFORMANCE']")
		private WebElement TrustTab1;
			
	@FindBy(xpath="//span[normalize-space()='COLOURS']")
	private WebElement Colors;
	//Colors
		@FindBy(xpath="//span[@class='thumb-text mob-hide' or @class='thumb-text']")
		private List<WebElement> BikeColours;
		
	@FindBy(xpath="//span[normalize-space()='PRICE']")
	private WebElement Price;
	//price
		@FindBy(xpath="//ul[@id='variantTypes']//child::li")
		private List<WebElement> BikeVariantNames;
		
		@FindBy(xpath="//ul[@id='exshowroom-price']//child::li")
		private List<WebElement> BikeVariantPrices;
		
	@FindBy(xpath="//span[normalize-space()='SPECIFICATIONS']")
	private WebElement Specifications;
	//Specifications
		@FindBy(xpath="//div[@id='v-pills-tab']//child::a | //span[@class='mob-hide']")
		private List<WebElement> AllSpecificationTab;

	@FindBy(xpath="//span[normalize-space()='EMI']")
	private WebElement EMI;
	
	@FindBy(xpath="//span[normalize-space()='GALLERY']")
	private WebElement Gallery;

	
	
	
	
	@FindBy(xpath="(//button[@data-bs-toggle='dropdown'])[2]")
	private WebElement SelectModelDropDown;
	
	@FindBy(xpath="//a[@id='bs-select-1-1']")
	private WebElement Select1stBike;
	
	@FindBy(xpath="//input[@id='modelPrice']")
	private WebElement ModelPrice;
	
	@FindBy(xpath="//input[@id='downPayment']")
	private WebElement AttributeValue;

	@FindBy(xpath = "//input[@id='downPaymentInput']")
	private WebElement DownPayment;

	@FindBy(xpath = "//input[@id='loanPeriod']")
	private WebElement LoanPeriod;

	@FindBy(xpath = "//span[@id='loanEmi']")
	private WebElement EMIPerMonth;

	@FindBy(xpath = "//span[@id='totalAmount']")
	private WebElement TotalLoanAmount;
	
	
	
//============================================================================================================	
//============================================================================================================
	public WebElement getHighlights() {
		return Highlights;
	}
	public WebElement getTechnologyTab() {
		return TechnologyTab;
	}
	public WebElement getFeaturesTab() {
		return FeaturesTab;
	}
	public WebElement getSafetyTab() {
		return SafetyTab;
	}
	public WebElement getTrustTab() {
		return TrustTab;
	}
	public WebElement getColors() {
		return Colors;
	}
	public List<WebElement> getBikeColours() {
		return BikeColours;
	}
	public WebElement getPrice() {
		return Price;
	}
	public List<WebElement> getBikeVariantNames() {
		return BikeVariantNames;
	}
	public List<WebElement> getBikeVariantPrices() {
		return BikeVariantPrices;
	}
	public WebElement getEMI() {
		return EMI;
	}
	public WebElement getGallery() {
		return Gallery;
	}
	public WebElement getSpecifications() {
		return Specifications;
	}
	public List<WebElement> getAllSpecificationTab() {
		return AllSpecificationTab;
	}

	
	
//============================================================================================================
//============================================================================================================
	public void click_on_hf_deluxe_bike_name() {
		Library.waitForVisibilityOf(driver, loginPg.getHfDeluxeBikeName());
		Library.click(driver, loginPg.getHfDeluxeBikeName(), "HF Deluxe");
	}
	public void click_on_highlights_icon() {
		Library.waitForVisibilityOf(driver, bf.getHighlights());
		Library.click(driver, bf.getHighlights(), "Highlights");
		Library.threadSleep(500);
	}
	public void verify_technology_button() {
		Library.threadSleep(500);
		Library.waitForVisibilityOf(driver, bf.getTechnologyTab());
	    Library.click(driver, bf.getTechnologyTab(), bf.getTechnologyTab().getText());
	}
	public void verify_features_button() {
	    Library.click(driver, bf.getFeaturesTab(), bf.getFeaturesTab().getText());
	}
	public void verify_safety_button() {		
			if(bf.getSafetyTab().getText().equalsIgnoreCase("SAFETY")) {
				Library.click(driver, bf.getSafetyTab(), bf.getSafetyTab().getText());
			}
			else {
				 Library.click(driver, CommuterSafetyTab, CommuterSafetyTab.getText());
			}	   
	}
	public void verify_trust_button() {
	   Library.click(driver, bf.getTrustTab(), bf.getTrustTab().getText());
	}
	
// for premium tabs required separate xpath
	public void verify_technology_button1() {
		Library.threadSleep(500);
		Library.waitForVisibilityOf(driver, TechnologyTab1);
	    Library.click(driver, TechnologyTab1, TechnologyTab1.getText());
	}
	public void verify_features_button1() {
	    Library.click(driver, FeaturesTab1, FeaturesTab1.getText());
	}
	public void verify_safety_button1() {
	    Library.click(driver, SafetyTab1, SafetyTab1.getText());
	}
	public void verify_trust_button1() {
	   Library.click(driver, TrustTab1, TrustTab1.getText());
	}
	 //////////
	public void click_on_colours_icon() {
	    Library.click(driver, bf.getColors(), "Colours");
	}
	public void verify_bike_multiple_colours() {
		Library.threadSleep(1000);
		for (WebElement element : bf.getBikeColours()) {
			Library.waitForVisibilityOf(driver, element);
			Library.visible_link_gettext(driver, element, "Colours");
		}
	}
	public void click_on_price_icon() {
	    Library.click(driver, bf.getPrice(), "Price");
	}
	public void verify_bike_price() {
		
			for (WebElement element : bf.getBikeVariantNames()) {
				int i=bf.getBikeVariantNames().indexOf(element);
				   Library.visible_link_gettext(driver, element, bf.getBikeVariantPrices().get(i).getText());
			   }
		
	}
	public void click_on_specifications_icon() {
	    Library.click(driver, bf.getSpecifications(), "Specifications");
	}
	public void verify_multiple_specificatios() {
		for (WebElement element : bf.getAllSpecificationTab()) {
			Library.visible_link_gettext(driver, element, "Specification");
		}
		for (WebElement element : bf.getAllSpecificationTab()) {
			Library.click(driver, element, element.getText());
		}
	}
	public void click_on_emi_icon() {
	   Library.click(driver, bf.getEMI(), "EMI");
	   Library.threadSleep(500);
	   try { bf.getEMI().click();     }catch (Exception e) {	   }
	}
	public void click_on_gallery_icon() {
	   Library.click(driver, bf.getGallery(), "Gallery");
	   Library.threadSleep(1000);
	}
	public void click_on_splendor_se_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getSplenderPlusSEBikeName());
	    Library.click(driver, loginPg.getSplenderPlusSEBikeName(), "Splendor+SE");
	}
	public void click_on_splender_xtec_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getSplenderPlusXtecBikeName());
	    Library.click(driver, loginPg.getSplenderPlusXtecBikeName(), "Splendor+ XTEC");
	}
	public void click_on_passion_xpro_xtec_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getPassionXproXtecBikeName());
	    Library.click(driver, loginPg.getPassionXproXtecBikeName(), "Passion XPRO XTEC");
	}
	public void click_on_passion_xpro_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getPassionXproBikeName());
	    Library.click(driver, loginPg.getPassionXproBikeName(), "Passion XPRO");
	}
	public void click_on_glamour_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getGlamourBikeName());
	    Library.click(driver, loginPg.getGlamourBikeName(), "Glamour");
	}
	public void click_on_ignitor_techno_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getIgnitorTechnoBikeName());
	    Library.click(driver, loginPg.getIgnitorTechnoBikeName(), "Ignitor Techno");
	}
	public void click_on_ignitor_xtec_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getIgnitorXtecBikeName());
	    Library.click(driver, loginPg.getIgnitorXtecBikeName(), "Ignitor XTEC");
	}
	public void click_on_thriller_160r_4v_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getThriller160R4VBikeName());
	    Library.click(driver, loginPg.getThriller160R4VBikeName(), "Thriller 160R 4V");
	}
	public void click_on_hunk_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getHUNK150BikeName());
	    Library.click(driver, loginPg.getHUNK150BikeName(), "Hunk 150");
	}
	public void click_on_hunk_150r_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getHunk150RBikeName());
	    Library.click(driver, loginPg.getHunk150RBikeName(), "Hunk 150R");
	}
	public void click_on_thriller_160r_bike_name() {
    	Library.waitForVisibilityOf(driver, loginPg.getThriller160RBikeName());
	    Library.click(driver, loginPg.getThriller160RBikeName(), "Thriller 160R");
	}
	public void click_on_verify_pleasure_scooter_name() {
		Library.waitForVisibilityOf(driver, loginPg.getPleasureBikeName());
	    Library.click(driver, loginPg.getPleasureBikeName(), "PLEASURE");		
	}
	public void click_on_maestro_edge_xtec_scooter_name() {
		Library.waitForVisibilityOf(driver, loginPg.getMaestroEdgeXtecBikeName());
	    Library.click(driver, loginPg.getMaestroEdgeXtecBikeName(), "MAESTRO EDGE XTEC");		
	}
	public void verify_all_emi_option() {
		Library.click(driver, SelectModelDropDown, "Select model drop down");
		Library.click(driver, Select1stBike, Select1stBike.getText());
		String Price = AttributeValue.getAttribute("max");
		String DownPayment = AttributeValue.getAttribute("min");
		String LoanPeriod1 = LoanPeriod.getAttribute("min");		
		Library.passmsg("Model Price = " + Price);
		Library.passmsg("Down Payment = " + DownPayment);
		Library.passmsg("Loan Period = " + LoanPeriod1);
		Library.visible_link_gettext(driver, EMIPerMonth, "Loan EMI Per Month");
		Library.visible_link_gettext(driver, TotalLoanAmount, "Total Loan Amount");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
