package pages;

import utils.Browser;
import utils.Settings;


public class MainPage extends BasePage{

    public void openMainPage() {
        Browser.getDriver().get(Settings.getBaseUrl());
    }
}
