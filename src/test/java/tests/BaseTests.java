package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.BrowserFactory;
import utils.ProjectProperties;

public class BaseTests {

    protected static WebDriver webDriver;
    protected static HomePage homePage;

    @BeforeClass
    public void launchApplication() {
        webDriver = BrowserFactory.createDriver();
        webDriver.get(ProjectProperties.getBaseUrl());
        homePage = new HomePage(webDriver);
    }

    @AfterClass(alwaysRun = true)
    public void closeDriver() {
        webDriver.quit();
    }
}
