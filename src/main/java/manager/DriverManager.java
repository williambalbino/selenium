package manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

    public WebDriver createChromeDriver(String browser) {
        WebDriverManager.getInstance(browser).setup();
        return new ChromeDriver();
    }

    public WebDriver createFirefoxDriver(String browser) {
        WebDriverManager.getInstance(browser).setup();
        return new FirefoxDriver();
    }

    public WebDriver createEdgeDriver(String browser) {
        WebDriverManager.getInstance(browser).setup();
        return new EdgeDriver();
    }

    public WebDriver createSafariDriver(String browser) {
        WebDriverManager.getInstance(browser).setup();
        return new SafariDriver();
    }
}
