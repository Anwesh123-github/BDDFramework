package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends DriverFactory {

    @FindBy(xpath = "//div[@class='styles__Container-sc-1h5mbdb-0 gCgRbH xs-12--none lg-9--none xs-stack']//div[1]//div[2]//button[1]")
    WebElement AddtoTrolleybutton;

    public void AddtoTrolley(){
        AddtoTrolleybutton.click();
    }

    @FindBy(xpath = "//a[@class='Buttonstyles__Button-q93iwm-2 dUQXJf']")
    WebElement GoToTrolleybutton;

    public void GotoTrolley(){
        GoToTrolleybutton.click();
    }

    public void BasketresultURL() {
        String actualbasketURL = driver.getCurrentUrl();
        Assert.assertThat(actualbasketURL, Matchers.containsString("https://www.argos.co.uk/basket"));

    }




} //end of class
