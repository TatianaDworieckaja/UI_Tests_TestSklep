package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver createDriver() {
        WebDriver webDriver;
        switch (ProjectProperties.getBrowserType()) {
            case "FIREFOX":
                webDriver = new FirefoxDriver();
                break;
            case "EDGE":
                webDriver = new EdgeDriver();
                break;
            default:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                webDriver = new ChromeDriver(options);
        }
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
