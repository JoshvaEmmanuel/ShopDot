package org.setpdefinition;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;
import org.Base.BaseClase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class HooksClass extends BaseClase{

	@Before
    public void setUp() {

    }

	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png", scenario.getName());

		}
	}
	@After
    public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			screenShot(scenario.getName());

		}
		driver.close();
	}



	}


