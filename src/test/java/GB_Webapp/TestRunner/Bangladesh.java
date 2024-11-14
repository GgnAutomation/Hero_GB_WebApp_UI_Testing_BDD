package GB_Webapp.TestRunner;
//import org.junit.runner.RunWith;


import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//FeatureFilesBangladesh/01_LoginFeature.feature",".//FeatureFilesBangladesh/02_BikeFeature.feature",".//FeatureFilesBangladesh/03_Service.feature",
					".//FeatureFilesBangladesh/04_HeroWorld.feature",".//FeatureFilesBangladesh/05_AboutHero.feature"
					},
		glue="GB_Webapp.StepDefinition",
		dryRun = false,				// if check test case method present or not as per feature file
		monochrome = true,
		tags = "@Bangladesh",       //@HomePage , @BikeFeature , @Dealers , @Service , @AboutHero , @Bangladesh
		plugin = {"summary",        // Using "pretty" console displayed each & every scenario and "summary" not display scenario
				  "html:Reports/cucumber_reports.html",
		          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)


//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class Bangladesh extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
//	@Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}
