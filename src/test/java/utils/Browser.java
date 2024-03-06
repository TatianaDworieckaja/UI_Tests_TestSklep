package utils;

import org.openqa.selenium.WebDriver;

public class Browser {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            initDriver();
        }
        return driver;
    }

    public static void initDriver(){
        driver = BrowserFactory.createDriver();
    }

    public static void close() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
