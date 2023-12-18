package org.setpdefinition;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Base.BaseClase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class CommonHooks  extends BaseClase {
    Scenario scenario;

    // Setup method - runs before each scenario
    @Before
    public void setUp() {

    }



        @After
        public void tearDown(Scenario scenario) {
            if (scenario.isFailed()) {
                // Take screenshot
                TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
                byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);

            }

            // Close the WebDriver after each scenario
            if (driver != null) {
                driver.quit();
            }
        }
    }

