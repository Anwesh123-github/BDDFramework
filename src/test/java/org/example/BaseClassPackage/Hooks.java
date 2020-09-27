package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before //must be from cucumber
     public void setup(){
        driverFactory.openbrowser();
    }

    @After //must be from cucumber
    public void teardown() {
        driverFactory.closebrowser();
    }

}
