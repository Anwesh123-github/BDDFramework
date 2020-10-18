package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.net.MalformedURLException;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before //must be from cucumber
     public void setup() throws MalformedURLException {
        driverFactory.openbrowser();
    }

    @After //must be from cucumber
    public void teardown() throws InterruptedException {
        driverFactory.closebrowser();
    }

}
