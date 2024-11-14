package GB_Webapp.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.ConfigeDataProvider;
import GB_Webapp.Utility.Library;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
//==============================================================================================================
	
	@FindBy(xpath="//div[@class='d-none d-lg-block']//span[contains(text(),'Bangladesh')]")
	private WebElement Bangladesh;
	
	@FindBy(xpath="//h2[normalize-space()='Please Select Your Country']//following-sibling::ul//following-sibling::li")
	private List<WebElement> AllCountries;

	@FindBy(xpath = "//button[@class='btn-close modal-close']")
	private WebElement CloseAllCountries;

	@FindBy(xpath = "//span[@class='brand-image desktop']//img[@alt='Logo of Hero Motor']")
	private WebElement HeroLogo;
	
	@FindBy(xpath = "//a[normalize-space()='PRODUCTS']")
	private WebElement Products;
	
	@FindBy(xpath = "//a[normalize-space()='DEALERS']")
	private WebElement Dealers;
	
	@FindBy(xpath = "//a[normalize-space()='SERVICE']")
	private WebElement Service;
	
	@FindBy(xpath = "//a[normalize-space()='HERO WORLD']")
	private WebElement HeroWorld;
	
	@FindBy(xpath = "//a[normalize-space()='ABOUT HERO']")
	private WebElement AboutHero;
	
	@FindBy(xpath = "(//span[normalize-space()='NEW LAUNCH'])[1]")
	private WebElement NewLaunch;
	
	@FindBy(xpath = "(//span[normalize-space()='NEW LAUNCH'])[2]")
	private WebElement NewLaunch2;
	
	@FindBy(xpath = "//span[normalize-space()='Find a hero']")
	private WebElement FindAHero;
	
	@FindBy(xpath = "//div[@class='bike-name'][normalize-space()='Karizma XMR']")
	private WebElement KarizmaXMR2;
	
	@FindBy(xpath = "//div[@id='menu-498495753']//a[@type='button'][normalize-space()='REQUEST A CALL BACK']")
	private WebElement RequestACallBackButton;
	
	@FindBy(xpath = "//a[@href='/en-bd/products/KarizmaXMR.html'][normalize-space()='VIEW SPECIFICATIONS']")
	private WebElement ViewSpecifications;
	
	@FindBy(xpath = "//h2[normalize-space()='REQUEST A CALL BACK']")
	private WebElement RequestACallBackText;
	
	

	@FindBy(xpath = "(//span[normalize-space()='COMMUTER'])[1]")
	private WebElement Commuter;
	
	@FindBy(xpath = "(//span[normalize-space()='EXECUTIVE'])[1]")
	private WebElement Executive;
	
	@FindBy(xpath = "(//span[normalize-space()='PREMIUM'])[1]")
	private WebElement Premium;
	
	@FindBy(xpath = "(//span[normalize-space()='SCOOTER'])[1]")
	private WebElement Scooter;
	
	@FindBy(xpath = "//a[@aa-data-attr='track_cta'][normalize-space()='Find a Dealer']")
	private WebElement FindDealerButton;
	
	@FindBy(xpath = "//a[@aa-data-attr='track_cta'][normalize-space()='Find a Service Centre']")
	private WebElement FindServiceCentreButton;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'])[1]")
	private WebElement FirstBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'])[1]//following-sibling::div")
	private WebElement FirstBikePrice;////////////
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HF DELUXE']")
	private WebElement HfDeluxeBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HF DELUXE']//following-sibling::div//child::span)[2]")
	private WebElement HfDeluxeBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ SE']")
	private WebElement SplenderPlusSEBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ SE']//following-sibling::div//child::span)[2]")
	private WebElement SplenderPlusSEBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ Xtec']")
	private WebElement SplenderPlusXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ Xtec']//following-sibling::div//child::span)[2]")
	private WebElement SplenderPlusXtecBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro']")
	private WebElement PassionXproBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro']//following-sibling::div//child::span)[2]")
	private WebElement PassionXproBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro Xtec']")
	private WebElement PassionXproXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro Xtec']//following-sibling::div//child::span)[2]")
	private WebElement PassionXproXtecBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Glamour']")
	private WebElement GlamourBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Glamour']//following-sibling::div//child::span)[2]")
	private WebElement GlamourBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Techno']")
	private WebElement IgnitorTechnoBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Techno']//following-sibling::div//child::span)[2]")
	private WebElement IgnitorTechnoBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Xtec']")
	private WebElement IgnitorXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Xtec']//following-sibling::div//child::span)[2]")
	private WebElement IgnitorXtecBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R 4V']")
	private WebElement Thriller160R4VBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R 4V']//following-sibling::div//child::span)[2]")
	private WebElement Thriller160R4VBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HUNK 150']")
	private WebElement HUNK150BikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HUNK 150']//following-sibling::div//child::span)[2]")
	private WebElement HUNK150BikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Hunk 150R']")
	private WebElement Hunk150RBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Hunk 150R']//following-sibling::div//child::span)[2]")
	private WebElement Hunk150RBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R']")
	private WebElement Thriller160RBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R']//following-sibling::div//child::span)[2]")
	private WebElement Thriller160RBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='PLEASURE']")
	private WebElement PleasureBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='PLEASURE']//following-sibling::div//child::span)[2]")
	private WebElement PleasureBikePrice;
	
	@FindBy(xpath = "//div[normalize-space()='MAESTRO EDGE XTEC']")
	private WebElement MaestroEdgeXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='MAESTRO EDGE XTEC']//following-sibling::div//child::span)[2]")
	private WebElement MaestroEdgeXtecBikePrice;

	@FindBy(xpath = "//ul[@class='carousel-indicators']//li")
	private List<WebElement> AllBannerIndicators;

	@FindBy(xpath = "//div[@class='carousel-inner']//a//img[1]")
	private List<WebElement> AllBannerImages;

	@FindBy(xpath = "//div[@class='carousel-inner']//a")
	private List<WebElement> AllBannerImageshrefText;

	@FindBy(xpath = "//div[@class='mm-body-head position-relative scrollbar-hidden']//a[@value='productsMegaMenu']")
	private WebElement CloseScootericon;

