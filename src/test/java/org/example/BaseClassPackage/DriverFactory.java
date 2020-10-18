package org.example.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory() {
        PageFactory.initElements(driver,this);
    }

    //public static final String AUTOMATE_USERNAME = "anweshthapa1";
    //public static final String AUTOMATE_ACCESS_KEY = "TRaAUZPFNKqPig3Tqy7b";
    //public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public void openbrowser() throws MalformedURLException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability("os_version", "10");
        //caps.setCapability("resolution", "1920x1080");
       // caps.setCapability("browser", "IE");
       // caps.setCapability("browser_version", "11.0");
       // caps.setCapability("os", "Windows");
        //caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
        //caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name

       // DesiredCapabilities caps = new DesiredCapabilities();
       // caps.setCapability("os_version", "11");
       // caps.setCapability("device", "iPhone 8 Plus");
       // caps.setCapability("real_mobile", "true");
        //caps.setCapability("browserstack.local", "false");

        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability("os", "Windows");
        //caps.setCapability("os_version", "10");
        //caps.setCapability("browser", "Firefox");
        //caps.setCapability("browser_version", "latest-beta");
        //caps.setCapability("browserstack.local", "false");
        //caps.setCapability("browserstack.selenium_version", "3.5.2");

        //driver = new RemoteWebDriver(new URL(URL), caps);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://letskodeit.teachable.com/p/practice");
       // driver.get("https://www.argos.co.uk/");
        //driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        //driver.get("https://www.expedia.co.uk/");
        driver.get("https://www.iceland.co.uk/");

        driver.manage().window().maximize();
    }

    public void closebrowser() throws InterruptedException {
        Thread.sleep(10000);
        //driver.quit();
    }

}
