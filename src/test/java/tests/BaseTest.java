package tests;

import config.ConfigProperties;
import factory.DriverFactory;
import factory.EnvironmentFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    static void webdrivermanagerSetup() throws IOException {
        ConfigProperties.initializePropertyFile();
        String env = ConfigProperties.property.getProperty("env");
        String url = ConfigProperties.property.getProperty("url.base");
        driver = new EnvironmentFactory().createInstance(env);
        driver.get(url);
    }

    @AfterMethod
    static void quitBrowser() throws InterruptedException {
        driver.quit();
    }
}
