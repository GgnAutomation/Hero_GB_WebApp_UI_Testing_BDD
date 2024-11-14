package GB_Webapp.Utility;

/**
 * 
 *@author Prathmesh.Mahure
 * 
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.ByteArrayInputStream;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import net.bytebuddy.utility.RandomString;

public class Log extends PageClassObject{
	
	public static ExtentReports extent;
	public static ExtentTest extentLogger; // helps to generate logs in extent test report
	public static ExtentSparkReporter reporter;
//	public static final Logger LOGGER = LogManager.getLogger(BaseTest.class);
	public static final Logger LOGGER = LogManager.getLogger("Log");
//=========================================================================================================================	
	public static void info(String message) {
	//	String LogMessege=Library.addSpaceBeforeUppercase(message);
		LOGGER.info(message);
		extentLogger.log(Status.PASS, message);	
		Allure.step(message);
	}
//=========================================================================================================================
	public static void debug(String message) {
		LOGGER.debug(message);
		extentLogger.log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.YELLOW));
		}
//=========================================================================================================================
	public static void warn(String message) {
		LOGGER.info(message);
		extentLogger.log(Status.WARNING, MarkupHelper.createLabel(message, ExtentColor.YELLOW));
		Allure.step(message);
	}
//=========================================================================================================================
	public static void ChromeFocus() {
		extentLogger.addScreenCaptureFromPath(BaseTest.takeScreenshot()); // Imp ScreenShot		
	}
//=========================================================================================================================
	public static void AddScreenshot() {
		extentLogger.addScreenCaptureFromBase64String(BaseTest.getscreenshot());	
	}
//=========================================================================================================================
	public static void error(String message) {
		LOGGER.error(message);
			//		extentLogger.log(Status.FAIL, message);
		extentLogger.log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));	
		extentLogger.addScreenCaptureFromBase64String(BaseTest.getscreenshot());
			//		BaseTest.takeScreenshot();
		captureScreenshot(message);    // allure report parts
		Allure.step(" Error -: "+message);
	}	
//=========================================================================================================================
	

	public static void initialiseExtentReport(Logger LOGGER) {
		LOGGER.debug("====================================================================================");
		LOGGER.debug("==========================      Configuring Extent Report      =====================");
		LOGGER.debug("====================================================================================");
//		String timeStamp = new SimpleDateFormat("dd_MM_yyyy__HH_mm_ss").format(new Date());
		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//ExtentReport.html");
//		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//ExtentReport"+" " + timeStamp + ".html");
//		((Object) reporter.config()).setChartVisibilityOnOpen(false);
		reporter.config().setDocumentTitle("Hero GB WEBAPP");
		reporter.config().setReportName("Hero GB WebApp Automation Report");
//		reporter.config().setTestViewChartLocation(ChartLocation.TOP);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		extent = new ExtentReports();
		extent.attachReporter(Log.reporter);
		extent.setSystemInfo("Project Name", "Hero GB WebApp");
		extent.setSystemInfo("Platform", "Web Application");
		extent.setSystemInfo("Test Environment", "Production");
		extent.setSystemInfo("Test Suite", "Regression Tests");
//		extent.setSystemInfo("Device", "Pixel 4");
		extent.setSystemInfo("Test Engineer", "Prathmesh Mahure");
	}
//=========================================================================================================================
	public static void flushExtent(Logger LOGGER) {
		LOGGER.debug("===================      Flushing Extent Report      ==============================");
		extent.flush();
	}
//=========================================================================================================================
	public static void afterMethodLogResultBDD(Scenario scenario, WebDriver driver) throws IOException {
		    if (scenario.isFailed()) {
		        extentLogger.log(Status.FAIL,
		                MarkupHelper.createLabel("TEST FAILED -- " + scenario.getName(), ExtentColor.RED));
		    } 
		    else if (scenario.getStatus().toString().equalsIgnoreCase("SUCCESS")) {
		        extentLogger.log(Status.PASS,
		                MarkupHelper.createLabel("TEST PASSED -- " + scenario.getName(), ExtentColor.GREEN));
		    } 
		    else if (scenario.getStatus().toString().equalsIgnoreCase("SKIPPED")) {
		        extentLogger.log(Status.SKIP,
		                MarkupHelper.createLabel("TEST SKIPPED -- " + scenario.getName(), ExtentColor.ORANGE));
		    } 
	    }
//=========================================================================================================================
	public static String takeScreenshot1111(String string, WebDriver driver) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyy-hhmmss");
		String strDate = formatter.format(date);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//Reports//FailedTestScreenShots//"+strDate +"_"+ RandomString.make(2) +"_"+  string + ".jpg";
		try {
			Files.copy(srcFile, new File(path));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
	}
//=========================================================================================================================	
//=========================================================================================================================	
//=========================================================================================================================	
//================================================ Allure Report Area =====================================================	
	
	public static void captureScreenshot(String screenshotName) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot = " + screenshotName, "image/png", new ByteArrayInputStream(screenshot), ".png");
    }
	
	
///// All Exception identify sample code /////  but not use in our code

    public static void main(String[] args) {
        try {
            // Code that may throw exceptions related to Selenium/Appium
        } catch (Exception e) {
        	solutionsForException(e);
        }
    }

    // Method to handle exceptions and provide resolutions based on exception name
    public static void solutionsForException(Exception e) {
        String exceptionName = e.getClass().getSimpleName(); // Get the exception class name as a string

        switch (exceptionName) {
            case "NoSuchElementException":
                System.out.println("No Such Element Exception: " + e.getMessage());
                System.out.println("Solution: Check if the element's locator is correct or if it exists on the current page.");
                break;

            case "TimeoutException":
                System.out.println("Timeout Exception: ");
                System.out.println("Solution: Increase the wait time or verify if the network is stable.");
                ((JavascriptExecutor) driver).executeScript("window.open()");
                break;

            case "StaleElementReferenceException":
                System.out.println("Stale Element Reference Exception: " + e.getMessage());
                System.out.println("Solution: Refresh the page or re-fetch the element before interacting with it.");
                break;

            case "ElementNotInteractableException":
                System.out.println("Element Not Interactable Exception: " + e.getMessage());
                System.out.println("Solution: Ensure the element is visible and enabled before interacting, or scroll it into view.");
                break;

            case "WebDriverException":
                System.out.println("WebDriver Exception: " + e.getMessage());
                System.out.println("Solution: Check the WebDriver configuration or restart the WebDriver session.");
                break;

            case "SessionNotCreatedException":
                System.out.println("Session Not Created Exception: " + e.getMessage());
                System.out.println("Solution: Verify compatibility between the WebDriver, browser version, and driver path.");
                break;

            case "InvalidElementStateException":
                System.out.println("Invalid Element State Exception: " + e.getMessage());
                System.out.println("Solution: Check if the element supports the intended action (e.g., sending keys to a disabled field).");
                break;

            case "NoSuchWindowException":
                System.out.println("No Such Window Exception: " + e.getMessage());
                System.out.println("Solution: Verify that the window handle exists and has not been closed.");
                break;

            case "InvalidSelectorException":
                System.out.println("Invalid Selector Exception: " + e.getMessage());
                System.out.println("Solution: Check the syntax of the locator used in the selector (XPath/CSS).");
                break;

            case "ElementClickInterceptedException":
                System.out.println("Element Click Intercepted Exception: " + e.getMessage());
                System.out.println("Solution: Use JavaScript click or ensure no other element is overlapping the target element.");
                break;

            case "MoveTargetOutOfBoundsException":
                System.out.println("Move Target Out of Bounds Exception: " + e.getMessage());
                System.out.println("Solution: Ensure the target element is within the screen viewable area by scrolling.");
                break;

            case "UnhandledAlertException":
                System.out.println("Unhandled Alert Exception: " + e.getMessage());
                System.out.println("Solution: Handle the alert by accepting, dismissing, or checking for the alert presence before interacting.");
                break;

            case "NotFoundException":
                System.out.println("Not Found Exception: " + e.getMessage());
                System.out.println("Solution: Verify the locator and that the element exists on the page.");
                break;

            case "IOException":
                System.out.println("IO Exception: " + e.getMessage());
                System.out.println("Solution: Check file paths, network connections, or permissions causing the IO issue.");
                break;

            case "NullPointerException":
                System.out.println("Null Pointer Exception: " + e.getMessage());
                System.out.println("Solution: Initialize the object reference before accessing it.");
                break;

            default:
                System.out.println("An unexpected exception occurred: " + e.getMessage());
                e.printStackTrace();
                System.out.println("Solution: Investigate the stack trace for potential causes.");
                break;
        }
    }
	
	
	
	

	
	
	
	
	
	
	
	
	
}
