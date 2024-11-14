package GB_Webapp.Utility;

/**
 * 
 * @author Prathmesh.Mahure
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Library {
	
//=============================================================================================
	public static void click( WebDriver driver,WebElement element, String LogMessege)  {
		try {
			waitForVisibilityOf(driver, element);
			moveToElement(driver, element);
			element.click();
			Log.info("Element is clickable : " + LogMessege);
		} catch (Exception e) {		
			Log.error("Unable to click element : " + LogMessege + "  --  " + element );
			Assert.assertTrue(false, "Unable to click element : " + LogMessege + "  --  " + element+ "  --  " + e);
		}
	}
//=============================================================================================
	public static void sendKeys(WebDriver driver, WebElement element, String enterValue, String LogMessege) {
		try {
			waitForVisibilityOf(driver ,element);
			element.click();
			element.clear();
			element.sendKeys(enterValue);
			Log.info("Value send Successfully : " + LogMessege);
		} catch (Exception e) {
			Log.error("Unable to send value  : " + LogMessege + " : "  + element);
			Assert.assertTrue(false, "Unable to send value  : " + LogMessege + " : "  + element+ "  --  " + e);
		}
	}
//=============================================================================================	
		public static void visible_link(WebDriver driver,WebElement element,String LogMessege) {
					
			try {
				waitForVisibilityOf(driver, element);
				moveToElement(driver, element);
				if(element.isDisplayed()) { 
				Log.info("Field is visible  : "+LogMessege);
				}else {
					Log.error("Unable to visible field  : " + LogMessege + "  --  " + element);
					Assert.assertTrue(false, "Unable to visible field  : " + LogMessege + "  --  " + element );
				}
		}
		catch(Exception e) {
			Log.error("Unable to visible field  : " + LogMessege + "  --  " + element);
			Assert.assertTrue(false, "Unable to visible field  : " + LogMessege + "  --  " + element+ "  --  " + e );
		}
	}
//=============================================================================================	
		public static void visible_link_gettext(WebDriver driver,WebElement element, String fieldname) {
			try {
				waitForVisibilityOf( driver,element);
				if(element.isEnabled() || element.isDisplayed()==true) {
					String text=element.getText();	
//					 System.out.println(text.isEmpty());
//					Assert.assertEquals(false, text.isEmpty(),"String text is Empty");
						if (text == null || text.isEmpty()) {
							Log.error("The string is null. : "+fieldname);
							Assert.assertTrue(false, "The string is null. : "+ fieldname);
				        } else {
				        	Log.info("Field is visible : "+fieldname+" : "+text);
				        }
				}else {
					Log.error("Unable to visible field : "+fieldname);		
					Assert.assertTrue(false, "Unable to visible field : "+fieldname );
				}
			}
			catch(Exception e) {
				
					Log.error("Unable to visible field : "+fieldname);		
					Assert.assertTrue(false, "Unable to visible field : "+fieldname+ "  --  " + e );
					}
			
		}		
//=============================================================================================	
	public static WebElement waitForVisibilityOf(WebDriver driver, WebElement element) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
//			Log.error("Timeout = Unable to load element  : " +"  --  " + element);		
//			Assert.assertTrue(false, "Timeout = Unable to load element  : " +"  --  "+element+ "  --  " + e );
		}
		return element;
	}
	public static WebElement waitForVisibilityOfTenSeconds(WebDriver driver, WebElement element) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			//Log.error("Unable to visible field  : " +"  --  " + element);
		}
		return element;
	}
//=============================================================================================
	public static void threadSleep(int MiliSeconds) {
		try {
			Thread.sleep(MiliSeconds);
//			Log.warn("Thread sleep : " + MiliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//=============================================================================================
	public static String getStringConfigData(String key) {
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//Config_Data//prod_config.Properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String PostURL = prop.getProperty(key);
		return PostURL;
	}
//=============================================================================================
	public static int getNumericConfigData(String key) {
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//Config_Data//prod_config.Properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String KeyValue = prop.getProperty(key);
		int intKeyValue = Integer.parseInt(KeyValue);
		return intKeyValue;
	}
//=============================================================================================
	public static String getExcelData(int SheetNumber, int RowNumber, int ColumnNumber) {
		String path = System.getProperty("user.dir") + "//src//test//resources//TestData//ExcelTestData.xlsx";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			String TestData = wb.getSheetAt(SheetNumber).getRow(RowNumber).getCell(ColumnNumber).getStringCellValue();
			return TestData;
		} catch (Exception e) {
			double TestData_InDouble = wb.getSheetAt(SheetNumber).getRow(RowNumber).getCell(ColumnNumber)
					.getNumericCellValue();
			String TestData = String.valueOf(TestData_InDouble);
			String TestDataAr[] = TestData.split("\\.");
			return TestDataAr[0];
		}
	} 
//=================================================================================================================================	    
	   public static void isDisplayed(WebDriver driver, WebElement ele, String Element_name) {
			try {
				waitForVisibilityOf( driver, ele);
				if(ele.isDisplayed()==true) {				
					Log.info(Element_name+":  Displayed");
				   }
				}
			catch(Exception e) {					
					Log.error(Element_name+":  Not Displayed"+e);					
					}
		}	   
//=================================================================================================================================	   
	   public static void assertEquals(WebDriver driver, WebElement ele, String Expected_value) {
			try {	
				waitForVisibilityOf(driver, ele);
				String Actual_value =ele.getText();
				if(Actual_value.equalsIgnoreCase(Expected_value)) {				
					Log.info( Expected_value+ ":  Expected value is Match");
				   }
				else {
				Log.error(Expected_value +":  Expected value is not Match");
				Assert.assertTrue(false, "Actual value "+ ":  Expected value is not Match");
				}
				}
			catch(Exception e) {					
					Log.error(Expected_value +":  Expected value is not Match"+e);	
					Assert.assertTrue(false, "Actual value "+ ":  Expected value is not Match");
				
					}
		}		   
//=================================================================================================================================	   
	   public static void assertEquals(WebDriver driver,String Actual_value, String Expected_value) {
			try {	
				
				if(Actual_value.equalsIgnoreCase(Expected_value)) {				
					Log.info( "Actual value "+Actual_value+ ":  Expected value is Match"+Expected_value);
				   }
				else {
				Log.error(Expected_value +":  Expected value is not Match");
				Assert.assertTrue(false, "Actual value "+Actual_value+ ":  Expected value is not Match"+Expected_value);
				}
				}
			catch(Exception e) {					
					Log.error(Expected_value +":  Expected value is not Match"+e);	
					Assert.assertTrue(false, "Actual value "+ ":  Expected value is not Match");
					}
		}	   
//=================================================================================================================================
	   public static void scrollwebpage(WebDriver driver, WebElement element,String message) {	
		   JavascriptExecutor js = (JavascriptExecutor) driver;              
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element);
	        actions.perform();
		// =============    
	        int attempts = 1;
	        int maxAttempts = 11;     // how many times try to click
	        while (attempts < maxAttempts) {
	            try {
	                element.click();
	                Log.info("Element is clickable : " + message);
	                break; // Exit loop if successful
	            } catch (ElementClickInterceptedException e) {
	               Library.threadSleep(1000);
	               BaseTest.handlePopup();
	               js.executeScript("window.scrollBy(0,250)", "");
	               js.executeScript("arguments[0].scrollIntoView(true);", element);
	               System.out.println("start while loop code"+ attempts);
	            }
	            attempts++;
	        }
	        if (attempts == maxAttempts) {
	            Log.error("Element is not clickable : " + message);
	            Assert.fail("Element is not clickable : " + message);
	        }        	   
		}    	 		   
//=================================================================================================================================
	public static void passmsg(String string) {
		
		Log.info( string );
	}
//=================================================================================================================================
	public static void failmsg(String string) {
		
		Log.error( string );
		Assert.fail("Fail msg : " + string);
	}
//=================================================================================================================================
	public static void verify_new_window_and_close(WebDriver driver,String pageTitle ) {
		Library.threadSleep(2000);
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    String title = driver.getTitle();
	    if(pageTitle.equalsIgnoreCase(title)) {
	    	Library.passmsg("New window is opened and page title verified");
	    	driver.close();
	    	driver.switchTo().window(tabs.get(0));
	    }else {
	    	Library.failmsg("New window is not open");
	    	try{
	    		driver.switchTo().window(tabs.get(1));
	    		driver.close();
	    	}catch(Exception e ) {}
	    }	    
	    driver.switchTo().window(tabs.get(0));		
	}
//=================================================================================================================================	
	public static void close_new_Window(WebDriver driver) {
		Library.threadSleep(1000);
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    try {
	    driver.switchTo().window(tabs.get(1));
	    driver.close();
	    }catch(Exception e) {
	    	 driver.switchTo().window(tabs.get(0));		
	    }
	    driver.switchTo().window(tabs.get(0));		
	}
//=================================================================================================================================	
	public static void open_new_Window_and_close_previous_Window(WebDriver driver , String CountryURL) {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(CountryURL);
        driver.switchTo().window(tabs.get(0)).close();
        driver.switchTo().window(tabs.get(1));

	}
//=================================================================================================================================	
	public static void moveToElement(WebDriver driver,WebElement element) {
		try {
			waitForVisibilityOf(driver, element);
		Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
		}catch(Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			for (int i=1; i<=5; i++) {
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		    
}
