package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties  {

    public static Properties property;
    private static String configPath = "general.properties";

    public static void initializePropertyFile() throws IOException {
        property = new Properties();
        InputStream file = null;
        try {
            file = new FileInputStream(configPath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        property.load(file);
    }

    public static String getBrowser(){
        return ConfigProperties.property.getProperty("browser");
    }

    public static String getEnvironment(){
        return ConfigProperties.property.getProperty("env");
    }

    public static String getUrl(){
        return ConfigProperties.property.getProperty("url.base");
    }

}