//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
//
//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
//
//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
//
//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
	
	
	
public WebElement getCloseScootericon() {
		return CloseScootericon;
	}
	//============================================================================================================	
	public WebElement getNewLaunch2() {
		return NewLaunch2;
	}
	public WebElement getKarizmaXMR2() {
		return KarizmaXMR2;
	}
	public WebElement getRequestACallBackButton() {
		return RequestACallBackButton;
	}
	public WebElement getViewSpecifications() {
		return ViewSpecifications;
	}
	public WebElement getRequestACallBackText() {
		return RequestACallBackText;
	}
	public WebElement getPleasureBikeName() {
		return PleasureBikeName;
	}
	public WebElement getPleasureBikePrice() {
		return PleasureBikePrice;
	}
	public WebElement getMaestroEdgeXtecBikeName() {
		return MaestroEdgeXtecBikeName;
	}
	public WebElement getMaestroEdgeXtecBikePrice() {
		return MaestroEdgeXtecBikePrice;
	}
	public WebElement getThriller160R4VBikeName() {
		return Thriller160R4VBikeName;
	}
	public WebElement getThriller160R4VBikePrice() {
		return Thriller160R4VBikePrice;
	}
	public WebElement getHUNK150BikeName() {
		return HUNK150BikeName;
	}
	public WebElement getHUNK150BikePrice() {
		return HUNK150BikePrice;
	}
	public WebElement getHunk150RBikeName() {
		return Hunk150RBikeName;
	}
	public WebElement getHunk150RBikePrice() {
		return Hunk150RBikePrice;
	}
	public WebElement getThriller160RBikeName() {
		return Thriller160RBikeName;
	}
	public WebElement getThriller160RBikePrice() {
		return Thriller160RBikePrice;
	}
	public WebElement getGlamourBikeName() {
		return GlamourBikeName;
	}
	public WebElement getGlamourBikePrice() {
		return GlamourBikePrice;
	}
	public WebElement getIgnitorTechnoBikeName() {
		return IgnitorTechnoBikeName;
	}
	public WebElement getIgnitorTechnoBikePrice() {
		return IgnitorTechnoBikePrice;
	}
	public WebElement getIgnitorXtecBikeName() {
		return IgnitorXtecBikeName;
	}
	public WebElement getIgnitorXtecBikePrice() {
		return IgnitorXtecBikePrice;
	}
	public WebElement getBangladesh() {
		return Bangladesh;
	}
	public List<WebElement> getAllCountries() {
		return AllCountries;
	}
	public WebElement getCloseAllCountries() {
		return CloseAllCountries;
	}
	public WebElement getHfDeluxeBikeName() {
		return HfDeluxeBikeName;
	}
	public WebElement getHfDeluxeBikePrice() {
		return HfDeluxeBikePrice;
	}
	public WebElement getSplenderPlusSEBikeName() {
		return SplenderPlusSEBikeName;
	}
	public WebElement getSplenderPlusSEBikePrice() {
		return SplenderPlusSEBikePrice;
	}
	public WebElement getSplenderPlusXtecBikeName() {
		return SplenderPlusXtecBikeName;
	}
	public WebElement getSplenderPlusXtecBikePrice() {
		return SplenderPlusXtecBikePrice;
	}
	public WebElement getPassionXproBikeName() {
		return PassionXproBikeName;
	}
	public WebElement getPassionXproBikePrice() {
		return PassionXproBikePrice;
	}
	public WebElement getPassionXproXtecBikeName() {
		return PassionXproXtecBikeName;
	}
	public WebElement getPassionXproXtecBikePrice() {
		return PassionXproXtecBikePrice;
	}
	public WebElement getFirstBikeName() {
		return FirstBikeName;
	}
	public WebElement getFirstBikePrice() {
		return FirstBikePrice;
	}
	public WebElement getHeroLogo() {
		return HeroLogo;
	}
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getDealers() {
		return Dealers;
	}
	public WebElement getService() {
		return Service;
	}
	public WebElement getHeroWorld() {
		return HeroWorld;
	}
	public WebElement getAboutHero() {
		return AboutHero;
	}
	public WebElement getNewLaunch() {
		return NewLaunch;
	}
	public WebElement getCommuter() {
		return Commuter;
	}
	public WebElement getExecutive() {
		return Executive;
	}
	public WebElement getPremium() {
		return Premium;
	}
	public WebElement getScooter() {
		return Scooter;
	}
	public WebElement getFindDealerButton() {
		return FindDealerButton;
	}
	public WebElement getFindServiceCentreButton() {
		return FindServiceCentreButton;
	}
	//============================================================================================================
