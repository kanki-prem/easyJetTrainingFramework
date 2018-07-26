package com.easyJet.trianing;

import com.easyJet.trianing.utils.DriverHelpers;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private Scenario scenario;
    private DriverHelpers driverHelpers;

    public Hooks(DriverHelpers diDriverHelpers) {
        this.driverHelpers = diDriverHelpers;
    }

    @Before
    public void openBrowser(Scenario diScenario) {
        this.scenario = diScenario;
//        driverHelpers.selectBrowser().maximizeWindow().navigateTo();
    }

    @After
    public void closeBrowser() {
        if(scenario.isFailed()){
            this.driverHelpers.embedScreenshot(scenario);
        }
//        this.driverHelpers.getDriver().quit();
    }
}
