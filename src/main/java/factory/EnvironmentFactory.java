package factory;

import config.ConfigProperties;
import org.openqa.selenium.WebDriver;

public class EnvironmentFactory {

    public WebDriver createInstance(String env){

        if(env.equals("local")){
            return new DriverFactory().createLocalDriver(ConfigProperties.property.getProperty("browser"));
        }
        return null;
    }

//    private RemoteWebDriver createRemoteInstance(MutableCapabilities capability) {
//        RemoteWebDriver remoteWebDriver;
//        String gridURL = format("http://%s:%s", configuration().gridUrl(), configuration().gridPort());
//        try {
//            remoteWebDriver = new RemoteWebDriver(URI.create(gridURL).toURL(), capability);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//        return remoteWebDriver;
//    }

}
