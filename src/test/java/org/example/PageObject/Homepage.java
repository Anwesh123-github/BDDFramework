package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement magnifierGlass; //searchbutton

    @FindBy (xpath = "//span[contains(text(),'Account')]")
    WebElement AccountButtonBox;

    @FindBy (xpath = "//header[@id='haas-v2']//a[3]")
    WebElement WishlistButton;



    public void getHomePageURL() {
        String actual = driver.getCurrentUrl();
        Assert.assertThat(actual, Matchers.containsString("https://www.argos.co.uk/"));
    } //end of gethomeurl

    public void dosearch(String item) {
        SearchTextBox.sendKeys(item);
        magnifierGlass.click();
    } //end of dosearch

    public void multipleSearch(String item){
        SearchTextBox.sendKeys(item);
        magnifierGlass.click();
    } //end of multiple search

    public void getResultPageURL() {
        String actualNikeResult = driver.getCurrentUrl();
        Assert.assertThat(actualNikeResult,Matchers.containsString("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike"));
    } //end of getresulturl

    public void clickbutton() {
        AccountButtonBox.click();
    }

    public void wishlistclick() {
        WishlistButton.click();
    }

    public void WishListResultURL() {
        String actualWishlistresult = driver.getCurrentUrl();
        Assert.assertThat(actualWishlistresult,Matchers.containsString("https://www.argos.co.uk/wishlist?clickOrigin=header:home:wishlist"));
    }


    @FindBy(xpath = "//span[contains(text(),'Flights')]")
    WebElement flightbutton;

    public void flightclick(){
        flightbutton.click();
    }

    @FindBy(xpath = "//button[@id='d1-btn']")
    WebElement departingbox;

    public void departingclick(){
        departingbox.click();
    }


    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/button[1]")
    WebElement alldates;

    public void departuredate() {
        alldates.click();





            }



    }//class ends
