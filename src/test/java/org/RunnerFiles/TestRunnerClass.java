package org.RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/RetailerPages/RetailerOnboarding.feature",glue ="org.retailerPageStep", monochrome = true, dryRun = false,
plugin = {"pretty","html:RetailerReport/Cucumber-html-report/report.html","junit:RetailerReport/Cucumber-junit/junitreport.xml","json:RetailerReport/Cucumber-Jason-report/jsonreport.json"})

public class
TestRunnerClass {

}

		
		