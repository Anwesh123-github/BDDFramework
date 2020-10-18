package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageExpedia extends DriverFactory {

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

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]")
    WebElement monthbox;



    @FindBy(css = ".uitk-new-date-picker-day ")
    WebElement date;





}
