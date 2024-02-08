package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver;
    public static final String URL = "https://demoqa.com/automation-practice-form";

    @BeforeMethod
    static void webdrivermanagerSetup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);

        driver = new ChromeDriver(options);

        driver.get(URL);
    }

    @AfterMethod
    static void quitBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
