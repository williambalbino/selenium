package factory;

import config.ConfigProperties;
import enums.Environment;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class EnvironmentFactory {

    public WebDriver createInstance(String browser) throws MalformedURLException {
        Environment env = Environment.get(ConfigProperties.getEnvironment());

        return switch (env) {
            case LOCAL -> new DriverFactory().createLocalDriver(ConfigProperties.getBrowser());
            case SELENIUM_GRID -> new DriverFactory().createRemoteInstance(browser);
        };
    }



}
