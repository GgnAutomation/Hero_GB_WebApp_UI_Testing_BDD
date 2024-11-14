package GB_Webapp.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GB_Webapp.Utility.Library;

public class AboutHeroPage extends BasePage{

	public AboutHeroPage(WebDriver driver) {
		super(driver);
	}
	
	public static String pageTitle ;
//==============================================================================================================
	
	@FindBy(xpath="//div[@class='info-text-title'][normalize-space()='About Hero']")
	private WebElement AboutHeroPage;
	
	@FindBy(xpath="//div[contains(text(),'About Niloy Bangladesh Ltd.')]")
	private WebElement AboutNiloyBangladeshLtd;

	@FindBy(xpath = "//div[contains(text(),'Reach Us')]")
	private WebElement ReachUs;

	@FindBy(xpath = "//div[contains(text(),'Become a Dealer')]")
	private WebElement BecomeADealer;

	@FindBy(xpath = "//div[contains(text(),'Investors')]")
	private WebElement Investors;

	@FindBy(xpath = "//h2[normalize-space()='About HNBL']")
	private WebElement AboutHnblPageText;

	@FindBy(xpath = "//a[normalize-space()='Contact Us']")
	private WebElement ReachUsPageText;

	@FindBy(xpath = "//h2[normalize-space()='Become a Dealer']")
	private WebElement BecomeADealerPageText;

	@FindBy(xpath = "//div[@id='aboutMegaMenu']//img[@alt='service image']")
	private WebElement AboutHeroStaticImage;

	@FindBy(xpath = "(//div[normalize-space()='Find a Dealer'])[4]")
	private WebElement AboutHeroFindADealer;

	@FindBy(xpath = "(//a[@value='aboutMegaMenu'])[3]")
	private WebElement AboutHeroCloseIcon;
	
  /// zambia country xpath become a dealer personal information
	
	@FindBy(xpath = "//input[@id='dealerFirstName']")
	private WebElement DealerFirstName;

	@FindBy(xpath = "//input[@id='dealerMiddleName']")
	private WebElement DealerMiddleName;

	@FindBy(xpath = "//input[@id='dealerLastName']")
	private WebElement DealerLastName;

	@FindBy(xpath = "//input[@id='dealerCity']")
	private WebElement DealerCity;

	@FindBy(xpath = "//input[@id='dealerCountry']")
	private WebElement DealerCountry;

	@FindBy(xpath = "//input[@id='dealerDOB']")
	private WebElement DealerDOB;
	//////// Contact information
	@FindBy(xpath = "//input[@id='dealerPrimaryContactNumber']")
	private WebElement dealerPrimaryContactNumber;

	@FindBy(xpath = "//input[@id='dealerAddressLine1']")
	private WebElement dealerAddressLine1;

	@FindBy(xpath = "//input[@id='dealerAddressLine2']")
	private WebElement dealerAddressLine2;

	@FindBy(xpath = "//input[@id='dealerCityForContact']")
	private WebElement dealerCityForContact;

	@FindBy(xpath = "//input[@id='dealerCountryForContact']")
	private WebElement dealerCountryForContact;

	@FindBy(xpath = "//input[@id='dealerPincodeForContact']")
	private WebElement dealerPincodeForContact;

	@FindBy(xpath = "//input[@id='dealerEmailAdressForContact']")
	private WebElement dealerEmailAdressForContact;

	@FindBy(xpath = "//button[@id='becomeDealerSubmit']")
	private WebElement becomeDealerSubmit;

	@FindBy(xpath = "//i[@onclick='hideBeDealerModal()']")
	private WebElement CloseSuccessPopup;

	@FindBy(xpath = "//h2[normalize-space()='Thank You']")
	private WebElement ThankYouPopup;

	@FindBy(xpath = "//input[@id='existingBusinessFrimName']")
	private WebElement CompanyName;

	@FindBy(xpath = "//input[@id='existingBusinessCity']")
	private WebElement CityName;

