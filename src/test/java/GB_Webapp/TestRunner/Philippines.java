package GB_Webapp.TestRunner;
//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//FeatureFilesPhilippines/01_HomePage.feature",".//FeatureFilesPhilippines/02_PhilippinesBikeFeature.feature",".//FeatureFilesPhilippines/03_Dealer.feature",
					".//FeatureFilesPhilippines/04_Service.feature",".//FeatureFilesPhilippines/05_AboutHero.feature"
					},
		glue="GB_Webapp.StepDefinition",
		dryRun = false,				// if check test case method present or not as per feature file
		monochrome = true,
		tags = "@Philippines",  //@HomePage , @BikeFeature , @Dealers , @Service , @AboutHero , @Philippines
		plugin = {"summary",        // Using "pretty" console displayed each & every scenario and "summary" not display scenario
				  "html:Reports/cucumber_reports.html",
		          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"				  
		          }
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtetCucumberAdapter:"}
//		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"n
		)


//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class Philippines extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
//	@Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}
