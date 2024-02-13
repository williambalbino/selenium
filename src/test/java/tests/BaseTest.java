package tests;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver;
    public static final String URL = "https://demoqa.com/automation-practice-form";

    @BeforeMethod
    static void webdrivermanagerSetup() {
        String browser = "chrome";

        driver = new DriverFactory().createInstance(browser);

        driver.get(URL);
    }

    @AfterMethod
    static void quitBrowser() throws InterruptedException {
        driver.quit();
    }
}
