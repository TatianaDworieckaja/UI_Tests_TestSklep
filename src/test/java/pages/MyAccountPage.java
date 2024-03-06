package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.Browser;
import utils.Settings;

public class MyAccountPage extends BasePage {

    private static final By LINK_TO_ACCOUNT_LOCATOR = By.linkText("Account");
    private static final By MY_ACCOUNT_TEXT_LOCATOR = By.cssSelector("h1");
    private static final By EMAIL_INPUT_LOCATOR = By.xpath("//input[@type = 'email']");
    private static final By PASSWORD_INPUT_LOCATOR = By.xpath("//input[@id = 'reg_password']");

    private static final By SUBMIT_BTN_LOCATOR = By.name("register");

    private static final By MY_ACCOUNT_CONTENT_LOCATOR = By.cssSelector(".woocommerce-MyAccount-content");
    private static final By LOGOUT_BTN_LOCATOR = By.xpath("//a[.='Logout']");
    private static final By CONFIRM_LOGOUT_LOCATOR = By.xpath("//a[.='Confirm and log out']");


    public void openPage() {
        getElement(LINK_TO_ACCOUNT_LOCATOR).click();
    }

    public WebElement getMyAccountText() {
        return getElement(MY_ACCOUNT_TEXT_LOCATOR);
    }

    public WebElement getEmailField() {
        return getElement(EMAIL_INPUT_LOCATOR);
    }

    public WebElement getPasswordField() {
        return getElement(PASSWORD_INPUT_LOCATOR);
    }

    public WebElement getSubmitBtn() {
        return getElement(SUBMIT_BTN_LOCATOR);
    }

    public WebElement getAccountContent() {
        return getElement(MY_ACCOUNT_CONTENT_LOCATOR);

    }


    public void registerUser(String emailAddress, String password) {
        JavascriptExecutor js = (JavascriptExecutor) Browser.getDriver();
        js.executeScript("arguments[0].value='" + emailAddress + "';", getEmailField());
        js.executeScript("arguments[0].value='" + password + "';", getPasswordField());
        js.executeScript("arguments[0].click();", getSubmitBtn());
    }

    public void logout() {
        getElement(LOGOUT_BTN_LOCATOR).click();
        getElement(CONFIRM_LOGOUT_LOCATOR).click();
    }

    public String extractUserName() {
        String testEmail = Settings.getTestRegEmail();
        char[] charArray = testEmail.toCharArray();
        StringBuilder userName = new StringBuilder();
        for (char element : charArray) {
            if (element != '@') {
                userName.append(element);
            } else {
                break;
            }
        }
        return userName.toString();
    }

}
