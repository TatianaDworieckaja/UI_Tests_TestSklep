package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProjectProperties {
    private  Properties properties;

    public  ProjectProperties(){
       properties = new Properties();
            try {
                properties.load(new FileInputStream("project.properties"));
            } catch (IOException e) {
                throw new RuntimeException(e);
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
