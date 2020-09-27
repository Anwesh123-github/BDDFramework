package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ResultPage extends DriverFactory {
    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement magnifierGlass;

    @FindBy(xpath = "//span[contains(text(),'Travel')]")
    WebElement Category;

    @FindBy(xpath = "//label[@id='filter-price-£5 - £10-label']//div[@class='checkboxWrapper']")
    WebElement PriceRange;

    @FindBy(xpath = "//span[contains(text(),'Sports and fitness')]")
    WebElement SportsnFitnesscategory;

    public void getHomePageURL() {
        String actual = driver.getCurrentUrl();
        Assert.assertThat(actual, Matchers.containsString("https://www.argos.co.uk/"));
    } //end of gethomeurl

    public void dosearch(String nike) {
        SearchTextBox.sendKeys("nike");
        magnifierGlass.click();
    } //end of dosearch

    public void getResultPageURL() {
        String actualNikeResult = driver.getCurrentUrl();
        Assert.assertThat(actualNikeResult,Matchers.containsString("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike"));
    } //end of getresulturl

    public void travelclick(){Category.click();
    }

    public void getTravelPageURL() {
        String actualTravelResult = driver.getCurrentUrl();
        Assert.assertThat(actualTravelResult,Matchers.containsString("https://www.argos.co.uk/search/nike/category:799634/"));
    }

    public void priceclick() {
        PriceRange.click();
    }



    public void getPriceURL(){
        String actualPriceResult = driver.getCurrentUrl();
        Assert.assertThat(actualPriceResult,Matchers.containsString("https://www.argos.co.uk/search/nike/category:799634/price:%C2%A35-%252D-%C2%A310/"));
    }

    public void SportsnFitnessclick(){
        SportsnFitnesscategory.click();
    }

    public void getSportsURL() {
        String actualSportResult = driver.getCurrentUrl();
        Assert.assertThat(actualSportResult,Matchers.containsString("https://www.argos.co.uk/search/nike/category:799635/"));
    }

} //end of class
