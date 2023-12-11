package org.setpdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/brandPages", glue = "org.setpdefinition",
monochrome = true,dryRun = true,
plugin ={"pretty","html:target/Cucumber-HTML-report/report.html", "junit:target/Cucumber-junit/junitreport.xml", "json:target/Cucumber-Jason-report/jsonreport.json"}
,tags = "@tag1")

public class TestRunnerClass_Brand {

}


