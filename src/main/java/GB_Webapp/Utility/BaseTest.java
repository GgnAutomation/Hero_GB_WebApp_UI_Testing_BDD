package GB_Webapp.Utility;
/**
 * 
 * @author Prathmesh.Mahure
 * 
 */
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import net.bytebuddy.utility.RandomString;

public class BaseTest extends PageClassObject {
	
	

	public static void configureApp() throws Exception  {
		deleteAllureReportFolder();  // delete folder if exists every time execution starts
		GB_Webapp.Utility.Log.initialiseExtentReport(LOGGER);		
		LOGGER.debug("====================================================================================");
		LOGGER.debug("   *********************   Launching Hero GB UI Test WebApp    ******************");
		LOGGER.debug("====================================================================================");
		launchBrowser();
		System.out.println("Session ID:" + ((RemoteWebDriver) driver).getSessionId());
	}
	
	public void beforeClass()  {
		
	}
	
	
	public static void beforeMethod( Scenario method ) {
		GB_Webapp.Utility.Log.extentLogger = Log.extent.createTest(method.getName());
		Allure.getLifecycle().updateTestCase(tc -> tc.setName(method.getName()));
//		Log.extentLogger = Log.extent.createTest(result.getTestClass().getName() + "=" +method.getName());
		LOGGER.debug("====================================================================================");
		LOGGER.debug("====================================================================================");
		LOGGER.debug("                   Start -> Test -> " + method.getName() + "    ");
		LOGGER.debug("                   ===============================================");
	}

	public void afterMethod(Scenario method) throws Exception  {
		GB_Webapp.Utility.Log.afterMethodLogResultBDD(method, driver);

//		LOGGER.debug("====================================================================================");
	}

	public void afterClass()  {
		LOGGER.debug("====================================================================================");
		LOGGER.debug("====================================================================================");
		LOGGER.debug("*******************        Next Class suite      ***********************");
		LOGGER.debug("====================================================================================");
//		reloadBrowser();
	}

	public static void tearDown() {
		LOGGER.debug("====================================================================================");
		LOGGER.debug("====================================================================================");
		LOGGER.debug("*******************         Driver Quit       ***********************");
		LOGGER.debug("====================================================================================");
		GB_Webapp.Utility.Log.flushExtent(LOGGER);
		driver.quit();
	
	}
//=========================================================================================================================
//=========================================================================================================================
//=========================================================================================================================
//=========================================================================================================================
//=========================================================================================================================
	@SuppressWarnings("deprecation")
	public static void launchBrowser() throws  Exception {		
		
		String browser = ConfigeDataProvider.browser;
		String URL= hero_Gb_Zambia_ProdUrl;
		
		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
				ChromeOptions co = new ChromeOptions();			
				HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
				HashMap<String, Object> profile = new HashMap<String, Object>(); 
				HashMap<String, Object> prefs = new HashMap<String, Object>();
	
				contentSettings.put("notifications", 1);// 0 is ask  , 1 is allow , 2 is block
				contentSettings.put("geolocation", 1);
				contentSettings.put("media_stream", 1);
				profile.put("managed_default_content_settings", contentSettings);
			//	prefs.put("profile.managed_default_content_settings.images", 2);  // 2 means disable UI images
			//	prefs.put("profile.managed_default_content_settings.stylesheets", 2); // 2 means disable UI images
				prefs.put("profile", profile);
				co.setExperimentalOption("prefs", prefs);		
				co.addArguments("fast");
				co.addArguments("--remote-allow-origins=*");
		    	co.addArguments("--disable-blink-features=AutomationControlled");
		    	co.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		    	co.addArguments("--incognito");
				co.addArguments("disable-infobars");
				co.addArguments("disable-extensions");
				co.addArguments("disable-gpu");
				co.addArguments("disable-dev-shm-usage");
				co.addArguments("no-sandbox");
				co.addArguments("disable-notifications");
		    	co.addArguments("--force-device-scale-factor=0.9");
		    	driver = new ChromeDriver(co);			    	
		    	driver.get(URL);	
		    	driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
				

			break;

		case "msedge":
			 EdgeOptions options = new EdgeOptions();
		        
		        // Add multiple arguments
		        options.addArguments("--start-maximized");
		        options.addArguments("--disable-infobars");
		        options.addArguments("--disable-extensions");
		        options.addArguments("--incognito");
		        options.addArguments("--force-device-scale-factor=0.9");
		        // Initialize WebDriver with EdgeDriver and the specified options
		        driver = new EdgeDriver(options);	
			    driver.get(URL);		
		    	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			
			break;

		case "firefox":
			FirefoxOptions firefoxoptions = new FirefoxOptions();

	        // Add options if needed
			firefoxoptions.addArguments("--start-maximized");
			firefoxoptions.addArguments("--disable-infobars");
			firefoxoptions.addArguments("--disable-extensions");
	        // Initialize WebDriver with FirefoxDriver
	        driver = new FirefoxDriver(firefoxoptions);
	        driver.get(URL);	
	        jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("document.body.style.zoom='70%'");  // Set the zoom level to 90% using JavaScript (equivalent to scaling factor 0.9)

	        
			break;
		default:
			driver = null;
			break;

		}
		
	}	
//	co.addArguments("--headless");   //   Hiding chrome browser
//	co.addArguments("start-maximized");
//=========================================================================================================================
	public static void quitBrowser() {
		Library.threadSleep(1000);
		driver.quit();
	}	
//=========================================================================================================================
	public static void reloadBrowser() {
		driver.get(hero_hub_url);
	}	
//=========================================== Screenshot area ==============================================================================
	public static String getscreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver ;
		return ts.getScreenshotAs(OutputType.BASE64);	
	}
//=========================================================================================================================	
	public static String takeScreenshot() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyy-hhmmss");
		String strDate = formatter.format(date);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//Reports//ChromeTestScreenShots//"+strDate +"_"+ RandomString.make(5) +"_" + ".jpg";
		try {
			Files.copy(srcFile, new File(path));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
	}
//=========================================================================================================================	
//	@AfterStep add screenshot to scenario
	public static void addScreenshot(Scenario scenario){

		if (scenario.isFailed()) {
		    String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		    byte[] screenshot = java.util.Base64.getDecoder().decode(screenshotBase64);
		    scenario.attach(screenshot, "image/png", scenario.getName());
		}
		
	}
//=========================================================================================================================		
	public static void handlePopup() {
		try{
			driver.findElement(By.xpath("//i[@onclick=\"hideModal('requestCallBackModel')\"]")).click();
		}catch(Exception e) {
			
		}
	}
//=========================================================================================================================		
	public static void deleteAllureReportFolder() {
		try {
        File reportFolder = new File("allure-results");
        if (reportFolder.exists()) {
            for (File file : reportFolder.listFiles()) {
                file.delete();
            }
            reportFolder.delete();
//            System.out.println(" Allure Report Folder deleted successfully");
        }else {
        	System.out.println(" Folder does not exist");
        }
		}catch(Exception e) {
			System.out.println(" Unable to delete Allure Report Folder"+e.getMessage());
		}
    }
//=========================================================================================================================		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
