package GB_Webapp.TestRunner;
//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//FeatureFilesZambia/01_HomePage.feature",".//FeatureFilesZambia/02_ZambiaBikeFeature.feature",".//FeatureFilesZambia/03_Dealer.feature",
					".//FeatureFilesZambia/04_Service.feature",".//FeatureFilesZambia/05_AboutHero.feature"
					},
		glue="GB_Webapp.StepDefinition",
		dryRun = false,				// if check test case method present or not as per feature file
		monochrome = true,
		tags = "@Zambia",   //@HomePage , @BikeFeature , @Dealers , @Service , @AboutHero , @Zambia 
		plugin = {"summary",        // Using "pretty" console displayed each & every scenario and "summary" not display scenario
				  "html:Reports/cucumber_reports.html",
		          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		          }
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		)


//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class Zambia extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
//	@Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}

