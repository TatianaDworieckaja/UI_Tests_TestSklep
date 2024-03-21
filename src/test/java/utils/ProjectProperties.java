package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectProperties {
    private static Properties properties;

    public static  Properties getProperties(){
       properties = new Properties();
        try (final InputStream inputStream = ProjectProperties.class.getClassLoader().getResourceAsStream("project.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
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

    public static void main(String[] args) {
        ProjectProperties projectProperties = new ProjectProperties();
        System.out.println(projectProperties.getBaseUrl());
    }

}