//============================================================================================================
//============================================================================================================
	public void user_open_website_link() {
		Library.threadSleep(500);
		try {
				if(bf.getHighlights().isDisplayed()) {
					bf.getHighlights().click();
				}else {
				driver.navigate().to(ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
				}
		}catch(Exception e) {
			Library.open_new_Window_and_close_previous_Window(driver, ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
//			driver.navigate().to(ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
		}		
 		Library.passmsg("Bangladesh Website is open using this link = "+ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
 		BaseTest.handlePopup();
	}
	public void user_navigate_to_back_on_current_page() {
		Library.threadSleep(500);
		driver.navigate().back();
		Library.passmsg("User navigate to back on old page");	
	}
	public void country_name_should_be_displayed() {
		
		Library.visible_link(driver, Bangladesh, "Bangladesh");
	}
	public void close_browser() {	
		
		Library.passmsg("Close browser");
//		driver.close();
	}
	public void verify_all_country_should_be_displayed() {
		
		Library.click(driver, Bangladesh, "Select country");
		Library.threadSleep(1000);
		for(WebElement country:AllCountries) {
			Library.visible_link_gettext(driver, country, "Country name is ");
		}
		Library.click(driver, CloseAllCountries, "Close country button");
	}
	public void click_on_new_launch2_icons() {
		loginPg.user_open_website_link();
		try {
			Library.threadSleep(1000);
			Library.waitForVisibilityOf(driver, AboutHero);
			Library.scrollwebpage(driver, FindAHero, "FindAHero");
			FindAHero.click();
		}catch(Exception e) {		}
		Library.scrollwebpage(driver, AboutHero, "About Hero");
	    Library.click(driver, loginPg.getNewLaunch2(), "New Launch");		
	}
	public void click_on_commuter_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getCommuter(), "Commuter icon");
		Library.threadSleep(100);
		
	}
	public void click_on_executive_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getExecutive(), "Executive icon");
		Library.threadSleep(100);
		
	}
	public void click_on_premium_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getPremium(), "Premium icon");
		Library.threadSleep(100);
		
	}
	public void click_on_scooter_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getScooter(), "Scooter icon");
		Library.threadSleep(100);		
	}
	public void verify_all_banner_icon_and_images() {
		List<WebElement> AllBannerIndicatorsIcon= AllBannerIndicators;
		List<WebElement> AllBannerBikeImages= AllBannerImages;	
		List<WebElement> Imageshreftext= AllBannerImageshrefText;			
		int maxSize = AllBannerIndicatorsIcon.size();
		for (int i = 0; i < maxSize; i++) {
		String BikeImagesName = AllBannerBikeImages.get(i).getAttribute("alt");
			if (BikeImagesName == null || BikeImagesName.isEmpty()) {
				BikeImagesName= Imageshreftext.get(i).getAttribute("href");//  using href attribute using string method get only bike name
						try {
					BikeImagesName = BikeImagesName.substring(BikeImagesName.lastIndexOf('/') + 1, BikeImagesName.lastIndexOf('.'));	
						}catch(Exception e) { }
			}	
				Library.passmsg("============ Banner "+ (i+1)+"  ============");
				if (i < AllBannerIndicatorsIcon.size()) {
				Library.click(driver, AllBannerIndicatorsIcon.get(i), "Indicator "+(i+1));
				}		
				if (i < AllBannerBikeImages.size()) {
				Library.visible_link(driver, AllBannerBikeImages.get(i), BikeImagesName);
				}		
		}			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
