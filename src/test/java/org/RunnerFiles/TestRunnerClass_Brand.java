package org.RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/org/featurefies/brandPages", glue ={"org.setpdefinition","CommonHooks"},
monochrome = true,dryRun = false,
plugin ={"pretty","html:target/Cucumber-HTML-report/report.html", "junit:target/Cucumber-junit/junitreport.xml", "json:target/Cucumber-Jason-report/jsonreport.json"}
,tags = "@IP003")


public class TestRunnerClass_Brand {

}


