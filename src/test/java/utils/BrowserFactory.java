package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

public class BrowserFactory {
    private static WebDriver driver;
    private static final Logger log = Logger.getLogger(BrowserFactory.class);

    public static WebDriver createDriver() {
        if (Settings.getBrowserType().equals("CHROME")) {
            driver = new ChromeDriver();
        } else {
            log.error(new IllegalArgumentException("Browser is not supported"));
        }
        driver.manage().window().maximize();
        return driver;
    }

}
