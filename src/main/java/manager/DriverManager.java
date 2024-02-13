package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    public WebDriver createChromeDriver() {
        return new ChromeDriver();
    }

    public WebDriver createFirefoxDriver() {
        return new FirefoxDriver();
    }

    public WebDriver createEdgeDriver() {
        return new EdgeDriver();
    }
}
