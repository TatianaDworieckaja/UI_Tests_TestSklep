package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MyAccountAfterLoginPage;
import pages.MyAccountBeforeLoginPage;
import pages.MyCartPage;
import utils.ProjectProperties;

public class RegistrationTest extends BaseTests {

    @Test
    public void testRegistrationProcess() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickAccount()
                .verifyMyAccountBeforeLoginPage()
                .registerUser()
                .verifyIfRegistered()
                .clickMyCartLink()
                .verifyCartIsEmpty()
                .continueToMyAccount()
                .logout()
                .verifyHomePageUrl();
    }
}