	@FindBy(xpath = "//textarea[@id='existingBusinessDescription']")
	private WebElement EnterDescription;

	@FindBy(xpath = "//button[@data-id='existingBusinessCompanyType']")
	private WebElement SelectCompanyTypeDropDown;

	@FindBy(xpath = "//span[normalize-space()='Company']")
	private WebElement DropDownValueCompany;

	@FindBy(xpath = "//span[normalize-space()='Partnership firm / LLP']")
	private WebElement DropDownValuePartnershipFirm;

	@FindBy(xpath = "//span[normalize-space()='Proprietary']")
	private WebElement DropDownValueProprietary;

	@FindBy(xpath = "(//h4[@class='share-holder-header'])[1]")
	private WebElement PartnershipFirmForm;

	@FindBy(xpath = "(//h4[@class='share-holder-header'][normalize-space()='Proprietorship'])[1]")
	private WebElement ProprietorshipForm;

	@FindBy(xpath = "(//h4[@class='share-holder-header'][normalize-space()='Company'])[1]")
	private WebElement CompanyForm;

	@FindBy(xpath = "(//input[@id='nameOfPartners'])[1]")
	private WebElement NameOfPartners;

	@FindBy(xpath = "(//input[@id='nameOfPartnerFatherOrSpouse'])[1]")
	private WebElement NameOfPartnerFatherOrSpouse;

	@FindBy(xpath = "(//input[@id='partnerDesignation'])[1]")
	private WebElement PartnerDesignation;

	@FindBy(xpath = "(//input[@id='partnerAddressLine1'])[1]")
	private WebElement PartnerAddressLine1;

	@FindBy(xpath = "(//input[@id='partnerAddressLine2'])[1]")
	private WebElement PartnerAddressLine2;

	@FindBy(xpath = "(//input[@id='partnerCity'])[1]")
	private WebElement PartnerCity;

	@FindBy(xpath = "(//input[@id='partnerCountry'])[1]")
	private WebElement PartnerCountry;

	@FindBy(xpath = "(//input[@id='partnerPincode'])[1]")
	private WebElement PartnerPincode;

	@FindBy(xpath = "//div[contains(text(),'Select Year')]")
	private WebElement SelectYearDropDown;

	@FindBy(xpath = "//span[normalize-space()='2024']")
	private WebElement SelectYearDropDownValue;

	@FindBy(xpath = "//input[@id='existingBusinessTotalManpowerEmployed']")
	private WebElement EnterManPower;

	@FindBy(xpath = "//input[@id='existingBusinessNoOfManagers']")
	private WebElement EnterManagers;

	@FindBy(xpath = "//input[@id='existingBusinessManagingPartners']")
	private WebElement EnterManagingPartners;

	@FindBy(xpath = "//input[@id='existingBusinessProductLineHandled']")
	private WebElement EnterProductLineHandled;

	@FindBy(xpath = "//input[@id='shareholderName']")
	private WebElement ShareHolderName;

	@FindBy(xpath = "//input[@id='relationshipWithMainApplicant']")
	private WebElement RelationshipWithMainApplicant;

	@FindBy(xpath = "//input[@id='shareholderResponsibility']")
	private WebElement ShareHolderResponsibility;

	@FindBy(xpath = "//input[@id='shareholderNoOfShares']")
	private WebElement ShareHolderNoOfShares;

	@FindBy(xpath = "//input[@id='shareholderAgeinYears']")
	private WebElement ShareHolderAgeinYears;

	@FindBy(xpath = "//button[normalize-space()='RESET']")
	private WebElement ResetButton;

	@FindBy(xpath = "//div[contains(text(),'About Terrafirma Motors Corporation')]")
	private WebElement AboutTerrafirmaMotorsCorporation;

