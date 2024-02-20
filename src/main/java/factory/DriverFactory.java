package factory;

import config.ConfigProperties;
import manager.DriverManager;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    WebDriver driver;
    public WebDriver createLocalDriver(String browser){

        if(ConfigProperties.property.getProperty("browser").equalsIgnoreCase("chrome")){
            return driver = new DriverManager().createChromeDriver();
        } else if (ConfigProperties.property.getProperty("browser").equalsIgnoreCase("firefox")){
            return driver = new DriverManager().createFirefoxDriver();
        }
        return null;
    }
}
