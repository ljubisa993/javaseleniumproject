package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import propertyManager.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseCommands {

    public WebDriver driver;
    public ChromeOptions options;

    @Before
    public void setup(){
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();

        //if webdriver manager doesn't work
       // System.setProperty("webdriver.chrome.driver",
       //         PropertyManager.getInstance().getDriverPath());

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After
    public void teardown (){
        driver.quit();
    }
}



