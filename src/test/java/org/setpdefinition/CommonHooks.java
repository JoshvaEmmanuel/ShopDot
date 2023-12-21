package org.setpdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Base.BaseClase;



public class CommonHooks  extends BaseClase {

    // Setup method - runs before each scenario
    @Before
    public void setUp() {

    }

//     Cleanup method - runs after each scenario
    @After
    public void tearDown() {
//   driver.close();
    }
}
