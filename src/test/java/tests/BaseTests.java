package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.ProjectProperties;

public class BaseTests {

    protected static WebDriver webDriver;
    protected static HomePage homePage;

    @BeforeClass
    public void launchApplication() {
        webDriver = createDriver();
        webDriver.get(ProjectProperties.getBaseUrl());
        homePage = new HomePage(webDriver);
    }

    @AfterClass(alwaysRun=true)
    public void closeDriver(){
        webDriver.quit();
    }

    public static WebDriver createDriver() {
        switch (ProjectProperties.getBrowserType()) {
            case "FIREFOX":
                webDriver = new FirefoxDriver();
                break;
            case "EDGE":
                webDriver = new EdgeDriver();
                break;
            default:
                webDriver = new ChromeDriver();
        }
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
