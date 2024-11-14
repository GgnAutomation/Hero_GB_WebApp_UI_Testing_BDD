package GB_Webapp.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GB_Webapp.Utility.Library;

public class HeroWorldPage extends BasePage{

	public HeroWorldPage(WebDriver driver) {
		super(driver);
	}
	
	public static String pageTitle;
//==============================================================================================================
	
	@FindBy(xpath="//a[normalize-space()='Hero News']")
	private WebElement HeroNews;
	
	@FindBy(xpath="//a[normalize-space()='Amaar Hero']")
	private WebElement AmaarHero;

	@FindBy(xpath = "//a[contains(text(),'Hero Joyride')]")
	private WebElement HeroJoyride;

	@FindBy(xpath = "//a[@class='nav-link '][normalize-space()='Blogs']")
	private WebElement Blogs;

	@FindBy(xpath = "//h2[normalize-space()='Other News']")
	private WebElement OtherNewsPageText;

	@FindBy(xpath = "//h2[normalize-space()='Hero Joyride']")
	private WebElement HeroJoyridePageText;

	@FindBy(xpath = "//h2[normalize-space()='Other Blogs']")
	private WebElement OtherBlogsPageText;

	

//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
//
//	@FindBy(xpath = "Blogs")
//	private WebElement Blo;
	
	
//=============================================================================================================
	
	public WebElement getHeroNews() {
		return HeroNews;
	}

	public WebElement getAmaarHero() {
		return AmaarHero;
	}

	public WebElement getHeroJoyride() {
		return HeroJoyride;
	}

	public WebElement getBlogs() {
		return Blogs;
	}

	public WebElement getOtherNewsPageText() {
		return OtherNewsPageText;
	}

	public WebElement getHeroJoyridePageText() {
		return HeroJoyridePageText;
	}

	public WebElement getOtherBlogsPageText() {
		return OtherBlogsPageText;
	}

	

//=============================================================================================================
	
	public void click_on_amaar_hero_icon() {
     pageTitle="Amaar Hero - a motorcycle financing solutions by Niloy Motors Ltd.";
	 Library.click(driver, hw.getAmaarHero(), "Amaar Hero icon");
	 Library.threadSleep(2000);
	}
	public void verify_new_window_and_close() {
//	 String pageTitle="Amaar Hero - a motorcycle financing solutions by Niloy Motors Ltd.";
     Library.verify_new_window_and_close(driver, pageTitle);		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
