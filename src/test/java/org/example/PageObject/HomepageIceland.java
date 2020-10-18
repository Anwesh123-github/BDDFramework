package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageIceland extends DriverFactory {

    @FindBy(xpath = "//input[@id='header-search']")
    WebElement searchbox;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")
    WebElement magnifierglass;

    public void IcelandSearchBox(String item){
        searchbox.sendKeys("crisps");
        magnifierglass.click();

    }

    public void AssertIcelandPage(){
        String actualcrispresult = driver.getCurrentUrl();
        Assert.assertThat(actualcrispresult, Matchers.containsString("https://www.iceland.co.uk/food-cupboard/crisps-nuts-and-snacks"));
    }

    public void IcelandHomepage(){
        String actualhomepage = driver.getCurrentUrl();
        Assert.assertThat(actualhomepage,Matchers.containsString("https://www.iceland.co.uk/"));
    }


}
