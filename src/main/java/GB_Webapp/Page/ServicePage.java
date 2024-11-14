package GB_Webapp.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GB_Webapp.Utility.Library;

public class ServicePage extends BasePage{
	
	public ServicePage(WebDriver driver) {
		super(driver);
	}
	

//=================================================================================================================	
	@FindBy(xpath = "//h2[normalize-space()='LOCATE A DEALER']")
	private WebElement LocateADealer;
	
	@FindBy(xpath="//button[@data-id='categorySelect']")
	private WebElement CategoryDropDown;
	
	@FindBy(xpath="//button[@data-id='citySelectDealer']")
	private WebElement DistrictDropDown;
	
	@FindBy(xpath="//button[@data-id='citySelectDealer']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//div[contains(text(),'Maintenance Tips')]")
	private WebElement MaintenanceTips;
	
	@FindBy(xpath="//a[contains(text(),'Maintenance Tips')]")
	private WebElement HeaderMaintenanceTips;
	
	@FindBy(xpath="//div[contains(text(),'Warranty')] | //a[contains(text(),'Warranty')]")
	private WebElement Warranty;
	
	@FindBy(xpath="//a[contains(text(),'Warranty')]")
	private WebElement HeaderWarranty;
	
	@FindBy(xpath="//div[contains(text(),'Two Wheeler Tips')] | //a[contains(text(),'Two Wheeler Tips')]")
	private WebElement TwoWheelerTips;
	
	@FindBy(xpath="(//div[@class='info-text-title'])[4] | //a[@class='nav-link '][contains(text(),'Owner’s Manual')]")
	private WebElement OwnersManual;
	
	@FindBy(xpath="//div[contains(text(),'Hero Joyride')]")
	private WebElement HeroJoyride;
	
	@FindBy(xpath="//div[contains(text(),'DIY Videos')]")
	private WebElement DiyVideos;
	
	@FindBy(xpath="//div[contains(text(),'Hero Genuine Parts')] | //a[contains(text(),'Hero Genuine Parts')]")
	private WebElement HeroGenuineParts;
	
	
	// zambia country xpath
	
	@FindBy(xpath="(//a[@value='serviceMegaMenu'])[3]")
	private WebElement CloseServiceicon;
	
	@FindBy(xpath="//div[contains(text(),'Service and Maintenance Tips')]")
	private WebElement ServiceAndMaintenanceTips;
	
	@FindBy(xpath="//a[normalize-space()='Service Schedule']")
	private WebElement ServiceScheduleText;
	
	@FindBy(xpath="(//div[normalize-space()='Select Bike'])[1]")
	private WebElement SelectBikeDropDown;
	
	@FindBy(xpath="//span[normalize-space()='XPULSE 200 Carb']")
	private WebElement Xpulse200CarbBike;
	
	@FindBy(xpath="//span[normalize-space()='Hunter 100']")
	private WebElement Hunter100Bike;
	
	@FindBy(xpath="//span[normalize-space()='Hunter 125']")
	private WebElement Hunter125Bike;
	
	@FindBy(xpath="//span[normalize-space()='Hunter 150']")
	private WebElement Hunter150Bike;
	
	@FindBy(xpath="//span[normalize-space()='Destini 125']")
	private WebElement Destini125Bike;
	
	@FindBy(xpath="//p[@class='service-note']")
	private WebElement PaidServiceText;
	
	@FindBy(xpath="//td[normalize-space()='Type of Free Service']")
	private WebElement TypeOfFreeServiceText;
	
	@FindBy(xpath="//td[normalize-space()='Type of Free Service']//following-sibling::td")
	private List<WebElement> ServicingNumber;
	
	@FindBy(xpath="//td[normalize-space()='Validity in Kms from the date of purchase']")
	private WebElement ValidityInKmsText;
	
	@FindBy(xpath="//td[normalize-space()='Validity in Kms from the date of purchase']//following-sibling::td")
	private List<WebElement> KMRange;
	
	@FindBy(xpath="//td[normalize-space()='Validity in Days from the date of previous service']")
	private WebElement ValidityInDaysText;
	
	@FindBy(xpath="//td[normalize-space()='Validity in Days from the date of previous service']//following-sibling::td")
	private List<WebElement> ServiceDate;
	
	@FindBy(xpath="//a[contains(text(),'Hero Genuine Parts')]")
	private WebElement HeaderHeroGenuineParts;
	
	@FindBy(xpath="//a[contains(text(),'Two Wheeler Tips')]")
	private WebElement HeaderTwoWheelerTips;
	
