package factory;

import manager.ChromeDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public WebDriver createInstance(String browser){

        WebDriver driver;
        BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());

        driver = switch (browserType) {
            case CHROME -> new ChromeDriverManager().createDriver();
            case FIREFOX -> null;
            case EDGE -> null;
            case SAFARI -> null;
        };

        return driver;
    }

}
