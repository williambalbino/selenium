package factory;

import config.ConfigProperties;
import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    WebDriver driver;
    String remote_url = "http://localhost:4444";

    public WebDriver createLocalDriver(String browser){

        if(ConfigProperties.property.getProperty("browser").equalsIgnoreCase("chrome")){
            return driver = new DriverManager().createChromeDriver();
        } else if (ConfigProperties.property.getProperty("browser").equalsIgnoreCase("firefox")){
            return driver = new DriverManager().createFirefoxDriver();
        }
        return null;
    }

    public RemoteWebDriver createRemoteInstance(String browser) throws MalformedURLException {

        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--headless=new");
            options.addArguments("--remote-allow-origins=*");
            System.out.println("Browser Started :"+ browser);
            return new RemoteWebDriver(new URL(remote_url), options);

        } else if (browser.equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("-headless");
            System.out.println("Browser Started :"+ browser);
            return new RemoteWebDriver(new URL(remote_url), options);
        } else if (browser.equalsIgnoreCase("edge")){
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("-headless");
            System.out.println("Browser Started :"+ browser);
            return new RemoteWebDriver(new URL(remote_url), options);
        }
        return null;


    }
}