	@FindBy(xpath="//a[contains(text(),'Service and Maintenance Tips')]")
	private WebElement HeaderServiceAndMaintenanceTips;
	
	@FindBy(xpath="//div[contains(text(),'Two Wheeler Tips')]")
	private WebElement ZambiaTwoWheelerTips;
	
	@FindBy(xpath="//a[normalize-space()='Pre-ride Inspection Guide']")
	private WebElement PreRideInspectionGuide;
	
	@FindBy(xpath="(//div[@class='tips-box'])[1]")
	private WebElement EngineOilLevel;
	
	@FindBy(xpath="//div[contains(text(),'ENGINE OIL LEVEL')]")
	private WebElement EngineOilLevelInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[2]")
	private WebElement FuelLevel;
	
	@FindBy(xpath="//div[contains(text(),'Fuel Level/ Fuel Valve')]")
	private WebElement FuelLevelInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[3]")
	private WebElement FrontAndRearBrakes;
	
	@FindBy(xpath="(//div[normalize-space()='Brakes'])[2]")
	private WebElement FrontAndRearBrakesInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[4]")
	private WebElement Tyres;
	
	@FindBy(xpath="(//div[normalize-space()='Tyres'])[4]")
	private WebElement TyresInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[5]")
	private WebElement Clutch;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Clutch']")
	private WebElement ClutchInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[6]")
	private WebElement DriveChain;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Drive Chain']")
	private WebElement DriveChainInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[7]")
	private WebElement Throttle;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Throttle']")
	private WebElement ThrottleInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[8]")
	private WebElement LightsAndHorns;
	
	@FindBy(xpath="//div[contains(text(),'Lamps & Horns')]")
	private WebElement LightsAndHornsInfo;
	
	@FindBy(xpath="(//div[@class='tips-box'])[9]")
	private WebElement RearViewMirror;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Rear View Mirror']")
	private WebElement RearViewMirrorInfo;
	
	@FindBy(xpath="//div[@class='two-wheeler-tips']//div[10]")
	private WebElement AirSuctionValve;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Air Suction Valve']")
	private WebElement AirSuctionValveInfo;
	
	@FindBy(xpath="//div[@class='two-wheeler-tips']//div[11]")
	private WebElement FittingsAndFastners;
	
	@FindBy(xpath="//div[contains(text(),'Fittings & Fastners')]")
	private WebElement FittingsAndFastnersInfo;
	
	@FindBy(xpath="//div[@class='two-wheeler-tips']//div[12]")
	private WebElement Battery;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Battery']")
	private WebElement BatteryInfo;
	
	@FindBy(xpath="//div[@class='two-wheeler-tips']//div[13]")
	private WebElement Steering;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Steering']")
	private WebElement SteeringInfo;
	
	@FindBy(xpath="//div[@class='two-wheeler-tips']//div[14]")
	private WebElement FuseReplacement;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='Fuse Replacement']")
	private WebElement FuseReplacementInfo;
	
	@FindBy(xpath="//a[normalize-space()='Fuel saving tips']")
	private WebElement FuelSavingTips;
	
	@FindBy(xpath="//div[contains(text(),'Fuel Saving Tips')]//parent::div//child::div[1]")
	private WebElement FuelSavingTipsIMG;
	
	@FindBy(xpath="//img[@alt='FUEL SAVING TIPS']")
	private WebElement FuelSavingTipsIMG1;
	
	@FindBy(xpath="//div[@class='page-title text-uppercase font-bold icon-with-text'][normalize-space()='FUEL SAVING TIPS']")
	private WebElement FuelSavingTipsIMGInfo;
	
	@FindBy(xpath="//div[contains(text(),'Hero Genuine Parts')]")
	private WebElement HeroGenuinePartsMainPage;
	
	@FindBy(xpath="//h2[normalize-space()='Parts']")
	private WebElement PartsPage;
	
	@FindBy(xpath="//img[@alt='Image']")
	private WebElement PartsImage;
	
	@FindBy(xpath="//a[@class='dropdown-item']")
	private List<WebElement> AllDropDownOptions;
	
	@FindBy(xpath="//a[normalize-space()='Care & Maintenance']")
	private WebElement CareAndMaintenance;
	
	@FindBy(xpath="//div[contains(text(),'Storage Tips for Your Vehicle')]//parent::div//child::div[1]")
	private WebElement StorageTipsForYourVehicleIMG;
	
	@FindBy(xpath="//div[contains(text(),'STORAGE TIPS FOR YOUR  VEHICLE WHEN LEAVING IDLE THESE DAYS')]")
	private WebElement StorageTipsForYourVehicleIMGInfo;
	
