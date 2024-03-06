package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static Properties properties;

    public static Properties getProperties(){
        if(properties==null){
            properties = new Properties();
            try {
                properties.load(new FileInputStream("src/test/resources/project.properties"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return properties;
    }

    public static String getBaseUrl(){
        return getProperties().getProperty("baseUrl");
    }

    public static String getBrowserType(){
        return getProperties().getProperty("browserType");
    }

    public static String getTestRegEmail(){
        return getProperties().getProperty("testRegEmail");
    }

    public static String getTestRegPassword(){
        return getProperties().getProperty("testRegPassword");
    }
}
