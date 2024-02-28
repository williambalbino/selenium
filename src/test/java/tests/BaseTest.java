package tests;

import config.ConfigProperties;
import factory.EnvironmentFactory;
import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    static void setUp(String browser) throws IOException {
        ConfigProperties.initializePropertyFile();
        driver = new EnvironmentFactory().createInstance(browser);
        DriverManager.setDriver(driver);
        driver.get(ConfigProperties.getUrl());
    }

    @AfterMethod
    static void quitBrowser() throws InterruptedException {
        DriverManager.quit();
    }
}
