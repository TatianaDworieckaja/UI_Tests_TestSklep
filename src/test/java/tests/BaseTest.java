package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.MainPage;
import utils.Browser;

public class BaseTest {

    @BeforeTest
    public void initDriver(){
        MainPage mainPage = new MainPage();
        mainPage.openMainPage();

    }

    @AfterTest
    public void closeDriver(){
        Browser.close();
    }
}
