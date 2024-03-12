package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.log4testng.Logger;

public class BrowserFactory {
    private static WebDriver driver;
    private static final Logger log = Logger.getLogger(BrowserFactory.class);

    public static WebDriver createDriver() {
        if (Settings.getBrowserType().equals("CHROME")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else {
            log.error(new IllegalArgumentException("Browser is not supported"));
        }
        driver.manage().window().maximize();
        return driver;
    }

}
