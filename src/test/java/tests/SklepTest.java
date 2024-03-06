package tests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MyAccountPage;
import pages.MyCartPage;
import utils.Browser;
import utils.Settings;

public class SklepTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();
    MyCartPage myCartPage = new MyCartPage();

    @Test
    public void sklepTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Browser.getDriver().getCurrentUrl(), Settings.getBaseUrl(), "Main page is invalid");
        myAccountPage.openPage();
        softAssert.assertTrue(myAccountPage.getMyAccountText().isDisplayed(), "My Account page is not displayed correctly");
        myAccountPage.registerUser(Settings.getTestRegEmail(), Settings.getTestRegPassword());
        softAssert.assertTrue(myAccountPage.getAccountContent().getText().contains(myAccountPage.extractUserName()), "Register process failed");
        myCartPage.openPage();
        softAssert.assertTrue(myCartPage.getCartItems().isEmpty());
        myAccountPage.openPage();
        myAccountPage.logout();
        softAssert.assertEquals(Browser.getDriver().getCurrentUrl(), Settings.getBaseUrl(), "Logout is unsuccessful");
        softAssert.assertAll();
    }
}
