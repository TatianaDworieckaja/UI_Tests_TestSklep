package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectProperties {
    private  Properties properties;

    public  ProjectProperties(){
       properties = new Properties();
        try (final InputStream inputStream = ProjectProperties.class.getClassLoader().getResourceAsStream("project.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  String getBaseUrl(){
        return properties.getProperty("baseUrl");
    }

    public  String getBrowserType(){
        return properties.getProperty("browserType");
    }

    public  String getTestRegEmail(){
        return properties.getProperty("testRegEmail");
    }

    public  String getTestRegPassword(){
        return properties.getProperty("testRegPassword");
    }

    public static void main(String[] args) {
        ProjectProperties projectProperties = new ProjectProperties();
        System.out.println(projectProperties.getBaseUrl());
    }

}
