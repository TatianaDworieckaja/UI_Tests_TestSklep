package tests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MyAccountAfterLoginPage;
import pages.MyAccountBeforeLoginPage;
import pages.MyCartPage;
import utils.ProjectProperties;

public class RegistrationTest extends BaseTests{

    @Test
    public  void testRegistrationProcess(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(webDriver.getCurrentUrl(), ProjectProperties.getBaseUrl(), "Main page is invalid");
        MyAccountBeforeLoginPage myAccountBeforeLoginPage = homePage.clickAccount();
        softAssert.assertTrue(myAccountBeforeLoginPage.getMyAccountText().contains("My Account"), "MyAccount page is displayed incorrectly");
        myAccountBeforeLoginPage.setUsername(ProjectProperties.getTestRegEmail());
        myAccountBeforeLoginPage.setPassword(ProjectProperties.getTestRegPassword());
        MyAccountAfterLoginPage myAccountAfterLoginPage = myAccountBeforeLoginPage.clickSubmitButton();
        softAssert.assertTrue(myAccountAfterLoginPage.isRegistered(),"Registration process failed");
        MyCartPage myCartPage = myAccountAfterLoginPage.clickMyCartLink();
        softAssert.assertTrue(myCartPage.getCartItems().isEmpty());
        myCartPage.clickAccountLink().logout();
        softAssert.assertEquals(webDriver.getCurrentUrl(), ProjectProperties.getBaseUrl(), "Logout is unsuccessful");

    }
}
