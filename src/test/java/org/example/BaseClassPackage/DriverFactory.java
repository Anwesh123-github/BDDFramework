package org.example.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory() {
        PageFactory.initElements(driver,this);
    }

    public void openbrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://letskodeit.teachable.com/p/practice");
        driver.get("https://www.argos.co.uk/");
        //driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");

        driver.manage().window().maximize();
    }

    public void closebrowser() {
        //driver.quit();
    }

}
