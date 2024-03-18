package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTests {

    @Test
    public void testRegistrationProcess() {
        homePage.verifyHomePageUrl()
                .clickAccount()
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
