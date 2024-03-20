//package tests;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import pages.HomePage;
//import utils.BrowserFactory;
//import utils.ProjectProperties;
//
//public class BaseTests {
//
//    protected static WebDriver webDriver;
//    protected static HomePage homePage;
//    static{
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\tdworieckaja\\IdeaProjects\\UI_Tests_TestSklep\\chromedriver.exe" );
//    }
//
//    @BeforeClass
//    public void launchApplication() {
//        webDriver = BrowserFactory.createDriver();
//        //webDriver.get(ProjectProperties.getBaseUrl());
//        webDriver.navigate().to("https://skleptest.pl/");
//        homePage = new HomePage(webDriver);
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void closeDriver() {
//        webDriver.quit();
//    }
//}
