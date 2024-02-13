package factory;

import manager.DriverManager;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public WebDriver createInstance(String browser){

        WebDriver driver;
        BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());

        driver = switch (browserType) {
            case CHROME -> new DriverManager().createChromeDriver();
            case FIREFOX -> new DriverManager().createFirefoxDriver();
            case EDGE -> new DriverManager().createEdgeDriver();
        };

        return driver;
    }

}