//	@FindBy(xpath="forwardIcon")
//	private WebElement RCButton;
//	
//	@FindBy(xpath="forwardIcon")
//	private WebElement RCButton;
	
			
	
	

//============================================================================================================	

	public WebElement getLocateADealer() {
		return LocateADealer;
	}
	public WebElement getCategoryDropDown() {
		return CategoryDropDown;
	}
	public WebElement getDistrictDropDown() {
		return DistrictDropDown;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
	public WebElement getMaintenanceTips() {
		return MaintenanceTips;
	}
	public WebElement getWarranty() {
		return Warranty;
	}
	public WebElement getTwoWheelerTips() {
		return TwoWheelerTips;
	}
	public WebElement getOwnersManual() {
		return OwnersManual;
	}
	public WebElement getHeroJoyride() {
		return HeroJoyride;
	}
	public WebElement getDiyVideos() {
		return DiyVideos;
	}
	public WebElement getHeroGenuineParts() {
		return HeroGenuineParts;
	}
//============================================================================================================
//============================================================================================================
//============================================================================================================
	public void click_on_dealers_icon() {
		Library.waitForVisibilityOf(driver, loginPg.getDealers());
		Library.click(driver, loginPg.getDealers(), "Delears icon");
	}
	public void verify_locate_a_dealer_page_text() {
		Library.visible_link(driver, LocateADealer, "Locate A Dealer");
	}
	public void verify_category_dropdown() {
		Library.visible_link(driver, CategoryDropDown, "Category DropDown");
	}
	public void verify_district_dropdown() {
		Library.visible_link(driver, DistrictDropDown, "District DropDown");
	}
	public void verify_search_button() {
		Library.visible_link(driver, SearchButton, "Search Button");
	}
	
	/////// zambia country 
	
	public void click_On_Close_Service_icon() {
		Library.click(driver, CloseServiceicon, "Close Service icon");
	}
	public void click_on_service_and_maintenance_tips() {
		Library.click(driver, ServiceAndMaintenanceTips, "Service And Maintenance Tips");		
	}
	public void verify_service_schedule_and_dropdown_bikes() {
		Library.visible_link(driver, ServiceScheduleText, "Service Schedule");
		Library.click(driver, SelectBikeDropDown, "Select Bike DropDown");
		Library.visible_link(driver, Xpulse200CarbBike, "Xpulse 200 Carb Bike");
		Library.visible_link(driver, Hunter100Bike, "Hunter 100 Bike");
		Library.visible_link(driver, Hunter125Bike, "Hunter 125 Bike");
		Library.visible_link(driver, Hunter150Bike, "Hunter 150 Bike");
		Library.visible_link(driver, Destini125Bike, "Destini 125 Bike");		
	}
	public void select_any_bikes_and_verify_bikes_servicing_information_it_should_be_displayed() {
		Library.click(driver, AllDropDownOptions.get(1), AllDropDownOptions.get(1).getText());
		Library.visible_link_gettext(driver, PaidServiceText, "Paid Service");
		Library.visible_link(driver, TypeOfFreeServiceText, "Type Of Free Service");
		for (WebElement element : ServicingNumber) {
			Library.waitForVisibilityOf(driver, element);
			Library.visible_link_gettext(driver, element, "Type Of Free Service");
		}
		Library.visible_link(driver, ValidityInKmsText, "Validity In Kms");
		for (WebElement element : KMRange) {
			Library.waitForVisibilityOf(driver, element);
			Library.visible_link_gettext(driver, element, "Validity in KM Range");
		}
		Library.visible_link(driver, ValidityInDaysText, "Validity In Days");
		for (WebElement element : ServiceDate) {
			Library.waitForVisibilityOf(driver, element);
			Library.visible_link_gettext(driver, element, "Validity In Days");
		}	
	}
	public void verify_header_line_three_icons() {
		Library.visible_link(driver, HeaderServiceAndMaintenanceTips, "Header Service And Maintenance Tips");
		Library.visible_link(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.visible_link(driver, HeaderHeroGenuineParts, "Header Hero Genuine Parts");		
	}
	public void click_on_header_two_wheeler_tips_icon() {
		try {
			HeaderTwoWheelerTips.isDisplayed();
			HeaderTwoWheelerTips.click();
//			Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		}catch(Exception e) {
			Library.click(driver, loginPg.getService(), "service icon");
			Library.click(driver, ZambiaTwoWheelerTips, "ZambiaTwoWheelerTips");
		}	
	}
	public void click_on_pre_ride_inspection_guide() {
		Library.click(driver, PreRideInspectionGuide, "Pre-Ride Inspection Guide");	
	}
	public void verify_all_inspection_guide() {
		Library.click(driver, EngineOilLevel, "Engine Oil Level");
		Library.visible_link(driver, EngineOilLevelInfo, "Engine Oil Level Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, FuelLevel, "Fuel Level");
		Library.visible_link(driver, FuelLevelInfo, "Fuel Level Info");	
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, FrontAndRearBrakes, "Front And Rear Brakes");
		Library.visible_link(driver, FrontAndRearBrakesInfo, "Front And Rear Brakes Info");	
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, Tyres, "Tyres");
		Library.visible_link(driver, TyresInfo, "Tyres Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, Clutch, "Clutch");
		Library.visible_link(driver, ClutchInfo, "Clutch Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, DriveChain, "Drive Chain");
		Library.visible_link(driver, DriveChainInfo, "Drive Chain Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, Throttle, "Throttle");
		Library.visible_link(driver, ThrottleInfo, "Throttle Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, LightsAndHorns, "Lights And Horns");
		Library.visible_link(driver, LightsAndHornsInfo, "Lights And Horns Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, RearViewMirror, "Rear View Mirror");
		Library.visible_link(driver, RearViewMirrorInfo, "Rear View Mirror Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, AirSuctionValve, "Air Suction Valver");
		Library.visible_link(driver, AirSuctionValveInfo, "Air Suction Valve Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, FittingsAndFastners, "Fittings And Fastners");
		Library.visible_link(driver, FittingsAndFastnersInfo, "Fittings And Fastners Info");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, Battery, "Battery");
		Library.visible_link(driver, BatteryInfo, "BatteryInfo");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, Steering, "Steering");
		Library.visible_link(driver, SteeringInfo, "SteeringInfo");
		Library.click(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, FuseReplacement, "Fuse Replacement");
		Library.visible_link(driver, FuseReplacementInfo, "Fuse Replacement Info");		
	}
	public void click_on_fuel_saving_tips() {
		Library.click(driver, FuelSavingTips, "Fuel Saving Tips");		
	}
	public void verify_all_fuel_saving_tips() {
		Library.click(driver, FuelSavingTipsIMG1, "Fuel Saving Tips card");
		Library.visible_link(driver, FuelSavingTipsIMGInfo, "Fuel Saving Tips Info");		
	}
	public void click_on_hero_genuine_parts() {
		try {
			HeaderHeroGenuineParts.isDisplayed();
			HeaderHeroGenuineParts.click();
//			Library.click(driver, HeaderHeroGenuineParts, "Header Hero Genuine Parts");
		}catch(Exception e) {
			Library.click(driver, loginPg.getService(), "service icon");
			Library.click(driver, HeroGenuinePartsMainPage, "Hero Genuine Parts in Main Page");
		}			
	}
	public void verify_hero_genuine_parts_page_information() {
		Library.visible_link(driver, PartsPage, "Parts information");
		Library.visible_link(driver, PartsImage, "Parts Image");		
	}
	
//=================================== Philippines Country code	start ==================================

	public void click_on_maintenance_tips() {
		Library.click(driver, MaintenanceTips, "Maintenance Tips");		
	}
	public void verify_header_line_four_icons() {
		Library.visible_link(driver, HeaderMaintenanceTips, "Maintenance Tips");	
		Library.visible_link(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.visible_link(driver, HeaderHeroGenuineParts, "Header Hero Genuine Parts");	
		Library.visible_link(driver, HeaderWarranty, "Warranty");
		
	}
	public void verify_service_schedule_and_dropdown_three_bikes() {
		Library.visible_link(driver, ServiceScheduleText, "Service Schedule");
		Library.click(driver, SelectBikeDropDown, "Select Bike DropDown");
		for(WebElement element: AllDropDownOptions) {			
			Library.visible_link(driver, element, element.getText());
			}
		}
	public void click_on_care_and_maintenance() {
		Library.click(driver, CareAndMaintenance, "Care And Maintenance");
		
	}
	public void verify_all_care_and_maintenance() {
		Library.click(driver, StorageTipsForYourVehicleIMG, "Storage Tips For Your Vehicle IMG");
		Library.visible_link(driver, StorageTipsForYourVehicleIMGInfo, "Storage Tips For Your Vehicle Info");	
		Library.visible_link(driver, HeaderTwoWheelerTips, "Header Two Wheeler Tips");
		Library.click(driver, CareAndMaintenance, "Care And Maintenance");		
		Library.click(driver, FuelSavingTipsIMG, "Fuel Saving Tips card");
		Library.visible_link(driver, FuelSavingTipsIMGInfo, "Fuel Saving Tips Info");		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
