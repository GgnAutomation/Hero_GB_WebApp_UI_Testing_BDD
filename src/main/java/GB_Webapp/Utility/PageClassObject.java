package GB_Webapp.Utility;

/**
 * @author Prathmesh.Mahure
 * 
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import GB_Webapp.ExcelDataProvider.excelTestData;
import GB_Webapp.Page.ServicePage;
import GB_Webapp.Page.ZambiaBikeFeaturePage;
import GB_Webapp.Page.LoginPage;
import GB_Webapp.Page.AboutHeroPage;
import GB_Webapp.Page.BikeFeaturePage;
import GB_Webapp.Page.DealersPage;
import GB_Webapp.Page.HeroWorldPage;
import GB_Webapp.Page.HomePage;

public class PageClassObject extends ConfigeDataProvider{

	
	public static Logger LOGGER = LogManager.getLogger("Log");
	public static Log log;
	public static WebDriver driver;
	public static excelTestData exceldata;
	public static LoginPage loginPg;
	public static BikeFeaturePage bf;
	public static ServicePage sp;
	public static HeroWorldPage hw;
	public static AboutHeroPage ah;
	public static HomePage hp;
	public static JavascriptExecutor jsExecutor;
	public static ZambiaBikeFeaturePage zbf;     // new country added
	public static DealersPage dp;  // new country added
	
	
//	@BeforeMethod(alwaysRun = true)
	public static void getObject() {
		
		
		exceldata = new excelTestData();
		log = new Log();
		loginPg = new LoginPage(driver);
		bf = new BikeFeaturePage(driver);
		sp = new ServicePage(driver);
		hw = new HeroWorldPage(driver);
		ah = new AboutHeroPage(driver);
		hp = new HomePage(driver);
		jsExecutor = (JavascriptExecutor) driver;
		
		zbf = new ZambiaBikeFeaturePage(driver);
		dp = new DealersPage(driver);
		
	}

}