	@FindBy(xpath = "//h2[normalize-space()='About Terrafirma Motors Corporation']")
	private WebElement AboutTerrafirmaMotorsCorporationPageText;
	
	
	
	
	
//==============================================================================================	
	public WebElement getAboutHeroPage() {
		return AboutHeroPage;
	}
	public WebElement getAboutNiloyBangladeshLtd() {
		return AboutNiloyBangladeshLtd;
	}
	public WebElement getReachUs() {
		return ReachUs;
	}
	public WebElement getBecomeADealer() {
		return BecomeADealer;
	}
	public WebElement getInvestors() {
		return Investors;
	}
	public static String getPageTitle() {
		return pageTitle;
	}
	public WebElement getAboutHnblPageText() {
		return AboutHnblPageText;
	}
	public WebElement getReachUsPageText() {
		return ReachUsPageText;
	}
	public WebElement getBecomeADealerPageText() {
		return BecomeADealerPageText;
	}
//====================================================================================================
	
	public void verify_about_hero_page_in_new_window_and_close() {
	    pageTitle = "About Us: Vision, Values, and Innovation | Hero MotoCorp";
		Library.verify_new_window_and_close(driver, pageTitle);		
	}
	public void verify_investor_page() {
		pageTitle = "Investor Relations";
		Library.verify_new_window_and_close(driver, pageTitle);		
	}
	public void Verify_About_hero_right_side_static_image() {
		Library.visible_link(driver, AboutHeroStaticImage, "About Hero Static Image");
	}
	public void click_on_find_a_dealer() {
		Library.click(driver, AboutHeroFindADealer, "About Hero Find A Dealer");
	}
	public void click_on_about_hero_close_icon() {
		Library.click(driver, AboutHeroCloseIcon, "About Hero Close Icon");		
	}
	public void fill_become_a_dealer_page_information(String countryName) {
		Library.sendKeys(driver, DealerFirstName, ZambiaCustomerName, "Dealer First Name");	
		Library.sendKeys(driver, DealerMiddleName, ZambiaCustomerMiddleName, "Dealer Middle Name");
		Library.sendKeys(driver, DealerLastName, ZambiaCustomerLastName, "Dealer Last Name");
		Library.sendKeys(driver, DealerCity, ZambiaCity, "Dealer City");
		switch (countryName) {
	    case "Zambia":
	    	String Country =DealerCountry.getAttribute("value");
//			System.out.println(Country);
			Library.assertEquals(driver, Country, "Zambia");
	        break;
	    case "Philippines":
	    	Library.sendKeys(driver, DealerCountry, Philippines_name, "Country Name");
	        break;
	    default:
	        // code block if no case matches
	    	break;
	}	
		
		Library.sendKeys(driver, DealerDOB, ZambiaDOB, "Dealer DOB");
	}
	public void fill_contact_details(String countryName) {
		Library.sendKeys(driver, dealerPrimaryContactNumber, ZambiaMobileNumber, "dealer Primary Contact Number");
		Library.sendKeys(driver, dealerAddressLine1, Address1, "dealer Address Line 1");
		Library.sendKeys(driver, dealerAddressLine2, Address2, "dealer Address Line 2");
		Library.sendKeys(driver, dealerCityForContact, ZambiaCity, "dealer City For Contact");
		switch (countryName) {
	    case "Zambia":
	    	String Country =dealerCountryForContact.getAttribute("value");
//			System.out.println(Country);
			Library.assertEquals(driver, Country, "Zambia");
	        break;
	    case "Philippines":
	    	Library.sendKeys(driver, dealerCountryForContact, Philippines_name, "Country Name");
	        break;
	    default:
	        // code block if no case matches
	    	break;
	}	
		
		Library.sendKeys(driver, dealerPincodeForContact, Pincode, "dealer Pincode For Contact");
		Library.sendKeys(driver, dealerEmailAdressForContact, ZambiaEmail, "dealer Email Address For Contact");
	}
	public void click_on_submit_button_and_verify_thank_you_pop_up() {
		Library.moveToElement(driver, becomeDealerSubmit);
		Library.click(driver, becomeDealerSubmit, "Submit Button");
		try {	becomeDealerSubmit.click();	}catch(Exception e) {		}
		Library.visible_link(driver,ThankYouPopup, "Thank You Popup");
		Library.click(driver, CloseSuccessPopup, "Close Success Popup");		
	}
	public void fill_existing_business_details() {
		Library.moveToElement(driver, SelectCompanyTypeDropDown);
		Library.sendKeys(driver, CompanyName, Company_name, "Company Name");
		Library.sendKeys(driver, CityName, ZambiaCity, "City Name");
		Library.sendKeys(driver, EnterDescription, Discription, "EnterDescription");
		Library.click(driver, SelectCompanyTypeDropDown, "Select Company Type Drop Down");
		Library.click(driver, DropDownValueCompany, "DropDown Value Company");
		Library.visible_link(driver, CompanyForm, "Company form Displayed");
		Library.click(driver, SelectCompanyTypeDropDown, "Select Company Type Drop Down");
		Library.click(driver, DropDownValueProprietary, "DropDown Value Proprietary");
		Library.visible_link(driver, ProprietorshipForm, "Proprietorship Form Displayed");
		Library.click(driver, SelectCompanyTypeDropDown, "Select Company Type Drop Down");
		Library.click(driver, DropDownValuePartnershipFirm, "DropDown Value Partnership Firm");		
		Library.visible_link(driver, PartnershipFirmForm, "Partnership Firm form Displayed");	
		Library.moveToElement(driver, PartnerPincode);
		Library.sendKeys(driver, NameOfPartners, ZambiaCustomerName, "Name Of Partners");
		Library.sendKeys(driver, NameOfPartnerFatherOrSpouse, ZambiaCustomerName, "Name Of Partner Father Or Spouse");
		Library.sendKeys(driver, PartnerDesignation, Designation, "Partner Designation");
		Library.sendKeys(driver, PartnerAddressLine1, Address1, "Partner Address Line 1");
		Library.sendKeys(driver, PartnerAddressLine2, Address2, "Partner Address Line 2");
		Library.sendKeys(driver, PartnerCity, ZambiaCity, "Partner City");
		Library.sendKeys(driver, PartnerCountry, Country, "Partner Country");
		Library.sendKeys(driver, PartnerPincode, Pincode, "Partner Pincode");
		Library.moveToElement(driver, EnterProductLineHandled);
		Library.click(driver, SelectYearDropDown, "Select Year Drop Down");
		Library.click(driver, SelectYearDropDownValue, "Select Year Drop Down Value");		
		Library.sendKeys(driver, EnterManPower, Total_Manpower, "Enter Man Power");
		Library.sendKeys(driver, EnterManagers, Total_manager, "Enter Managers");
		Library.sendKeys(driver, EnterManagingPartners, Total_manager, "Enter Managing Partners");
		Library.sendKeys(driver, EnterProductLineHandled, ZambiaCustomerMiddleName, "Enter Product Line Handled");
	}
	public void fill_share_holder_details() {
		Library.moveToElement(driver, ResetButton);
		Library.sendKeys(driver, ShareHolderName, ZambiaCustomerName, "Share Holder Name");
		Library.sendKeys(driver, RelationshipWithMainApplicant, Relation, "Relationshi pWith Main Applicant");
		Library.sendKeys(driver, ShareHolderResponsibility, Responsibility, "Share Holder Responsibility");
		Library.sendKeys(driver, ShareHolderNoOfShares, Total_shares, "Share Holder No Of Shares");
		Library.sendKeys(driver, ShareHolderAgeinYears, Age, "Share Holder Age in Years");
		Library.visible_link(driver, ResetButton, "Reset Button");		
	}
	
//======================================  Philippines code start ================================
	public void AboutTerrafirmaMotorsCorporation() {
		Library.click(driver, loginPg.getAboutHero(), "About hero icon");
		Library.click(driver, AboutTerrafirmaMotorsCorporation, "About Terrafirma Motors Corporation");
		Library.visible_link(driver, AboutTerrafirmaMotorsCorporationPageText, "About Terrafirma Motors Corporation Page info");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
